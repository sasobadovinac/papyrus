/*****************************************************************************
 * Copyright (c) 2014, 2018 CEA, Christian W. Damus, and others.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License 2.0
 * which accompanies this distribution, and is available at
 * https://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 *   Christian W. Damus (CEA) - Initial API and implementation
 *   Christian W. Damus - bugs 433206, 465416, 434983, 483721, 469188, 485220, 491542, 497865, 533673, 533682, 533676, 533679
 *   Thanh Liem PHAN (ALL4TEC) thanhliem.phan@all4tec.net - Bug 521550
 *****************************************************************************/
package org.eclipse.papyrus.junit.utils.rules;

import static org.hamcrest.CoreMatchers.instanceOf;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.Assert.fail;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.eclipse.core.commands.operations.IOperationHistory;
import org.eclipse.core.commands.operations.IOperationHistoryListener;
import org.eclipse.core.commands.operations.IUndoContext;
import org.eclipse.core.commands.operations.IUndoableOperation;
import org.eclipse.core.commands.operations.OperationHistoryEvent;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.Status;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.PositionConstants;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.e4.ui.model.application.ui.MUIElement;
import org.eclipse.e4.ui.model.application.ui.advanced.MPlaceholder;
import org.eclipse.e4.ui.model.application.ui.basic.MPart;
import org.eclipse.e4.ui.model.application.ui.basic.MPartSashContainerElement;
import org.eclipse.e4.ui.model.application.ui.basic.MPartStack;
import org.eclipse.e4.ui.model.application.ui.basic.MStackElement;
import org.eclipse.e4.ui.workbench.modeling.EModelService;
import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.workspace.IWorkspaceCommandStack;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartViewer;
import org.eclipse.gef.GraphicalEditPart;
import org.eclipse.gef.Request;
import org.eclipse.gef.RequestConstants;
import org.eclipse.gef.RootEditPart;
import org.eclipse.gef.requests.ChangeBoundsRequest;
import org.eclipse.gef.ui.palette.PaletteViewer;
import org.eclipse.gmf.runtime.diagram.core.preferences.PreferencesHint;
import org.eclipse.gmf.runtime.diagram.ui.editparts.DiagramEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IDiagramPreferenceSupport;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ShapeCompartmentEditPart;
import org.eclipse.gmf.runtime.diagram.ui.parts.DiagramEditor;
import org.eclipse.gmf.runtime.diagram.ui.parts.DiagramEditorWithFlyOutPalette;
import org.eclipse.gmf.runtime.diagram.ui.parts.IDiagramWorkbenchPart;
import org.eclipse.gmf.runtime.diagram.ui.requests.CreateViewRequest;
import org.eclipse.gmf.runtime.diagram.ui.requests.CreateViewRequest.ViewDescriptor;
import org.eclipse.gmf.runtime.diagram.ui.requests.CreateViewRequestFactory;
import org.eclipse.gmf.runtime.diagram.ui.requests.EditCommandRequestWrapper;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.papyrus.editor.PapyrusMultiDiagramEditor;
import org.eclipse.papyrus.infra.core.resource.ModelSet;
import org.eclipse.papyrus.infra.core.resource.sasheditor.DiModel;
import org.eclipse.papyrus.infra.core.sasheditor.editor.IComponentPage;
import org.eclipse.papyrus.infra.core.sasheditor.editor.IEditorPage;
import org.eclipse.papyrus.infra.core.sasheditor.editor.IPageVisitor;
import org.eclipse.papyrus.infra.core.sasheditor.editor.ISashWindowsContainer;
import org.eclipse.papyrus.infra.core.sashwindows.di.service.IPageManager;
import org.eclipse.papyrus.infra.core.services.ServiceException;
import org.eclipse.papyrus.infra.core.services.ServicesRegistry;
import org.eclipse.papyrus.infra.core.utils.ServiceUtils;
import org.eclipse.papyrus.infra.gmfdiag.common.model.NotationModel;
import org.eclipse.papyrus.infra.gmfdiag.common.service.palette.AspectUnspecifiedTypeCreationTool;
import org.eclipse.papyrus.infra.gmfdiag.common.utils.DiagramEditPartsUtil;
import org.eclipse.papyrus.infra.nattable.common.editor.AbstractEMFNattableEditor;
import org.eclipse.papyrus.infra.nattable.common.modelresource.PapyrusNattableModel;
import org.eclipse.papyrus.infra.nattable.manager.table.INattableModelManager;
import org.eclipse.papyrus.infra.nattable.model.nattable.Table;
import org.eclipse.papyrus.infra.tools.util.PlatformHelper;
import org.eclipse.papyrus.infra.tools.util.TypeUtils;
import org.eclipse.papyrus.infra.ui.editor.IMultiDiagramEditor;
import org.eclipse.papyrus.junit.matchers.CommandMatchers;
import org.eclipse.papyrus.junit.utils.CommandUtils;
import org.eclipse.papyrus.junit.utils.EditorUtils;
import org.eclipse.papyrus.junit.utils.JUnitUtils;
import org.eclipse.papyrus.junit.utils.tests.AbstractEditorTest;
import org.eclipse.papyrus.uml.tools.model.UmlModel;
import org.eclipse.papyrus.views.modelexplorer.ModelExplorerPage;
import org.eclipse.papyrus.views.modelexplorer.ModelExplorerPageBookView;
import org.eclipse.papyrus.views.modelexplorer.ModelExplorerView;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.MouseEvent;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Event;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IEditorReference;
import org.eclipse.ui.IPartListener;
import org.eclipse.ui.IPerspectiveDescriptor;
import org.eclipse.ui.ISaveablePart;
import org.eclipse.ui.IViewPart;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.part.IPage;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.UMLPackage;
import org.junit.runner.Description;
import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;

import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Iterables;
import com.google.common.collect.Iterators;
import com.google.common.collect.ListMultimap;
import com.google.common.collect.Lists;


/**
 * A fixture that presents editors on a model specified via an annotation as for {@link ProjectFixture}. The editor is closed automatically upon
 * completion of the test.
 */
public class PapyrusEditorFixture extends AbstractModelFixture<TransactionalEditingDomain> {
	private static boolean DUMP_COMMANDS = Boolean.getBoolean("dump.commands"); //$NON-NLS-1$

	private final Collection<IEditorPart> editorsToClose = Lists.newArrayList();

	private final List<String> excludedTypeView = Arrays.asList(new String[] { "Note" });

	private final boolean ensureOperationHistoryIntegrity;

	@SuppressWarnings("restriction")
	private org.eclipse.papyrus.infra.ui.internal.preferences.YesNo initialEditorLayoutStorageMigrationPreference;

	private IMultiDiagramEditor editor;

	private DiagramEditorWithFlyOutPalette activeDiagramEditor;

	private AbstractEMFNattableEditor activeTableEditor;

	private ModelExplorerView modelExplorer;

	private Class<?> testClass;

	private Description testDescription;

	private Collection<IViewPart> viewsToClose;

