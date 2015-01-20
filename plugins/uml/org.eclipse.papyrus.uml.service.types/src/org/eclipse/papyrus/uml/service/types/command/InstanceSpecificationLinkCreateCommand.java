/**
 * Copyright (c) 2014 CEA LIST.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *  CEA LIST - Initial API and implementation
 */
package org.eclipse.papyrus.uml.service.types.command;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.emf.type.core.commands.EditElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateRelationshipRequest;
import org.eclipse.papyrus.uml.service.types.ui.AssociationSelectionDialog;
import org.eclipse.papyrus.uml.tools.utils.NamedElementUtil;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.uml2.uml.Association;
import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.Constraint;
import org.eclipse.uml2.uml.InstanceSpecification;
import org.eclipse.uml2.uml.InstanceValue;
import org.eclipse.uml2.uml.Namespace;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.Slot;
import org.eclipse.uml2.uml.Type;
import org.eclipse.uml2.uml.UMLFactory;

public class InstanceSpecificationLinkCreateCommand extends EditElementCommand {

	protected final EObject source;

	protected final EObject target;

	protected HashSet<Association> commonAssociations;

	protected static final String INSTANCE_END = "InstanceEnd";//

	public InstanceSpecificationLinkCreateCommand(CreateRelationshipRequest request) {
		super(request.getLabel(), null, request);
		this.source = request.getSource();
		this.target = request.getTarget();
	}

	/**
	 *
	 * @param instance
	 *        link where instance end end are look for
	 * @return a list of two elements that are instance specfication : ends of this instance Link
	 *         if this is not an instance link : the size of the array list is 0
	 */
	protected List<InstanceSpecification> getEnds(InstanceSpecification instance) {
		List<InstanceSpecification> array = new ArrayList<InstanceSpecification>();
		EAnnotation endtypes = instance.getEAnnotation(INSTANCE_END);
		if(endtypes != null) {
			assert (endtypes.getReferences().size() == 2);
			array.add((InstanceSpecification)endtypes.getReferences().get(0));
			array.add((InstanceSpecification)endtypes.getReferences().get(1));
		}
		return array;
	}

	/**
	 * add an end in the instancespecification link by adding a eannotation if not exist
	 *
	 * @param instanceLink
	 * @param end
	 *        to add
	 */
	protected void addEnd(InstanceSpecification instanceLink, InstanceSpecification end) {
		EAnnotation endtypes = instanceLink.getEAnnotation(INSTANCE_END);
		if(endtypes == null) {
			endtypes = instanceLink.createEAnnotation(INSTANCE_END);
		}
		endtypes.getReferences().add(end);
	}

	/**
	 * remove an end in the instancespecification link by adding a eannotation if not exist
	 *
	 * @param instanceLink
	 * @param end
	 *        to add
	 */
	protected void removeEnd(InstanceSpecification instanceLink, InstanceSpecification end) {
		EAnnotation endtypes = instanceLink.getEAnnotation(INSTANCE_END);
		if(endtypes == null) {
			endtypes = instanceLink.createEAnnotation(INSTANCE_END);
		}
		endtypes.getReferences().remove(end);
	}

	@Override
	public boolean canExecute() {
		if(source != null && target == null) {
			// test if is an instanceSpecification
			if(source instanceof InstanceSpecification) {
				InstanceSpecification instance = (InstanceSpecification)source;
				// Is it associated to a classifier?
				if(instance.getClassifiers().size() > 0) {
					HashSet<Association> assoSource = new HashSet<Association>();
					Iterator<Classifier> iterator = instance.getClassifiers().iterator();
					while(iterator.hasNext()) {
						Classifier classifier = iterator.next();
						assoSource.addAll(classifier.getAssociations());
					}
					// how many association it linked?
					if(assoSource.size() > 0) {
						return true;
					}
				}
			}
			return false;
		}
		// source and target != null
		// look for if it exist at least a common association between classifiers referenced between these instances
		if(source != null && target != null) {
			if(!(source instanceof InstanceSpecification)) {
				return false;
			}
			if(!(target instanceof InstanceSpecification)) {
				return false;
			}
			if(((InstanceSpecification)source).getClassifiers().size() == 0 || ((InstanceSpecification)target).getClassifiers().size() == 0) {
				return false;
			}
			HashSet<Association> assoSource = new HashSet<Association>();
			Iterator<Classifier> iterator = ((InstanceSpecification)source).getClassifiers().iterator();
			while(iterator.hasNext()) {
				Classifier classifier = iterator.next();
				assoSource.addAll(classifier.getAssociations());
			}
			HashSet<Association> assoTarget = new HashSet<Association>();
			iterator = ((InstanceSpecification)target).getClassifiers().iterator();
			while(iterator.hasNext()) {
				Classifier classifier = iterator.next();
				assoTarget.addAll(classifier.getAssociations());
			}
			assoSource.retainAll(assoTarget);
			commonAssociations = new HashSet<Association>();
			commonAssociations.addAll(assoSource);
			return (commonAssociations.size() > 0);
		}
		return false;
	}

