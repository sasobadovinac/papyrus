package org.eclipse.papyrus.sysml14.diagram.blockdefinition.factory;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.diagram.core.preferences.PreferencesHint;
import org.eclipse.gmf.runtime.diagram.core.util.ViewUtil;
import org.eclipse.gmf.runtime.diagram.core.view.factories.ViewFactory;
import org.eclipse.gmf.runtime.notation.DecorationNode;
import org.eclipse.gmf.runtime.notation.Location;
import org.eclipse.gmf.runtime.notation.Node;
import org.eclipse.gmf.runtime.notation.NotationFactory;
import org.eclipse.gmf.runtime.notation.Shape;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.papyrus.sysml14.diagram.blockdefinition.IDRegistry;
import org.eclipse.papyrus.uml.diagram.common.helper.PreferenceInitializerForElementHelper;

public class OperationPortViewFactory implements ViewFactory {

	@Override
	public View createView(IAdaptable semanticAdapter, View containerView, String semanticHint, int index,	boolean persisted, PreferencesHint preferencesHint) {
		return createPort((EObject)semanticAdapter.getAdapter(EObject.class), containerView,semanticHint, index, persisted, preferencesHint);
	}
	public Node createPort(EObject domainElement, View containerView,String semanticHint, int index, boolean persisted, PreferencesHint preferencesHint) {
		Shape node = NotationFactory.eINSTANCE.createShape();
		node.setLayoutConstraint(NotationFactory.eINSTANCE.createBounds());
		node.setType(semanticHint);
		ViewUtil.insertChildView(containerView, node, index, persisted);
		node.setElement(domainElement);
		// initializeFromPreferences 
		final IPreferenceStore prefStore = (IPreferenceStore)preferencesHint.getPreferenceStore();
		PreferenceInitializerForElementHelper.initFontStyleFromPrefs(node, prefStore, "Port");
		Node label5125 = createLabel(node, IDRegistry.OPERATION_BORDER_ITEM_LABEL);
		label5125.setLayoutConstraint(NotationFactory.eINSTANCE.createLocation());
		Location location5125 = (Location)label5125.getLayoutConstraint();
		location5125.setX(25);
		location5125.setY(3);
		Node label6029 = createLabel(node, IDRegistry.OPERATION_BORDER_ITEM_STEREOTYPE_LABEL);
		label6029.setLayoutConstraint(NotationFactory.eINSTANCE.createLocation());
		Location location6029 = (Location)label6029.getLayoutConstraint();
		location6029.setX(25);
		location6029.setY(-10);
		return node;
	}
	protected Node createLabel(View owner, String hint) {
		DecorationNode rv = NotationFactory.eINSTANCE.createDecorationNode();
		rv.setType(hint);
		ViewUtil.insertChildView(owner, rv, ViewUtil.APPEND, true);
		return rv;
	}

}