	private ListMultimap<Description, IFile> modelFiles;

	private IOperationHistoryListener operationHistoryIntegrityListener;
	private IOperationHistory operationHistory;

	/**
	 * Initializes me with the assurance of undo/redo correspondence in the
	 * diagram and EMF views of the command history.
	 */
	public PapyrusEditorFixture() {
		this(true);
	}

	/**
	 * Initializes me with the option to ensure integrity of the operation history
	 * by listening for command execution in the diagram context and, if an operation
	 * executed in the diagram does not have the editing-domain context, adds that
	 * context. This ensures that the diagram editor and the model explorer, for
	 * example, see the same undo/redo history (which they would not if some
	 * diagram-only commands were only in the diagram's history). Some tests do
	 * need to suppress this convenience in order to accurately represent the
	 * normal Papyrus run-time environment.
	 *
	 * @param ensureOperationHistoryIntegrity
	 *
	 * @since 2.0
	 */
	public PapyrusEditorFixture(boolean ensureOperationHistoryIntegrity) {
		super();

		this.ensureOperationHistoryIntegrity = ensureOperationHistoryIntegrity;
	}

	/**
	 * @since 2.0
	 */
	public IMultiDiagramEditor getEditor() {
		return editor;
	}

	/**
	 * @since 2.0
	 */
	public IMultiDiagramEditor getEditor(String path) {
		IMultiDiagramEditor result = null;

		final String fileName = new Path(path).lastSegment();
		for (IEditorReference next : getWorkbenchPage().getEditorReferences()) {
			if (PapyrusMultiDiagramEditor.EDITOR_ID.equals(next.getId()) && fileName.equals(next.getName())) {
				result = (IMultiDiagramEditor) next.getEditor(true);
			}
		}

		return result;
	}

	@SuppressWarnings("restriction")
	@Override
	protected void starting(Description description) {
		testClass = description.getTestClass();
		testDescription = description;

		// Ensure that we won't see a dialog prompting the user to migrate page layout
		// storage from the DI file to the workspace-private sash file
		initialEditorLayoutStorageMigrationPreference = org.eclipse.papyrus.infra.ui.internal.preferences.EditorPreferences.getInstance().getConvertSharedPageLayoutToPrivate();
		org.eclipse.papyrus.infra.ui.internal.preferences.EditorPreferences.getInstance().setConvertSharedPageLayoutToPrivate(org.eclipse.papyrus.infra.ui.internal.preferences.YesNo.NO);

		if (hasRequiredViews()) {
			openRequiredViews();
		}

		modelFiles = ArrayListMultimap.create();
		openAll(description);

		ActiveDiagram activeDiagram = JUnitUtils.getAnnotation(description, ActiveDiagram.class);
		if (activeDiagram != null) {
			String name = activeDiagram.value();
			activateDiagram(name);
			if ((activeDiagramEditor == null) || !name.equals(getActiveDiagramEditor().getDiagram().getName())) {
				// OK, we need to open it, then
				openDiagram(name);
			}
		} else {
			ActiveTable activeTable = JUnitUtils.getAnnotation(description, ActiveTable.class);
			if (activeTable != null) {
				String name = activeTable.value();
				activateTable(name);
				if ((activeTableEditor == null) || !name.equals(getActiveTableEditor().getTable().getName())) {
					openTable(name);
				}
			}
		}

		super.starting(description);

		if (ensureOperationHistoryIntegrity) {
			// Ensure consistency of undo/redo with EMF operations
			final IWorkspaceCommandStack stack = (IWorkspaceCommandStack) getEditingDomain().getCommandStack();
			final IUndoContext emfContext = stack.getDefaultUndoContext();
			operationHistory = stack.getOperationHistory();
			operationHistoryIntegrityListener = new IOperationHistoryListener() {
				@Override
				public void historyNotification(OperationHistoryEvent event) {
					if (DUMP_COMMANDS && (event.getEventType() == OperationHistoryEvent.ABOUT_TO_EXECUTE)) {
						System.err.println(">> Executing command"); //$NON-NLS-1$
						CommandUtils.dump(event.getOperation());
						System.err.println();
					}
					if ((event.getEventType() == OperationHistoryEvent.DONE) && (activeDiagramEditor != null)) {
						IUndoContext diagramContext = activeDiagramEditor.getDiagramEditDomain().getDiagramCommandStack().getUndoContext();
						if (diagramContext != null) {
							IUndoableOperation undo = event.getOperation();
							if ((undo != null) && !undo.hasContext(emfContext)) {
								undo.addContext(emfContext);
							}
						}
					}
					// nothing to do for table
				}
			};
			operationHistory.addOperationHistoryListener(operationHistoryIntegrityListener);
		}
	}

	@SuppressWarnings("restriction")
	@Override
	protected void finished(Description description) {
		try {
			modelFiles = null;

			Exception exception = null;

			for (IEditorPart editor : ImmutableList.copyOf(editorsToClose)) {
				try {
					close(editor);
				} catch (Exception e) {
					if (exception == null) {
						exception = e;
					}
				}
			}

			if (exception != null) {
				exception.printStackTrace();
				fail("Failed to close an editor: " + exception.getLocalizedMessage());
			}
		} finally {
			try {
				if (operationHistoryIntegrityListener != null) {
					operationHistory.removeOperationHistoryListener(operationHistoryIntegrityListener);
					operationHistoryIntegrityListener = null;
					operationHistory = null;
				}

			} finally {
				editorsToClose.clear();
				editor = null;
				activeDiagramEditor = null;

				org.eclipse.papyrus.infra.ui.internal.preferences.EditorPreferences.getInstance().setConvertSharedPageLayoutToPrivate(initialEditorLayoutStorageMigrationPreference);

				try {
					if (hasRequiredViews()) {
						closeRequiredViews();
					}
				} finally {
					super.finished(description);
				}
			}
		}
	}

	@Override
	public TransactionalEditingDomain getEditingDomain() {
		TransactionalEditingDomain result = null;

		if (editor != null) {
			result = getEditingDomain(editor);
		}

		return result;
	}

	/**
	 * @since 2.0
	 */
	public TransactionalEditingDomain getEditingDomain(IMultiDiagramEditor editor) {
		TransactionalEditingDomain result = null;

		try {
			result = getServiceRegistry(editor).getService(TransactionalEditingDomain.class);
		} catch (ServiceException e) {
			e.printStackTrace();
			fail("Failed to get editing domain from Papyrus editor: " + e.getLocalizedMessage());
		}

		return result;
	}

	@Override
	protected TransactionalEditingDomain createEditingDomain() {
		// We don't create the domain; the editor does
		return null;
	}

