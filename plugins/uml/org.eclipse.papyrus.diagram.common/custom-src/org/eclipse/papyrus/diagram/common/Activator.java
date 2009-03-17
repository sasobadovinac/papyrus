package org.eclipse.papyrus.diagram.common;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.ecore.provider.EcoreItemProviderAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.ReflectiveItemProviderAdapterFactory;
import org.eclipse.emf.edit.provider.resource.ResourceItemProviderAdapterFactory;
import org.eclipse.gmf.runtime.diagram.core.preferences.PreferencesHint;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.papyrus.diagram.common.providers.AlternativeUMLItemProviderAdapterFactory;
import org.eclipse.papyrus.diagram.common.util.ColorManager;
import org.eclipse.papyrus.diagram.common.util.FontManager;
import org.eclipse.papyrus.umlutils.ElementUtil;
import org.eclipse.papyrus.umlutils.ImageUtil;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.graphics.ImageData;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.VisibilityKind;
import org.eclipse.uml2.uml.edit.providers.UMLItemProviderAdapterFactory;
import org.osgi.framework.BundleContext;

/**
 * The activator class controls the plug-in life cycle
 */
public class Activator extends AbstractUIPlugin {

	/** The Constant ID. */
	public static final String ID = "org.eclipse.papyrus.common.diagram.common";

	// The shared instance
	private static Activator plugin;

	/** The Constant UML_VIS_ICONS_16x16. */
	public static final String UML_VIS_ICONS_16x16 = "icons/uml/ovr16/";

	/** Default image. */
	public static final String DEFAULT_IMAGE = "icons/papyrus/Papyrus.gif";

	/** Color manager. */
	public static ColorManager colorManager = new ColorManager();

	/** Font manager. */
	public static FontManager fontManager = new FontManager();

	/** left Stereotype delimiters ('Guillemets francais'). */
	public static String ST_LEFT = String.valueOf("\u00AB");

	/** Right Stereotype delimiters ('Guillemets francais'). */
	public static String ST_RIGHT = String.valueOf("\u00BB");

	/**
	 * The constructor
	 */
	public Activator() {
	}

	/**
	 * Returns the shared instance
	 * 
	 * @return the shared instance
	 */
	public static Activator getDefault() {
		return plugin;
	}

	/**
	 * Returns an image descriptor for the image file at the given plug-in relative path.
	 * 
	 * @param path
	 *            the path for the image file
	 * @return the image descriptor
	 */
	public static ImageDescriptor getImageDescriptor(String path) {
		return AbstractUIPlugin.imageDescriptorFromPlugin(ID, path);
	}

	public static Image getImage(String key) {
		return getImage(key, "");
	}

	/**
	 * Returns an <code>org.eclipse.swt.graphics.Image</code> identified by its key.<BR>
	 * By default, it returns a default image. This image is the image placed in the directory <em>resources/icons/default.gif</em>
	 * 
	 * @param key
	 *            the key of the image
	 * @param visKey
	 *            must not be null : "" || "public" || "private" ...
	 * @return the Image
	 */
	public static Image getImage(String key, String visKey) {

		String image_id = key;
		if (!"".equals(visKey)) {
			image_id = image_id + "::" + visKey;
		}

		ImageRegistry registry = getDefault().getImageRegistry();
		Image image = registry.get(image_id);

		if (image == null) { // Image not yet in registry

			// Get the descriptor of the image without visibility
			ImageDescriptor desc = AbstractUIPlugin.imageDescriptorFromPlugin(getDefault().ID, key);

			if (!"".equals(visKey)) { // Add visibility overlay

				Image initialImage = desc.createImage();
				ImageDescriptor visDesc = getDefault().getImageDescriptor(getDefault().UML_VIS_ICONS_16x16 + "VisibilityKind_" + visKey + ".gif");

				// Overlay custom image over base image
				OverlayVisibilityIcon overlayIcon = new OverlayVisibilityIcon(initialImage, visDesc);
				image = overlayIcon.getImage();

				registry.put(image_id, image);

			} else {
				registry.put(key, desc);
			}

			image = registry.get(image_id);

		}

		if ((image == null) && !image_id.equals(DEFAULT_IMAGE)) {
			image = getImage(DEFAULT_IMAGE);
		}

		return image;
	}

