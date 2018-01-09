package org.eclipse.papyrus.uml.diagram.component.test.canonical;

import org.eclipse.gmf.runtime.diagram.ui.editparts.DiagramEditPart;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.papyrus.uml.diagram.common.part.UmlGmfDiagramEditor;
import org.eclipse.papyrus.uml.diagram.component.edit.parts.DefaultNamedElementEditPart;
import org.eclipse.papyrus.uml.diagram.component.part.UMLVisualIDRegistry;
import org.eclipse.papyrus.uml.diagram.component.providers.UMLElementTypes;
import org.eclipse.papyrus.uml.diagram.tests.canonical.TestListCompartmentHelper;

public class ComponentDiagramListCompartmentTestHelper extends TestListCompartmentHelper {

	/**
	 * Constructor.
	 *
	 * @param diagramEditPart
	 * @param diagramEditor
	 */
	public ComponentDiagramListCompartmentTestHelper(DiagramEditPart diagramEditPart, UmlGmfDiagramEditor diagramEditor) {
		super(diagramEditPart, diagramEditor);
	}

	/**
	 * @see org.eclipse.papyrus.uml.diagram.tests.canonical.ListCompartmentTestHelper#getDefaultNamedElementVisualId()
	 *
	 * @return
	 */
	@Override
	protected String getDefaultNamedElementVisualId() {
		return DefaultNamedElementEditPart.VISUAL_ID;
	}

	/**
	 * @see org.eclipse.papyrus.uml.diagram.tests.canonical.ListCompartmentTestHelper#getElementType(int)
	 *
	 * @param childVID
	 * @return
	 */
	@Override
	protected IElementType getElementType(String childVID) {
		return UMLElementTypes.getElementType(childVID);
	}

	/**
	 * @see org.eclipse.papyrus.uml.diagram.tests.canonical.ListCompartmentTestHelper#getVisualID(org.eclipse.gmf.runtime.notation.View)
	 *
	 * @param view
	 * @return
	 */
	@Override
	protected String getVisualID(View view) {
		return UMLVisualIDRegistry.getVisualID(view);
	}
}