	/**
	 * @since 2.0
	 */
	protected IMultiDiagramEditor open(final IFile modelFile) {
		final boolean firstEditor = editorsToClose.isEmpty();

		Display.getDefault().syncExec(new Runnable() {

			@Override
			public void run() {
				try {
					editor = EditorUtils.openPapyrusEditor(modelFile);
					editorsToClose.add(editor);
				} catch (Exception e) {
					e.printStackTrace();
					fail("Failed to open Papyrus editor: " + e.getLocalizedMessage());
				}
			}
		});

		if (firstEditor && !editorsToClose.isEmpty()) {
			final IWorkbenchPage page = editor.getSite().getPage();
			page.addPartListener(new IPartListener() {

				@Override
				public void partClosed(IWorkbenchPart part) {
					editorsToClose.remove(part);

					if (part == editor) {
						editor = null;
					}

					if (editorsToClose.isEmpty()) {
						page.removePartListener(this);
					}
				}

				@Override
				public void partOpened(IWorkbenchPart part) {
					// Pass
				}

				@Override
				public void partDeactivated(IWorkbenchPart part) {
					// Pass
				}

				@Override
				public void partBroughtToTop(IWorkbenchPart part) {
					// Pass
				}

				@Override
				public void partActivated(IWorkbenchPart part) {
					// Pass
				}
			});
		}

		flushDisplayEvents();

		return editor;
	}

	/**
	 * @since 2.0
	 */
	protected IMultiDiagramEditor openOne(Description description) {
		IFile papyrusModel = getProject().getFile(Iterables.getOnlyElement(initModelResources(description)).getURI().trimFileExtension().appendFileExtension(DiModel.DI_FILE_EXTENSION));
		modelFiles.put(description, papyrusModel);
		return open(papyrusModel);
	}

	protected Iterable<IMultiDiagramEditor> openAll(Description description) {
		List<IMultiDiagramEditor> result = Lists.newArrayList();

		for (Resource resource : initModelResources(description)) {
			if (resource.getURI().fileExtension().equals(UmlModel.UML_FILE_EXTENSION)) {
				IFile papyrusModel = getProject().getFile(resource.getURI().trimFileExtension().appendFileExtension(DiModel.DI_FILE_EXTENSION));
				modelFiles.put(description, papyrusModel);
				result.add(open(papyrusModel));
			}
		}

		return result;
	}

	/**
	 * @since 2.0
	 */
	protected IMultiDiagramEditor reopenOne(Description description) {
		IFile papyrusModel = modelFiles.get(description).get(0);
		return open(papyrusModel);
	}

	/**
	 * @since 2.0
	 */
	public IMultiDiagramEditor open() {
		return openOne(testDescription);
	}

	/**
	 * @since 2.0
	 */
	public IMultiDiagramEditor open(String resourcePath) {
		return open(new Path(resourcePath).removeFileExtension().lastSegment(), ResourceKind.BUNDLE, resourcePath);
	}

	/**
	 * @since 2.0
	 */
	public IMultiDiagramEditor open(String targetPath, String resourcePath) {
		return open(targetPath, ResourceKind.BUNDLE, resourcePath);
	}

	/**
	 * @since 2.0
	 */
	public IMultiDiagramEditor open(String targetPath, ResourceKind resourceKind, String resourcePath) {
		final IFile papyrusModel = getProject().getFile(initModelResource(targetPath, resourceKind, resourcePath).getURI().trimFileExtension().appendFileExtension(DiModel.DI_FILE_EXTENSION));
		return open(papyrusModel);
	}

	/**
	 * Reopens the same test model that was previously {@link #open() opened} and the
	 * subsequently {@link #close() closed}. This is an important disction, as simply
	 * {@link #open() opening} the test model again would actually re-initialize it from
	 * the deployed test resources, potentially replacing any changes in the model files
	 * that may be significant to the test.
	 *
	 * @return the re-opened editor
	 * @since 2.0
	 */
	public IMultiDiagramEditor reopen() {
		return reopenOne(testDescription);
	}

	public void activate() {
		if (editor != null) {
			activate(editor);
		}
	}

	public void activate(IWorkbenchPart part) {
		IWorkbenchPage page = part.getSite().getPage();

		if (page.getActivePart() != part) {
			page.activate(part);
			flushDisplayEvents();
		}
	}

	public void close() {
		if (editor != null) {
			close(editor);
			editor = null;
		}
	}

	public void close(IEditorPart editor) {
		if(null != editor.getSite() && null != editor.getSite().getPage()) {
			editor.getSite().getPage().closeEditor(editor, false);
			flushDisplayEvents();
		}
	}

	public ModelExplorerView getModelExplorerView() {

		Display.getDefault().syncExec(new Runnable() {

			@Override
			public void run() {
				ModelExplorerPageBookView view;
				try {
					view = (ModelExplorerPageBookView) getWorkbenchPage().showView(AbstractEditorTest.MODELEXPLORER_VIEW_ID);
				} catch (PartInitException e) {
					e.printStackTrace();
					return;
				}

				IPage currentPage = view.getCurrentPage();
				ModelExplorerPage page = (ModelExplorerPage) currentPage;
				IViewPart viewer = page.getViewer();
				modelExplorer = (ModelExplorerView) viewer;
			}
		});

		return modelExplorer;
	}

	protected final IWorkbenchPage getWorkbenchPage() {
		IWorkbench bench = PlatformUI.getWorkbench();
		IWorkbenchWindow window = bench.getActiveWorkbenchWindow();
		if (window == null) {
			window = bench.getWorkbenchWindows()[0];
		}
		return window.getActivePage();
	}

	public ServicesRegistry getServiceRegistry() {
		return getServiceRegistry(editor);
	}

	/**
	 * @since 2.0
	 */
	public ServicesRegistry getServiceRegistry(IMultiDiagramEditor editor) {
		return editor.getServicesRegistry();
	}

	public ModelSet getModelSet() {
		return getModelSet(editor);
	}

	/**
	 * @since 2.0
	 */
	public ModelSet getModelSet(IMultiDiagramEditor editor) {
		try {
			return getServiceRegistry(editor).getService(ModelSet.class);
		} catch (ServiceException e) {
			e.printStackTrace();
			fail("Failed to get model set from Papyrus editor: " + e.getLocalizedMessage());
			return null; // Unreachable
		}
	}

	@Override
	public Package getModel() {
		return getModel(editor);
	}

	/**
	 * @since 2.0
	 */
	public Package getModel(IMultiDiagramEditor editor) {
		Package result = null;

		ModelSet modelSet = getModelSet(editor);
		UmlModel uml = (UmlModel) modelSet.getModel(UmlModel.MODEL_ID);
		assertThat("No UML model present in resource set", uml.getResource(), notNullValue());

		result = (Package) EcoreUtil.getObjectByType(uml.getResource().getContents(), UMLPackage.Literals.PACKAGE);
		assertThat("Model resource contains no UML Package", result, notNullValue());

		return result;
	}

	/**
	 * @since 2.0
	 */
	public IPageManager getPageManager() {
		return getPageManager(editor);
	}

	/**
	 * @since 2.0
	 */
	public IPageManager getPageManager(IMultiDiagramEditor editor) {
		try {
			return getServiceRegistry(editor).getService(IPageManager.class);
		} catch (ServiceException e) {
			e.printStackTrace();
			fail("Failed to get page manager from Papyrus editor: " + e.getLocalizedMessage());
			return null; // Unreachable
		}
	}