	@Override
	protected CommandResult doExecuteWithResult(IProgressMonitor monitor, IAdaptable info) throws ExecutionException {
		AssociationSelectionDialog associationSelectionDialog;
		Association selectedAssociation = null;
		if(((InstanceSpecification)source).getClassifiers().size() > 0 && ((InstanceSpecification)target).getClassifiers().size() > 0) {
			// look for the good association
			associationSelectionDialog = new AssociationSelectionDialog(new Shell(), SWT.NATIVE, commonAssociations);
			associationSelectionDialog.open();
			selectedAssociation = associationSelectionDialog.getSelectedAssociation();
			// creation of the instance specification link
			// with a name a container, and set the source and target
			InstanceSpecification instanceSpecification = org.eclipse.uml2.uml.UMLFactory.eINSTANCE.createInstanceSpecification();
			((InstanceSpecification)source).getNearestPackage().getPackagedElements().add(instanceSpecification);
			instanceSpecification.setName(NamedElementUtil.getDefaultNameWithIncrementFromBase(instanceSpecification.eClass().getName(), instanceSpecification.getOwner().eContents()));
			instanceSpecification.getClassifiers().add(selectedAssociation);
			addEnd(instanceSpecification, ((InstanceSpecification)source));
			addEnd(instanceSpecification, ((InstanceSpecification)target));
			// Creation of slots into the good instance by taking in account the association
			Iterator<Property> proIterator = selectedAssociation.getMemberEnds().iterator();
			while(proIterator.hasNext()) {
				Property property = proIterator.next();
				Slot slot = UMLFactory.eINSTANCE.createSlot();
				slot.setDefiningFeature(property);
				if(((InstanceSpecification)source).getClassifiers().contains(property.getOwner())) {
					((InstanceSpecification)source).getSlots().add(slot);
					associateValue(((InstanceSpecification)target), slot, property.getType());
				} else if(((InstanceSpecification)target).getClassifiers().contains(property.getOwner())) {
					((InstanceSpecification)target).getSlots().add(slot);
					associateValue(((InstanceSpecification)source), slot, property.getType());
				} else {
					instanceSpecification.getSlots().add(slot);
					if(((InstanceSpecification)source).getClassifiers().contains(property.getType())) {
						associateValue(((InstanceSpecification)source), slot, property.getType());
					} else {
						associateValue(((InstanceSpecification)target), slot, property.getType());
					}
				}
			}
			return CommandResult.newOKCommandResult(instanceSpecification);
		}
		return CommandResult.newCancelledCommandResult();
	}

	/**
	 * create an instanceValue for the slot (owner) with the reference to InstanceSpecification and the good type
	 *
	 * @param instanceSpecification
	 *        that is referenced by the instanceValue
	 * @param owner
	 *        of the instance value
	 * @param type
	 *        of the instanceValue
	 * @return a instanceValue
	 */
	protected InstanceValue associateValue(InstanceSpecification instanceSpecification, Slot owner, Type type) {
		InstanceValue iv = UMLFactory.eINSTANCE.createInstanceValue();
		iv.setName(NamedElementUtil.getDefaultNameWithIncrementFromBase(iv.eClass().getName(), owner.eContents()));
		iv.setType(type);
		iv.setInstance(instanceSpecification);
		owner.getValues().add(iv);
		return iv;
	}

	@Override
	protected void setElementToEdit(EObject element) {
		throw new UnsupportedOperationException();
	}

	protected Constraint getSource() {
		return (Constraint)source;
	}

	protected Namespace getTarget() {
		return (Namespace)target;
	}
}
