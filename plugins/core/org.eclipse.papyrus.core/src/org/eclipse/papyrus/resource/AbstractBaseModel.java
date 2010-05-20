/**
 * 
 */
package org.eclipse.papyrus.resource;

import java.io.IOException;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.IPath;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;


/**
 * An abstract implmeentation of model.
 * This class should be subclassed to fit the required model.
 * 
 * @author cedric dumoulin
 * 
 */
public abstract class AbstractBaseModel implements IModel {

	/**
	 * The associated ModelManager.
	 */
	private ModelSet modelManager;

	/**
	 * List of attached snippets.
	 */
	private ModelSnippetList snippets = new ModelSnippetList();

	/**
	 * The associated resource.
	 */
	protected Resource resource;

	/**
	 * @see org.eclipse.papyrus.resource.IModel#init(org.eclipse.papyrus.resource.ModelSet)
	 * 
	 * @param modelManager
	 */
	public void init(ModelSet modelManager) {
		this.modelManager = modelManager;

	}

	/**
	 * @return the modelManager
	 */
	protected ModelSet getModelManager() {
		return modelManager;
	}

	/**
	 * Get the associated ResourceSet containing the resources of this model.
	 * 
	 * @return
	 */
	protected ResourceSet getResourceSet() {
		return modelManager;
	}

	/**
	 * @return the resource
	 */
	public Resource getResource() {
		return resource;
	}

	/**
	 * Get the model identifier.
	 * 
	 * @return
	 */
	abstract public Object getIdentifier();

	/**
	 * Get the file extension used by the resource.
	 * 
	 * @return
	 */
	abstract protected String getModelFileExtension();

	/**
	 * @see org.eclipse.papyrus.resource.IModel#createModel(org.eclipse.core.runtime.IPath)
	 * 
	 * @param fullPath
	 */
	public void createModel(IPath fullPath) {

		// Compute model URI
		URI modelUri = getPlatformURI(fullPath.addFileExtension(getModelFileExtension()));

		// Create Resource of appropriate type
		resource = getModelManager().createResource(modelUri);
	}

	/**
	 * Get a platform resource URI of the given path
	 * 
	 * @param path
	 *        the path
	 * @return the uri
	 */
	protected URI getPlatformURI(IPath path) {
		return URI.createPlatformResourceURI(path.toString(), true);
	}


	/**
	 * Load the model repository.
	 * The URI is calculated by removing the extension and replacing it by the model extension.
	 * 
	 * @param file
	 *        The file selected by user requesting load. Should be used as a bases to guess the model IPath.
	 */
	public void loadModel(IFile file) {
		// Get the full path and call the load method with it.
		loadModel(file.getFullPath().removeFileExtension());
	}

	/**
	 * Load the model by using the provided fullpath as a hint for the resource URI.
	 * In this implementation, simply add the model extension.
	 * 
	 * @param fullPathWithoutExtension
	 */
	public void loadModel(IPath fullPathWithoutExtension) {

		// Compute model URI
		URI modelUri = getPlatformURI(fullPathWithoutExtension.addFileExtension(getModelFileExtension()));

		// Create Resource of appropriate type
		resource = modelManager.getResource(modelUri, true);
		// call registered snippets
		snippets.performStart(this);
	}

	/**
	 * @throws IOException
	 * @see org.eclipse.papyrus.resource.IModel#saveModel()
	 * 
	 */
	public void saveModel() throws IOException {
		resource.save(null);
	}

	/**
	 * @see org.eclipse.papyrus.resource.IModel#changeModelPath(org.eclipse.core.runtime.IPath)
	 * 
	 * @param nameWithoutExt
	 */
	public void changeModelPath(IPath fullPath) {
		// Compute model URI
		URI modelUri = getPlatformURI(fullPath.addFileExtension(getModelFileExtension()));

		resource.setURI(modelUri);
	}

	/**
	 * @see org.eclipse.papyrus.resource.IModel#dispose()
	 * 
	 */
	public void unload() {
		// call registered snippets
		snippets.performStart(this);

		// Do unloading
		resource.unload();
		resource = null;
	}

	/**
	 * Add a snippet to this model.
	 * The snippet is called just after model is initialized,
	 * and before it is disposed or unloaded.
	 * Snippet can be shared among models.
	 * 
	 * @param snippet
	 *        The snippet to add.
	 */
	public void addModelSnippet(IModelSnippet snippet) {
		snippets.add(snippet);
	}


}