	public PapyrusEditorFixture activateDiagram(String name) {
		return activateDiagram(editor, name);
	}

	public PapyrusEditorFixture activateTable(String name) {
		return activateTable(editor, name);
	}

	/**
	 * @since 2.0
	 */
	public PapyrusEditorFixture activateDiagram(IMultiDiagramEditor editor, final String name) {
		activate(editor);

		final ISashWindowsContainer sashContainer = PlatformHelper.getAdapter(editor, ISashWindowsContainer.class);
		final org.eclipse.papyrus.infra.core.sasheditor.editor.IPage[] select = { null };

		sashContainer.visit(new IPageVisitor() {

			@Override
			public void accept(IEditorPage page) {
				if (name.equals(page.getPageTitle()) && (page.getIEditorPart() instanceof DiagramEditorWithFlyOutPalette)) {
					select[0] = page;
					setActiveDiagramEditor((DiagramEditorWithFlyOutPalette) page.getIEditorPart());
				}
			}

			@Override
			public void accept(IComponentPage page) {
				// Pass
			}
		});

		if (select[0] != null) {
			sashContainer.selectPage(select[0]);
			flushDisplayEvents();
		}

		return this;
	}

	/**
	 * @since 2.0
	 */
	public PapyrusEditorFixture activateTable(IMultiDiagramEditor editor, final String name) {
		activate(editor);

		final ISashWindowsContainer sashContainer = PlatformHelper.getAdapter(editor, ISashWindowsContainer.class);
		final org.eclipse.papyrus.infra.core.sasheditor.editor.IPage[] select = { null };

		sashContainer.visit(new IPageVisitor() {

			@Override
			public void accept(IEditorPage page) {
				if (name.equals(page.getPageTitle()) && (page.getIEditorPart() instanceof AbstractEMFNattableEditor)) {
					select[0] = page;
					setActiveTableEditor((AbstractEMFNattableEditor) page.getIEditorPart());
				}
			}

			@Override
			public void accept(IComponentPage page) {
				// Pass
			}
		});

		if (select[0] != null) {
			sashContainer.selectPage(select[0]);
			flushDisplayEvents();
		}

		return this;
	}

	private void setActiveDiagramEditor(DiagramEditorWithFlyOutPalette editor) {
		activeDiagramEditor = editor;
		activeTableEditor = null;
	}

	private void setActiveTableEditor(AbstractEMFNattableEditor editor) {
		activeTableEditor = editor;
		activeDiagramEditor = null;
	}

	public PapyrusEditorFixture activateDiagram(DiagramEditPart diagram) {
		return activateDiagram(editor, diagram);
	}

	/**
	 * @since 2.0
	 */
	public PapyrusEditorFixture activateDiagram(IMultiDiagramEditor editor, final DiagramEditPart diagram) {
		activate(editor);

		final ISashWindowsContainer sashContainer = PlatformHelper.getAdapter(editor, ISashWindowsContainer.class);
		final org.eclipse.papyrus.infra.core.sasheditor.editor.IPage[] select = { null };

		sashContainer.visit(new IPageVisitor() {

			@Override
			public void accept(IEditorPage page) {
				DiagramEditorWithFlyOutPalette nested = TypeUtils.as(page.getIEditorPart(), DiagramEditorWithFlyOutPalette.class);
				if ((nested != null) && (nested.getDiagramEditPart() == diagram)) {
					select[0] = page;
					setActiveDiagramEditor(nested);
				}
			}

			@Override
			public void accept(IComponentPage page) {
				// Pass
			}
		});

		if (select[0] != null) {
			sashContainer.selectPage(select[0]);
			flushDisplayEvents();
		}

		return this;
	}

	public PapyrusEditorFixture openDiagram(String name) {
		return openDiagram(editor, name);
	}

	public PapyrusEditorFixture openTable(String name) {
		return openTable(editor, name);
	}

	/**
	 * @since 2.0
	 */
	public PapyrusEditorFixture openDiagram(IMultiDiagramEditor editor, final String name) {
		activate(editor);

		try {
			ModelSet modelSet = ServiceUtils.getInstance().getModelSet(editor.getServicesRegistry());
			NotationModel notation = (NotationModel) modelSet.getModel(NotationModel.MODEL_ID);
			Diagram diagram = notation.getDiagram(name);
			ServiceUtils.getInstance().getService(IPageManager.class, editor.getServicesRegistry()).openPage(diagram);
			flushDisplayEvents();

			activateDiagram(editor, name);
		} catch (Exception e) {
			throw new IllegalStateException("Cannot initialize test", e);
		}

		return this;
	}

	/**
	 * @since 2.0
	 */
	public PapyrusEditorFixture openTable(IMultiDiagramEditor editor, final String name) {
		activate(editor);

		try {
			ModelSet modelSet = ServiceUtils.getInstance().getModelSet(editor.getServicesRegistry());
			PapyrusNattableModel notation = (PapyrusNattableModel) modelSet.getModel(PapyrusNattableModel.MODEL_ID);
			Table table = notation.getTable(name);
			ServiceUtils.getInstance().getService(IPageManager.class, editor.getServicesRegistry()).openPage(table);
			flushDisplayEvents();

			activateTable(editor, name);
		} catch (Exception e) {
			throw new IllegalStateException("Cannot initialize test", e); // NON-NLS-1
		}

		return this;
	}

	public String closeDiagram() {
		String result = getActiveDiagramEditor().getDiagram().getName();
		closeDiagram(editor, result);
		return result;
	}

	public PapyrusEditorFixture closeDiagram(String name) {
		return closeDiagram(editor, name);
	}

	/**
	 * @since 2.0
	 */
	public PapyrusEditorFixture closeDiagram(IMultiDiagramEditor editor, final String name) {
		try {
			ModelSet modelSet = ServiceUtils.getInstance().getModelSet(editor.getServicesRegistry());
			NotationModel notation = (NotationModel) modelSet.getModel(NotationModel.MODEL_ID);
			Diagram diagram = notation.getDiagram(name);

			// If the diagram was deleted, then so too was its page
			if (diagram != null) {
				ServiceUtils.getInstance().getService(IPageManager.class, editor.getServicesRegistry()).closePage(diagram);
				flushDisplayEvents();
			}
		} catch (Exception e) {
			throw new IllegalStateException("Cannot close diagram", e);
		}

		return this;
	}

	public DiagramEditorWithFlyOutPalette getActiveDiagramEditor() {
		DiagramEditorWithFlyOutPalette result = activeDiagramEditor;

		if (result == null) {
			IEditorPart activeEditor = getWorkbenchPage().getActiveEditor();
			if (activeEditor instanceof IMultiDiagramEditor) {
				activeEditor = ((IMultiDiagramEditor) activeEditor).getActiveEditor();
				if (activeEditor instanceof DiagramEditorWithFlyOutPalette) {
					result = (DiagramEditorWithFlyOutPalette) activeEditor;
					setActiveDiagramEditor(result);
				}
			}
		}

		assertThat("No diagram active", result, notNullValue());

		return result;
	}

