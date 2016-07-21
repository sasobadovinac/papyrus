/*****************************************************************************
 * Copyright (c) 2015, 2016 CEA LIST, Christian W. Damus, and others.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *  Camille Letavernier (CEA LIST) camille.letavernier@cea.fr - Initial API and implementation
 *  Christian W. Damus - bugs 496439, 461980, 496653, 498282
 *****************************************************************************/
package org.eclipse.papyrus.migration.rsa.tests.qvt;

import static org.hamcrest.CoreMatchers.instanceOf;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.hamcrest.MatcherAssert.assertThat;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;
import java.util.Queue;
import java.util.Spliterator;
import java.util.Spliterators;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IPath;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.gmf.runtime.diagram.core.util.ViewUtil;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.papyrus.infra.core.resource.ModelSet;
import org.eclipse.papyrus.infra.core.utils.ServiceUtils;
import org.eclipse.papyrus.infra.emf.utils.ServiceUtilsForEObject;
import org.eclipse.papyrus.infra.gmfdiag.common.model.NotationUtils;
import org.eclipse.papyrus.infra.gmfdiag.common.utils.DiagramUtils;
import org.eclipse.papyrus.infra.ui.editor.IMultiDiagramEditor;
import org.eclipse.papyrus.junit.framework.classification.tests.AbstractPapyrusTest;
import org.eclipse.papyrus.junit.utils.DisplayUtils;
import org.eclipse.papyrus.junit.utils.rules.HouseKeeper;
import org.eclipse.papyrus.migration.rsa.RSAToPapyrusParameters.Config;
import org.eclipse.papyrus.migration.rsa.RSAToPapyrusParameters.RSAToPapyrusParametersFactory;
import org.eclipse.papyrus.migration.rsa.transformation.DependencyAnalysisHelper;
import org.eclipse.papyrus.migration.rsa.transformation.ImportTransformation;
import org.eclipse.papyrus.migration.rsa.transformation.ImportTransformationLauncher;
import org.eclipse.papyrus.uml.tools.model.UmlModel;
import org.eclipse.uml2.uml.Package;
import org.hamcrest.BaseMatcher;
import org.hamcrest.Description;
import org.hamcrest.Matcher;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Rule;

import com.google.common.collect.Queues;

public class AbstractTransformationTest extends AbstractPapyrusTest {

	@Rule
	public final HouseKeeper houseKeeper = new HouseKeeper();

	public IProject project;

	public IFile mainModelFile;

	public IFile[] mainModelFiles;

	public Package rootPackage;

	public IMultiDiagramEditor editor;

	@Before
	public void createProject() {
		project = houseKeeper.createProject("org.eclipse.papyrus.migration.rsa.test.project");
	}

	protected void simpleImport(String modelToImportPath, String[] additionalResourcesPath, boolean useBatchLauncher) throws Exception {
		// Import the main model file
		mainModelFile = houseKeeper.createFile(project, modelToImportPath, modelToImportPath);

		// Import the fragments

		for (String path : additionalResourcesPath) {
			houseKeeper.createFile(project, path, path);
		}

		URI sourceURI = URI.createPlatformResourceURI(mainModelFile.getFullPath().toString(), true);

		if (useBatchLauncher) {
			Config config = RSAToPapyrusParametersFactory.eINSTANCE.createConfig();
			config.setAlwaysAcceptSuggestedMappings(true);
			config.setRemoveUnmappedProfilesAndStereotypes(true);

			ImportTransformationLauncher launcher = createTransformationLauncher(config);
			launcher.run(Collections.singletonList(sourceURI));

			launcher.waitForCompletion();

			Assert.assertTrue("The transformation didn't complete normally", launcher.getResult().isOK());
			checkResultFile(mainModelFile);
		} else {
			Config config = RSAToPapyrusParametersFactory.eINSTANCE.createConfig();
			config.setRemoveUnmappedProfilesAndStereotypes(true);

			ImportTransformation transformation = createTransformation(sourceURI, config, null);
			transformation.run(false);
			transformation.waitForCompletion();

			Assert.assertTrue("The transformation didn't complete normally", transformation.getStatus().isOK());
			checkResultFile(mainModelFile);
		}

	}