	/**
	 * This method returns an <code>org.eclipse.swt.graphics.Image</code> identified by its pluginId and iconPath.<BR>
	 * 
	 * By default, it returns a default image. This image is the image placed in the directory <em>resources/icons/default.gif</em>
	 * 
	 * @param pluginId
	 *            id of plugin
	 * @param iconpPath
	 *            the path of the icon image relative to the plugin
	 * @return the Image
	 */
	public static Image getPluginIconImage(String pluginId, String iconPath) {
		String key = pluginId + iconPath;
		ImageRegistry registry = getDefault().getImageRegistry();
		Image image = registry.get(key);

		if (image == null) {

			ImageDescriptor desc = AbstractUIPlugin.imageDescriptorFromPlugin(pluginId, iconPath);

			registry.put(key, desc);
			image = registry.get(key);

		}
		if ((image == null) && !iconPath.equals(DEFAULT_IMAGE)) {
			image = getImage(DEFAULT_IMAGE);
		}

		return image;
	}

	/**
	 * this method returns the shape image that represents the first applied stereotype.
	 * 
	 * @param elt
	 *            the stereotyped element
	 * @return {@link image} of the shape
	 */
	public static Image getShapeElement(Element elt) {
		// getStereotypeImage can return null
		org.eclipse.uml2.uml.Image shape = ElementUtil.getStereotypeImage(elt, "shape");
		if (shape != null) {
			return getImageInRegistry(shape, null);
		} else {
			return null;
		}
	}

	public static Image getIconElement(Element elt) {
		return getIconElement(elt, false);
	}

	/**
	 * this method returns the icon image that represents the first applied stereotype.
	 * 
	 * @param elt
	 *            the stereotyped element
	 * @return {@link image} of the icon
	 */
	public static Image getIconElement(Element elt, boolean withVisibilityDecorator) {

		VisibilityKind vis = null;
		if ((elt instanceof NamedElement) && (withVisibilityDecorator)) {

			vis = ((NamedElement) elt).getVisibility();
		}

		// getStereotypeImage can return null
		org.eclipse.uml2.uml.Image icon = ElementUtil.getStereotypeImage(elt, "icon");
		if (icon != null) {
			return getImageInRegistry(icon, vis);
		} else {
			return null;
		}
	}

	/**
	 * Find the image (SWT) in registry Store image in registry if it is not found
	 * 
	 * @param umlImage
	 *            to retrieve as SWT Image in registry
	 * @return the stored SWT image
	 */
	public static Image getImageInRegistry(org.eclipse.uml2.uml.Image umlImage, VisibilityKind visibility) {
		// Retrieve registry
		ImageRegistry papyrusRegistry = getDefault().getImageRegistry();

		// Get image id for registry
		String image_id = ImageUtil.getImageId(umlImage);
		if (visibility != null) {
			image_id = image_id + "_" + visibility.getLiteral();
		}

		// Get SWT image for shape in the registry
		Image image = papyrusRegistry.get(image_id);

		// If image was not found in registry,
		// try to find an image and to update registry
		if (image == null) {

			// Try to retrieve image from UML Image content property
			image = ImageUtil.getContent(umlImage);

			// If no image was found in Content
			// Try to retrieve image from UML Image location property
			if (image == null) {
				image = ImageUtil.getImageFromLocation(umlImage);
			}

			// Add visibility decorator
			if (visibility != null) {

				ImageDescriptor visDesc = getDefault().getImageDescriptor(getDefault().UML_VIS_ICONS_16x16 + "VisibilityKind_" + visibility.getLiteral() + ".gif");

				// Overlay custom image over base image
				OverlayVisibilityIcon overlayIcon = new OverlayVisibilityIcon(image, visDesc);
				image = overlayIcon.getImage();
			}

			if (image != null) {
				// Store image in registry
				ImageData imdata = image.getImageData();
				papyrusRegistry.put(image_id, ImageDescriptor.createFromImageData(imdata));
				image = papyrusRegistry.get(image_id);
			}
		}

		return image;
	}