	public AbstractEMFNattableEditor getActiveTableEditor() {
		AbstractEMFNattableEditor result = activeTableEditor;

		if (result == null) {
			IEditorPart activeEditor = getWorkbenchPage().getActiveEditor();
			if (activeEditor instanceof IMultiDiagramEditor) {
				activeEditor = ((IMultiDiagramEditor) activeEditor).getActiveEditor();
				if (activeEditor instanceof AbstractEMFNattableEditor) {
					result = (AbstractEMFNattableEditor) activeEditor;
					setActiveTableEditor(result);
				}
			}
		}

		assertThat("No table active", result, notNullValue());

		return result;
	}

	public DiagramEditPart getActiveDiagram() {
		return getActiveDiagramEditor().getDiagramEditPart();
	}

	public INattableModelManager getActiveTableManager() {
		return (INattableModelManager) getActiveTableEditor().getAdapter(INattableModelManager.class);
	}

	public DiagramEditPart getDiagram(String name) {
		return getDiagram(editor, name);
	}

	/**
	 * @since 2.0
	 */
	public DiagramEditPart getDiagram(IMultiDiagramEditor editor, final String name) {
		final ISashWindowsContainer sashContainer = PlatformHelper.getAdapter(editor, ISashWindowsContainer.class);
		final org.eclipse.papyrus.infra.core.sasheditor.editor.IPage[] matchedPage = { null };

		sashContainer.visit(new IPageVisitor() {

			@Override
			public void accept(IEditorPage page) {
				if (name.equals(page.getPageTitle()) && (page.getIEditorPart() instanceof DiagramEditorWithFlyOutPalette)) {
					matchedPage[0] = page;
				}
			}

			@Override
			public void accept(IComponentPage page) {
				// Pass
			}
		});

		IEditorPage editorPage = TypeUtils.as(matchedPage[0], IEditorPage.class);
		IDiagramWorkbenchPart diagramPart = (editorPage == null) ? null : TypeUtils.as(editorPage.getIEditorPart(), IDiagramWorkbenchPart.class);

		// The lazy initialization, used in the patch for bug 519107, does not initialize the diagram edit part of UmlGmfDiagramEditor
		// So we call the setFocus method here to initialize it manually (see patch for bug 521353)
		if (null != diagramPart) {
			if (null == diagramPart.getDiagramEditPart()) {
				diagramPart.setFocus();
			}
			return diagramPart.getDiagramEditPart();
		}
		return null;
	}

	public EditPart findEditPart(EObject modelElement) {
		return findEditPart(getActiveDiagramEditor(), modelElement);
	}

	/**
	 * @since 2.0
	 */
	public EditPart findEditPart(IMultiDiagramEditor editor, EObject modelElement) {
		IEditorPart activeEditor = editor.getActiveEditor();
		assertThat("No diagram active", activeEditor, instanceOf(DiagramEditor.class));
		return findEditPart((DiagramEditor) activeEditor, modelElement);
	}

	public EditPart findEditPart(IDiagramWorkbenchPart editor, EObject modelElement) {
		DiagramEditPart diagram = editor.getDiagramEditPart();
		return findEditPart(diagram, modelElement);
	}

	/**
	 * Get the shape compartment of an edit-part. Fails if the edit-part has no
	 * shape compartment.
	 *
	 * @param shapeEditPart
	 *            a shape edit part
	 * @return its shape compartment
	 *
	 * @since 2.2
	 */
	public EditPart getShapeCompartment(EditPart shapeEditPart) {
		return stream(shapeEditPart.getChildren(), EditPart.class)
				.filter(ShapeCompartmentEditPart.class::isInstance)
				.findFirst().orElseGet(failOnAbsence("No shape compartment"));
	}

	/**
	 * Obtain a typed stream over a raw-typed collection from a legacy pre-generics API
	 * such as GEF.
	 *
	 * @param rawCollection
	 *            a raw-typed collection
	 * @param type
	 *            the expected element type of the collection
	 * @return the typed stream
	 */
	private static <T> Stream<T> stream(@SuppressWarnings("rawtypes") Collection rawCollection, Class<T> type) {
		return ((Collection<?>) rawCollection).stream()
				.filter(type::isInstance).map(type::cast);
	}

	/**
	 * Obtain a fake supplier that just fails the test with the given {@code message}
	 * instead of supplying a result.
	 *
	 * @param message
	 *            the failure message
	 * @return the fake supplier
	 */
	private static <T> Supplier<T> failOnAbsence(String message) {
		return () -> {
			fail(message);
			return null;
		};
	}

	/**
	 * Find orphan edit part with a type.
	 *
	 * @param type
	 *            the type
	 * @return the edits the part
	 */
	public EditPart findOrphanEditPart(String type) {
		IDiagramWorkbenchPart activeEditor = (IDiagramWorkbenchPart) editor.getActiveEditor();
		EditPart result = null;
		for (Iterator<View> views = Iterators.filter(activeEditor.getDiagram().eAllContents(), View.class); views.hasNext();) {
			View next = views.next();
			EObject element = next.getElement();
			if (element == null && type.equals(next.getType())) {
				result = (EditPart) activeEditor.getDiagramGraphicalViewer().getEditPartRegistry().get(next);
				break;
			}
		}

		return result;

	}

	/**
	 * Find orphan edit part.
	 *
	 * @return the edits the part
	 */
	public EditPart findOrphanEditPart() {
		IDiagramWorkbenchPart activeEditor = (IDiagramWorkbenchPart) editor.getActiveEditor();
		EditPart result = null;
		for (Iterator<View> views = Iterators.filter(activeEditor.getDiagram().eAllContents(), View.class); views.hasNext();) {
			View next = views.next();

			String type = next.getType();
			EObject element = next.getElement();

			if (element == null && !excludedTypeView.contains(type)) {
				result = (EditPart) activeEditor.getDiagramGraphicalViewer().getEditPartRegistry().get(next);
				break;
			}
		}

		return result;

	}

	/**
	 * Find an edit-part for a model element in a particular {@code scope}.
	 *
	 * @param scope
	 *            an edit part in which to search (its children) for an edit-part
	 * @param modelElement
	 *            the model element visualized by the edit-part to search for
	 *
	 * @return the matching edit-part, or {@code null} if none is found in the {@code scope}
	 */
	public EditPart findEditPart(EditPart scope, EObject modelElement) {
		EditPart result = null;

		View view = PlatformHelper.getAdapter(scope, View.class);
		if ((view != null) && (view.getElement() == modelElement)) {
			result = scope;
		}

		if (result == null) {
			// Search children
			for (Iterator<?> iter = scope.getChildren().iterator(); (result == null) && iter.hasNext();) {
				result = findEditPart((EditPart) iter.next(), modelElement);
			}
		}

		if ((result == null) && (scope instanceof GraphicalEditPart)) {
			// Search edges
			for (Iterator<?> iter = ((GraphicalEditPart) scope).getSourceConnections().iterator(); (result == null) && iter.hasNext();) {
				result = findEditPart((EditPart) iter.next(), modelElement);
			}
			if (result == null) {
				for (Iterator<?> iter = ((GraphicalEditPart) scope).getTargetConnections().iterator(); (result == null) && iter.hasNext();) {
					result = findEditPart((EditPart) iter.next(), modelElement);
				}
			}
		}

		return result;
	}