	protected void simpleImport(String modelToImportPath, String... additionalResourcesPath) throws Exception {
		simpleImport(modelToImportPath, additionalResourcesPath, false);
	}

	protected void openEditor() throws Exception {
		editor = houseKeeper.openPapyrusEditor(mainModelFile);
		ModelSet modelSet = ServiceUtils.getInstance().getModelSet(editor.getServicesRegistry());

		UmlModel umlModel = (UmlModel) modelSet.getModel(UmlModel.MODEL_ID);
		rootPackage = (Package) umlModel.getResource().getContents().get(0);
	}

	protected Diagram openDiagram(String name) throws Exception {
		Diagram result = getDiagram(name);
		ServiceUtilsForEObject.getInstance().getIPageManager(result).openPage(result);
		DisplayUtils.flushEventLoop();
		return result;
	}

	protected Diagram getDiagram(String name) throws Exception {
		List<Diagram> diagrams = getDiagrams();
		Diagram result = diagrams.stream()
				.filter(d -> name.equals(d.getName()))
				.findAny()
				.orElseThrow(AssertionError::new);
		return result;
	}

	protected List<Diagram> getDiagrams() throws Exception {
		ModelSet modelSet = ServiceUtils.getInstance().getModelSet(editor.getServicesRegistry());
		return StreamSupport.stream(NotationUtils.getAllNotations(modelSet).spliterator(), false)
				.filter(Diagram.class::isInstance).map(Diagram.class::cast)
				.collect(Collectors.toList());
	}

	protected void batchImport(String[] modelsToImportPath, String[] additionalResourcesPath) throws Exception {

		mainModelFiles = new IFile[modelsToImportPath.length];
		List<URI> urisToImport = new LinkedList<>();

		int i = 0;
		for (String mainModelPath : modelsToImportPath) {
			mainModelFiles[i] = houseKeeper.createFile(project, mainModelPath, mainModelPath);
			URI uri = URI.createPlatformResourceURI(mainModelFiles[i].getFullPath().toString(), true);

			urisToImport.add(uri);

			i++;
		}

		for (String path : additionalResourcesPath) {
			houseKeeper.createFile(project, path, path);
		}

		mainModelFile = mainModelFiles[0];

		Config config = RSAToPapyrusParametersFactory.eINSTANCE.createConfig();
		config.setMaxThreads(4);
		config.setAlwaysAcceptSuggestedMappings(true);
		config.setRemoveUnmappedProfilesAndStereotypes(true);

		ImportTransformationLauncher launcher = createTransformationLauncher(config);
		launcher.run(urisToImport);

		launcher.waitForCompletion();

		Assert.assertTrue("The transformation didn't complete normally", launcher.getResult().isOK());

		for (IFile sourceFile : mainModelFiles) {
			checkResultFile(sourceFile);
		}
	}

	private ImportTransformationLauncher createTransformationLauncher(Config config) {
		ImportTransformationLauncher result;

		final URI[] additionalTransformations = getAdditionalTransformations();
		if (additionalTransformations.length == 0) {
			result = new ImportTransformationLauncher(config);
		} else {
			// Append some more transformations to the chain
			result = new ImportTransformationLauncher(config) {
				@Override
				protected ImportTransformation createTransformation(URI transformationURI) {
					return AbstractTransformationTest.this.createTransformation(
							transformationURI, config, analysisHelper);
				}
			};
		}

		return result;
	}