	/** The Constant DIAGRAM_PREFERENCES_HINT. */
	public static final PreferencesHint DIAGRAM_PREFERENCES_HINT = new PreferencesHint(ID);

	/** The adapter factory. */
	private ComposedAdapterFactory adapterFactory;

	/**
	 * Start.
	 * 
	 * @param context
	 *            the context
	 * 
	 * @throws Exception
	 *             the exception
	 * 
	 * @generated
	 */
	@Override
	public void start(BundleContext context) throws Exception {
		super.start(context);
		PreferencesHint.registerPreferenceStore(DIAGRAM_PREFERENCES_HINT, getPreferenceStore());
	}

	/**
	 * Stop.
	 * 
	 * @param context
	 *            the context
	 * 
	 * @throws Exception
	 *             the exception
	 * 
	 * @generated
	 */
	@Override
	public void stop(BundleContext context) throws Exception {
		super.stop(context);
	}

	/**
	 * Log error.
	 * 
	 * @param error
	 *            the error
	 */
	public void logError(String error) {
		logError(error, null);
	}

	/**
	 * Log error.
	 * 
	 * @param throwable
	 *            actual error or null could be passed
	 * @param error
	 *            the error
	 */
	public void logError(String error, Throwable throwable) {
		if (error == null && throwable != null) {
			error = throwable.getMessage();
		}
		getLog().log(new Status(IStatus.ERROR, Activator.ID, IStatus.OK, error, throwable));
		debug(error, throwable);
	}

	/**
	 * Log info.
	 * 
	 * @param message
	 *            the message
	 */
	public void logInfo(String message) {
		logInfo(message, null);
	}

	/**
	 * Log info.
	 * 
	 * @param throwable
	 *            actual error or null could be passed
	 * @param message
	 *            the message
	 */
	public void logInfo(String message, Throwable throwable) {
		if (message == null && throwable != null) {
			message = throwable.getMessage();
		}
		getLog().log(new Status(IStatus.INFO, Activator.ID, IStatus.OK, message, throwable));
		debug(message, throwable);
	}

	/**
	 * Debug.
	 * 
	 * @param message
	 *            the message
	 * @param throwable
	 *            the throwable
	 */
	private void debug(String message, Throwable throwable) {
		if (!isDebugging()) {
			return;
		}
		if (message != null) {
			System.err.println(message);
		}
		if (throwable != null) {
			throwable.printStackTrace();
		}
	}

	/**
	 * Creates the adapter factory.
	 * 
	 * @return the composed adapter factory
	 */
	protected ComposedAdapterFactory createAdapterFactory() {
		List factories = new ArrayList();
		fillItemProviderFactories(factories);
		return new ComposedAdapterFactory(factories);
	}

	/**
	 * Use alternative UMLItemProviderAdapterFactory insteadof UMLItemProviderAdapterFactory.
	 * 
	 * @param factories
	 *            the factories
	 * 
	 * @see org.eclipse.emf.edit.provider.ComposedAdapterFactory#getFactoryForTypes(java.util.Collection)
	 */
	protected void fillItemProviderFactories(List factories) {
		// custom icons for diagram elements
		factories.add(new AlternativeUMLItemProviderAdapterFactory(getPreferenceStore()));

		factories.add(new UMLItemProviderAdapterFactory());
		factories.add(new EcoreItemProviderAdapterFactory());
		factories.add(new ResourceItemProviderAdapterFactory());
		factories.add(new ReflectiveItemProviderAdapterFactory());
	}

	/**
	 * Gets the item providers adapter factory.
	 * 
	 * @return the item providers adapter factory
	 */
	public AdapterFactory getItemProvidersAdapterFactory() {
		if (adapterFactory == null) {
			adapterFactory = createAdapterFactory();
		}
		return adapterFactory;
	}
}