	/**
	 * Require an edit-part for a model element in a particular {@code scope}.
	 *
	 * @param scope
	 *            an edit part in which to search (its children) for an edit-part
	 * @param modelElement
	 *            the model element visualized by the edit-part to search for
	 *
	 * @return the matching edit-part
	 *
	 * @throws AssertionError
	 *             if the required edit-part is found in the {@code scope}
	 */
	public EditPart requireEditPart(EditPart scope, EObject modelElement) {
		EditPart result = findEditPart(scope, modelElement);
		if (result == null) {
			String label = getLabel(modelElement);
			fail(String.format("No edit-part found for \"%s\" in %s", label, scope));
		}
		return result;
	}

	public String getLabel(EObject object) {
		String result = null;

		try {
			EditingDomain domain = ServiceUtils.getInstance().getTransactionalEditingDomain(editor.getServicesRegistry());
			if (domain instanceof AdapterFactoryEditingDomain) {
				IItemLabelProvider labels = (IItemLabelProvider) ((AdapterFactoryEditingDomain) domain).getAdapterFactory().adapt(object, IItemLabelProvider.class);
				if (labels != null) {
					result = labels.getText(object);
				}
			}
		} catch (ServiceException e) {
			// Doesn't matter
		}

		if (result == null) {
			result = String.valueOf(object);
		}

		return result;
	}

	public EditPart findEditPart(String name, Class<? extends NamedElement> type) {
		return findEditPart(getActiveDiagramEditor(), name, type);
	}

	/**
	 * @since 2.0
	 */
	public EditPart findEditPart(IMultiDiagramEditor editor, String name, Class<? extends NamedElement> type) {
		IEditorPart activeEditor = editor.getActiveEditor();
		assertThat("No diagram active", activeEditor, instanceOf(DiagramEditor.class));
		return findEditPart((DiagramEditor) activeEditor, name, type);
	}

	public EditPart findEditPart(IDiagramWorkbenchPart editor, String name, Class<? extends NamedElement> type) {
		EditPart result = null;

		for (Iterator<View> views = Iterators.filter(editor.getDiagram().eAllContents(), View.class); views.hasNext();) {
			View next = views.next();
			EObject element = next.getElement();
			if (type.isInstance(element) && name.equals(type.cast(element).getName())) {
				result = (EditPart) editor.getDiagramGraphicalViewer().getEditPartRegistry().get(next);
				break;
			}
		}

		return result;
	}

	public void select(EditPart editPart) {
		editPart.getViewer().getSelectionManager().appendSelection(editPart);
	}

	public void deselect(EditPart editPart) {
		editPart.getViewer().getSelectionManager().deselect(editPart);
	}

	public void move(GraphicalEditPart editPart, Point newLocation) {
		ChangeBoundsRequest move = new ChangeBoundsRequest(RequestConstants.REQ_MOVE);
		IFigure figure = editPart.getFigure();
		Rectangle bounds = figure.getBounds();
		move.setEditParts(editPart);
		move.setConstrainedMove(false);
		move.setMoveDelta(at(newLocation.x() - bounds.x(), newLocation.y() - bounds.y()));
		execute(editPart.getCommand(move));
	}

	public void resize(GraphicalEditPart editPart, Dimension newSize) {
		ChangeBoundsRequest resize = new ChangeBoundsRequest(RequestConstants.REQ_RESIZE);
		IFigure figure = editPart.getFigure();
		Rectangle bounds = figure.getBounds();
		resize.setEditParts(editPart);
		resize.setResizeDirection(PositionConstants.SOUTH_WEST);
		resize.setCenteredResize(false);
		resize.setConstrainedResize(false);
		resize.setSizeDelta(sized(newSize.width() - bounds.width(), newSize.height() - bounds.height()));
		execute(editPart.getCommand(resize));
	}

	public void execute(org.eclipse.gef.commands.Command command) {
		assertThat("No command", command, notNullValue());
		assertThat(command, CommandMatchers.GEF.canExecute());
		getActiveDiagramEditor().getDiagramEditDomain().getDiagramCommandStack().execute(command);
		flushDisplayEvents();
	}

	@Override
	public void execute(Command command) {
		super.execute(command);
		flushDisplayEvents();
	}

	@Override
	public IStatus execute(IUndoableOperation operation, IProgressMonitor monitor, IAdaptable info) {
		IStatus result = super.execute(operation, monitor, info);
		flushDisplayEvents();
		return result;
	}

	@Override
	public void undo() {
		super.undo();
		flushDisplayEvents();
	}

	@Override
	public void redo() {
		super.redo();
		flushDisplayEvents();
	}

	public PaletteViewer getPalette() {
		return getPalette(getActiveDiagramEditor());
	}

	/**
	 * @since 2.0
	 */
	public PaletteViewer getPalette(IMultiDiagramEditor editor) {
		IEditorPart activeEditor = editor.getActiveEditor();
		assertThat("No diagram active", activeEditor, instanceOf(DiagramEditor.class));
		return getPalette((DiagramEditor) activeEditor);
	}

	public PaletteViewer getPalette(IDiagramWorkbenchPart editor) {
		return editor.getDiagramEditPart().getViewer().getEditDomain().getPaletteViewer();
	}

	public void flushDisplayEvents() {
		for (;;) {
			try {
				if (Display.getCurrent() != null && !Display.getCurrent().readAndDispatch()) {
					break;
				}
			} catch (Exception e) {
				Bundle testBundle = FrameworkUtil.getBundle((testClass == null) ? PapyrusEditorFixture.class : testClass);
				Platform.getLog(testBundle).log(new Status(IStatus.ERROR, testBundle.getSymbolicName(), "Uncaught exception in display runnable.", e));
			}
		}
	}

	public IViewPart getView(String id, boolean open) {
		IViewPart result = null;

		IWorkbenchPage wbPage = getWorkbenchPage();

		try {
			result = wbPage.findView(id);
			if ((result == null) && open) {
				result = wbPage.showView(id);
			}

			if (result != null) {
				result.getSite().getPage().activate(result);
				flushDisplayEvents();
			}
		} catch (PartInitException e) {
			e.printStackTrace();
			fail("Failed to show a view: " + id);
		} finally {
			flushDisplayEvents();
		}

		return result;
	}

	public void save() {
		save(getEditor());
	}

	public void save(ISaveablePart part) {
		if (part.isDirty()) {
			try {
				part.doSave(new NullProgressMonitor());
			} catch (Exception e) {
				e.printStackTrace();
				fail("Failed to save editor/view: " + e.getLocalizedMessage());
			} finally {
				// Must flush display events because some steps (e.g. dependent editor reload)
				// are done asynchronously in a UI job
				flushDisplayEvents();
			}
		}
	}