	private ImportTransformation createTransformation(URI transformationURI, Config config, DependencyAnalysisHelper analysisHelper) {
		ImportTransformation result;

		final URI[] additionalTransformations = getAdditionalTransformations();
		if (additionalTransformations.length == 0) {
			result = new ImportTransformation(transformationURI, config, analysisHelper);
		} else {
			result = new ImportTransformation(transformationURI, config, analysisHelper) {
				@Override
				protected Collection<URI> getAdditionalTransformationURIs() {
					return Arrays.asList(additionalTransformations);
				}
			};
		}

		return result;
	}

	/**
	 * Obtains the URIs of zero or more additional transformations to append to the
	 * standard transformation chain.
	 * 
	 * @return additional transformations, or an empty array if none
	 */
	protected URI[] getAdditionalTransformations() {
		return new URI[0];
	}

	protected void checkResultFile(IFile sourceFile) {
		IPath targetPath;
		if ("emx".equals(sourceFile.getFullPath().getFileExtension())) {
			targetPath = sourceFile.getFullPath().removeFileExtension().addFileExtension("uml");
		} else if ("epx".equals(sourceFile.getFullPath().getFileExtension())) {
			targetPath = sourceFile.getFullPath().removeFileExtension().addFileExtension("profile.uml");
		} else {
			return;
		}

		IFile targetFile = ResourcesPlugin.getWorkspace().getRoot().getFile(targetPath);
		Assert.assertTrue(targetFile.exists());
	}

	protected void assertRSAModelsRemoved(boolean resolveAll) {
		EcoreUtil.resolveAll(rootPackage);

		// General test: After resolving everything, we should only have Papyrus resources in the scope
		for (Resource resource : rootPackage.eResource().getResourceSet().getResources()) {
			String fileExtension = resource.getURI().fileExtension();
			Assert.assertNotEquals("RSA resources should not be referenced anymore", "emx", fileExtension);
			Assert.assertNotEquals("RSA resources should not be referenced anymore", "efx", fileExtension);
			Assert.assertNotEquals("RSA Profiles should not be reference anymore", "epx", fileExtension);
		}
	}

	@SuppressWarnings("unchecked")
	protected EList<View> children(View view) {
		return view.getChildren();
	}

	protected View requireChild(View view, String type) {
		View result = ViewUtil.getChildBySemanticHint(view, type);
		assertThat("No child of type " + type, result, notNullValue());
		return result;
	}

	protected <T extends View> T requireChild(View view, String type, Class<T> ofClass) {
		View result = requireChild(view, type);
		assertThat(result, instanceOf(ofClass));
		return ofClass.cast(result);
	}

	protected Stream<EObject> streamAllContents(EObject object) {
		return StreamSupport.stream(Spliterators.spliteratorUnknownSize(
				object.eAllContents(),
				Spliterator.ORDERED | Spliterator.DISTINCT | Spliterator.NONNULL),
				false);
	}

	protected Stream<Diagram> diagramsOf(EObject object) {
		return DiagramUtils.getAssociatedDiagrams(object, null).stream();
	}

	@SafeVarargs
	protected final <T> Matcher<Iterable<? extends T>> containsInOrder(T... elements) {
		List<T> expected = Arrays.asList(elements);

		return new BaseMatcher<Iterable<? extends T>>() {
			@Override
			public void describeTo(Description description) {
				description.appendText("contains ")
						.appendValueList("(", ", ", ")", Arrays.asList(elements))
						.appendText(" in order");
			}

			@Override
			public boolean matches(Object item) {
				boolean result;

				if (!(item instanceof Iterable<?>)) {
					result = false;
				} else {
					Queue<T> queue = Queues.newArrayDeque(expected);
					Iterator<?> iter = ((Iterable<?>) item).iterator();
					for (T next = queue.peek(); (next != null) && iter.hasNext(); next = queue.peek()) {
						while (iter.hasNext()) {
							if (Objects.equals(iter.next(), next)) {
								// Matched the next in the expected order. Advance
								queue.remove();
								break;
							}
						}
					}

					// Did we find them all, in order?
					result = queue.isEmpty();
				}

				return result;
			}
		};


	}
}