	public void saveAll() {
		try {
			IWorkbenchPage page = editor.getSite().getPage();
			page.saveAllEditors(false);
		} finally {
			// Must flush display events because some steps (e.g. dependent editor reload)
			// are done asynchronously in a UI job
			flushDisplayEvents();
		}
	}

	public void splitEditorArea(IEditorPart editorToMove, boolean splitHorizontally) {
		MPart editorPart = editorToMove.getSite().getService(MPart.class);
		EModelService modelService = editorPart.getContext().get(EModelService.class);
		MPartStack oldStack = (MPartStack) modelService.getContainer(editorPart);
		MPartStack newStack = modelService.createModelElement(MPartStack.class);
		modelService.insert(newStack, oldStack, splitHorizontally ? EModelService.RIGHT_OF : EModelService.BELOW, 0.5f);
		newStack.getChildren().add(editorPart);

		activate(editorToMove);
	}

	public List<IWorkbenchPart> getPartStack(IWorkbenchPart part) {
		List<IWorkbenchPart> result;

		MPart mpart = part.getSite().getService(MPart.class);
		EModelService modelService = mpart.getContext().get(EModelService.class);
		MPartStack stack = (MPartStack) modelService.getContainer(mpart);

		result = Lists.newArrayListWithCapacity(stack.getChildren().size());
		for (MPart next : Iterables.filter(stack.getChildren(), MPart.class)) {
			IWorkbenchPart wbPart = next.getContext().get(IWorkbenchPart.class);
			if (wbPart != null) {
				result.add(wbPart);
			}
		}

		return result;
	}

	protected final boolean hasRequiredViews() {
		return getRequiredViews() != null;
	}

	protected final ShowView getRequiredViews() {
		ShowView result = testDescription.getAnnotation(ShowView.class);

		if (result == null) {
			for (Class<?> clazz = testClass; (result == null) && (clazz != null) && (clazz != Object.class); clazz = clazz.getSuperclass()) {
				result = clazz.getAnnotation(ShowView.class);
			}
		}

		return result;
	}

	protected void openRequiredViews() {
		IWorkbenchPage page = getWorkbenchPage();

		for (ShowViewDescriptor next : ShowViewDescriptor.getDescriptors(getRequiredViews())) {
			IViewPart part = page.findView(next.viewID());
			if (part == null) {
				// Must open it
				try {
					part = page.showView(next.viewID());
					movePartRelativeTo(part, next.relativeTo(), next.location());

					if (viewsToClose == null) {
						viewsToClose = Lists.newArrayListWithExpectedSize(1);
					}
					viewsToClose.add(part);
				} catch (PartInitException e) {
					e.printStackTrace();
					fail("Failed to open required view: " + e.getLocalizedMessage());
				}
			}
		}

		flushDisplayEvents();
	}

	private void movePartRelativeTo(IWorkbenchPart part, String relativeTo, int where) {
		MPart mPart = part.getSite().getService(MPart.class);
		EModelService modelService = mPart.getContext().get(EModelService.class);
		MUIElement relativePart = modelService.find(relativeTo, modelService.getTopLevelWindowFor(mPart));
		if (relativePart instanceof MPartSashContainerElement) {
			MStackElement toMove = mPart;
			MPlaceholder placeHolder = mPart.getCurSharedRef();
			if (placeHolder != null) {
				toMove = placeHolder;
			}

			if (where < 0) {
				// Add it to the relative part's containing stack
				if (relativePart instanceof MPart) {
					MPart relativeMPart = (MPart) relativePart;
					if (relativeMPart.getCurSharedRef() != null) {
						// This is where the part is stacked
						relativePart = relativeMPart.getCurSharedRef();
					}
				}
				relativePart.getParent().getChildren().add(toMove);
			} else {
				// Insert it next to the relative part
				MPartStack newStack = modelService.createModelElement(MPartStack.class);
				newStack.getChildren().add(toMove);
				modelService.insert(newStack, (MPartSashContainerElement) relativePart, where, 0.3f);
			}
		}
	}

	protected void closeRequiredViews() {
		// Only close the Palette view if we opened it
		if (viewsToClose != null) {
			for (IViewPart closeMe : viewsToClose) {
				closeMe.getSite().getPage().hideView(closeMe);
			}
			viewsToClose = null;
			flushDisplayEvents();
		}
	}

	private static final class ShowViewDescriptor {

		private static final String DEFAULT_RELATIVE_TO = "org.eclipse.ui.editorss"; //$NON-NLS-1$

		private static final ShowView.Location DEFAULT_LOCATION_EDITORS = ShowView.Location.RIGHT;

		private static final ShowView.Location DEFAULT_LOCATION_VIEW = ShowView.Location.STACKED;

		private final String viewID;

		private final String relativeTo;

		private final ShowView.Location location;

		private ShowViewDescriptor(ShowView annotation, int index) {
			this.viewID = annotation.value()[index];

			String[] relativeTo = annotation.relativeTo();
			this.relativeTo = (relativeTo.length == 0) ? null : (relativeTo.length == 1) ? relativeTo[0] : relativeTo[index];

			ShowView.Location[] location = annotation.location();
			this.location = (location.length == 0) ? null : (location.length == 1) ? location[0] : location[index];
		}

		static Iterable<ShowViewDescriptor> getDescriptors(final ShowView annotation) {
			ImmutableList.Builder<ShowViewDescriptor> result = ImmutableList.builder();

			String[] ids = annotation.value();
			for (int i = 0; i < ids.length; i++) {
				result.add(new ShowViewDescriptor(annotation, i));
			}

			return result.build();
		}

		String viewID() {
			return viewID;
		}

		String relativeTo() {
			return (relativeTo != null) ? relativeTo : DEFAULT_RELATIVE_TO;
		}

		int location() {
			return ((location != null) ? location : (relativeTo == null) ? DEFAULT_LOCATION_EDITORS : DEFAULT_LOCATION_VIEW).toModelServiceLocation();
		}
	}

	public PreferencesHint getPreferencesHint() {
		PreferencesHint result = PreferencesHint.USE_DEFAULTS;

		if (activeDiagramEditor != null) {
			RootEditPart rootEditPart = activeDiagramEditor.getDiagramGraphicalViewer().getRootEditPart();
			if (rootEditPart instanceof IDiagramPreferenceSupport) {
				result = ((IDiagramPreferenceSupport) rootEditPart).getPreferencesHint();
			}
		}

		return result;
	}

	/**
	 * @since 2.0
	 */
	public void ensurePapyrusPerspective() {
		Display.getDefault().syncExec(new Runnable() {

			@Override
			public void run() {
				final String papyrus = "org.eclipse.papyrus.infra.core.perspective"; //$NON-NLS-1$
				final IWorkbenchPage activePage = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage();
				IPerspectiveDescriptor perspective = activePage.getPerspective();
				if (!papyrus.equals(perspective.getId())) {
					perspective = PlatformUI.getWorkbench().getPerspectiveRegistry().findPerspectiveWithId(papyrus);
					if (perspective != null) {
						activePage.setPerspective(perspective);
						flushDisplayEvents();
					}
				}
			}
		});
	}

	/**
	 * Create a new shape in the {@code parent}. Fails if the shape cannot be created or
	 * cannot be found in the diagram after creation.
	 *
	 * @param parent
	 *            the parent edit-part in which to create a shape
	 * @param type
	 *            the type of shape to create
	 * @param location
	 *            the location (mouse pointer) at which to create the shape
	 * @param size
	 *            the size of the shape to create, or {@code null} for the default size as
	 *            would be created when just clicking in the diagram
	 * @return the newly created shape edit-part
	 *
	 * @since 2.2
	 */
	public IGraphicalEditPart createShape(EditPart parent, IElementType type, Point location, Dimension size) {
		CreateViewRequest request = CreateViewRequestFactory.getCreateShapeRequest(type, ((IGraphicalEditPart) parent).getDiagramPreferencesHint());

		request.setLocation(location);
		request.setSize(size);

		EditPart target = parent.getTargetEditPart(request);
		assertThat("No target edit part", target, notNullValue());
		org.eclipse.gef.commands.Command command = target.getCommand(request);
		execute(command);

		return getNewEditPart(parent, request.getViewDescriptors());
	}

	private IGraphicalEditPart getNewEditPart(EditPart context, Collection<? extends ViewDescriptor> viewDescriptors) {
		return viewDescriptors.stream()
				.map(desc -> desc.getAdapter(View.class)).map(View.class::cast)
				.filter(Objects::nonNull)
				.map(view -> DiagramEditPartsUtil.getEditPartFromView(view, context))
				.filter(IGraphicalEditPart.class::isInstance).map(IGraphicalEditPart.class::cast)
				.findAny().orElseGet(failOnAbsence("Could not find newly created edit-part"));
	}

	/**
	 * Create a new shape in the current diagram by automating the creation tool.
	 * Fails if the shape cannot be created or cannot be found in the diagram after creation.
	 *
	 * @param type
	 *            the type of shape to create
	 * @param location
	 *            the location (mouse pointer) at which to create the shape
	 * @param size
	 *            the size of the shape to create, or {@code null} for the default size as
	 *            would be created when just clicking in the diagram
	 * @return the newly created shape edit-part
	 *
	 * @since 2.2
	 */
	public IGraphicalEditPart createShape(IElementType type, Point location, Dimension size) {
		class MyTool extends AspectUnspecifiedTypeCreationTool {
			private Collection<? extends ViewDescriptor> results = Collections.emptyList();

			MyTool() {
				super(Collections.singletonList(type));
			}

			@Override
			protected Request getTargetRequest() {
				return super.getTargetRequest();
			}

			@Override
			protected void selectAddedObject(EditPartViewer viewer, @SuppressWarnings("rawtypes") Collection objects) {
				super.selectAddedObject(viewer, objects);

				results = ((Collection<?>) objects).stream()
						.filter(ViewDescriptor.class::isInstance).map(ViewDescriptor.class::cast)
						.collect(Collectors.toList());
			}

			Collection<? extends ViewDescriptor> getResults() {
				return results;
			}
		}

		EditPartViewer viewer = getActiveDiagram().getViewer();
		MyTool tool = new MyTool();

		Event mouse = new Event();
		mouse.display = editor.getSite().getShell().getDisplay();
		mouse.widget = viewer.getControl();
		mouse.x = location.x();
		mouse.y = location.y();

		viewer.getEditDomain().setActiveTool(tool);
		tool.setViewer(viewer);

		// Move to the place where we'll click
		mouse.type = SWT.MouseMove;
		tool.mouseMove(new MouseEvent(mouse), viewer);

		// Press down
		mouse.type = SWT.MouseDown;
		mouse.button = 1;
		tool.mouseDown(new MouseEvent(mouse), viewer);

		flushDisplayEvents();

		if (size == null) {
			// Just a click
			mouse.type = SWT.MouseUp;
			tool.mouseUp(new MouseEvent(mouse), viewer);
		} else {
			// Drag and release
			mouse.type = SWT.MouseMove;
			mouse.x = location.x() + size.width();
			mouse.y = location.y() + size.height();
			tool.mouseDrag(new MouseEvent(mouse), viewer);

			flushDisplayEvents();

			mouse.type = SWT.MouseUp;
			tool.mouseUp(new MouseEvent(mouse), viewer);
		}

		flushDisplayEvents();

		// Find the new edit-part
		return getNewEditPart(getActiveDiagram(), tool.getResults());
	}

	/**
	 * Create a point location (useful as a static import for test readability).
	 *
	 * @param x
	 *            the x coördinate
	 * @param y
	 *            the y coördinate
	 * @return the point
	 *
	 * @since 2.2
	 */
	public static Point at(int x, int y) {
		return new Point(x, y);
	}

	/**
	 * Convert a point that is relative to the given part to a point relative to the
	 * current viewport (taking zoom and scroll into account). This can be used to get
	 * a "Mouse Location" to configure requests. Useful as a static import for test
	 * readability
	 *
	 * @param x
	 *            the relative x coördinate
	 * @param y
	 *            the relative y coördinate
	 * @param relativeTo
	 *            the edit-part in which coördinate space the {@code x} and {@code y}
	 *            are specified
	 * @return the point in absolute mouse-pointer coördinates
	 *
	 * @since 2.2
	 */
	public static Point at(int x, int y, IGraphicalEditPart relativeTo) {
		Point at = new Point(x, y);

		IFigure figure = relativeTo.getContentPane();
		Point layoutOrigin = figure.getClientArea().getLocation();

		at.performTranslate(layoutOrigin.x, layoutOrigin.y);
		figure.translateToParent(at);
		figure.translateToAbsolute(at);

		return at;
	}

	/**
	 * Create a size dimension (useful as a static import for test readability).
	 *
	 * @param width
	 *            the size width
	 * @param height
	 *            the the size height
	 * @return the size
	 *
	 * @since 2.2
	 */
	public static Dimension sized(int width, int height) {
		return new Dimension(width, height);
	}

	/**
	 * Delete one or more edit-parts from the diagram.
	 *
	 * @param editPart
	 *            the edit-parts to delete
	 *
	 * @since 2.2
	 *
	 * @throws IllegalArgumentException
	 *             if no edit-parts are specified
	 */
	public void delete(EditPart... editPart) {
		// In the diagram, deletion of a multiple selection is accomplished with separate
		// requests to each edit-part, so do the same here
		org.eclipse.gef.commands.Command delete = Stream.of(editPart).map(ep -> ep.getCommand(new EditCommandRequestWrapper(new DestroyElementRequest(false))))
				.reduce(org.eclipse.gef.commands.Command::chain)
				.orElseThrow(IllegalArgumentException::new);

		execute(delete);
	}
}
