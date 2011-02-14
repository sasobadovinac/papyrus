/*****************************************************************************
 * Copyright (c) 2010 CEA LIST.
 *    
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *  Camille Letavernier (CEA LIST) camille.letavernier@cea.fr - Initial API and implementation
 *****************************************************************************/
package org.eclipse.papyrus.properties.util;

import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.papyrus.properties.Activator;

/**
 * A Helper class for manipulating EMF Objects
 * 
 * @author Camille Letavernier
 */
public class EMFHelper {

	/**
	 * Returns the EClass corresponding to the given nsUri and className
	 * 
	 * @param nsUri
	 *        The NSURI of the EClass' EPackage
	 * @param className
	 *        The EClass' name
	 * @return
	 *         The EClass instance, or null if the EClass couldn't be found
	 */
	public static EClass getEClass(String nsUri, String className) {
		EPackage ePackage = EPackage.Registry.INSTANCE.getEPackage(nsUri);
		if(ePackage == null) {
			Activator.log.warn("Cannot find an EPackage matching the nsURI " + nsUri); //$NON-NLS-1$
			return null;
		}
		return getEClass(ePackage, className);
	}

	/**
	 * Return the EClass corresponding to the given EPackage and className
	 * 
	 * @param metamodel
	 *        The EClass' EPackage
	 * @param className
	 *        The EClass' name
	 * @return
	 *         The EClass instance, or null if the EClass couldn't be found
	 */
	public static EClass getEClass(EPackage metamodel, String className) {
		EClassifier classifier = metamodel.getEClassifier(className);
		if(classifier == null) {
			Activator.log.warn("Classifier " + className + " not found in metamodel " + metamodel.getName() + " (" + metamodel.getNsURI() + ")"); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
		}
		if(classifier instanceof EClass) {
			return (EClass)classifier;
		} else {
			Activator.log.warn("Classifier " + className + " in " + metamodel.getName() + " (" + metamodel.getNsURI() + ") is not an EClass"); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
		}

		return null;
	}

	/**
	 * Tests if an Object is an instance of the given EClass
	 * 
	 * @param element
	 *        The EObject to test
	 * @param className
	 *        The name of the EClass
	 * @param metamodel
	 *        The EPackage owning the EClass
	 * @return
	 *         True if the EObject is an instance of the EClass, or of one of the EClass' subtypes
	 */
	public static boolean isInstance(EObject element, String className, EPackage metamodel) {

		EClassifier theClass = metamodel.getEClassifier(className);

		if(theClass == null) {
			Activator.log.warn("Class " + className + " not found in Metamodel : " + metamodel.getName() + " (" + metamodel.getNsURI() + ")"); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
			return false;
		}

		return theClass.isInstance(element);
	}

	/**
	 * Tests if the given eClass is a Subclass of fromClass
	 * 
	 * @param eClass
	 * @param fromClass
	 * @return
	 *         true if eClass is a subclass of fromClass
	 */
	public static boolean isSubclass(EClass eClass, EClass fromClass) {
		List<EClass> superTypes = eClass.getESuperTypes();
		if(superTypes.contains(fromClass)) {
			return true;
		} else {
			for(EClass superClass : superTypes) {
				if(isSubclass(superClass, fromClass))
					return true;
			}
		}
		return false;
	}

	/**
	 * Returns the EObject corresponding to the input object
	 * Tests if the input is an EObject, or if it is Adaptable
	 * to an EObject
	 * 
	 * @param source
	 * @return An EObject corresponding to the input source, or null
	 *         if the EObject could not be resolved
	 */
	public static EObject getEObject(Object source) {
		if(source instanceof EObject)
			return (EObject)source;
		else if(source instanceof IAdaptable)
			return (EObject)((IAdaptable)source).getAdapter(EObject.class);

		return null;
	}

	/**
	 * Return the eClass' qualified name. The qualified name is obtained by the concatenation
	 * of its package hierarchy with the class name, separated by the given separator
	 * 
	 * @param eClass
	 * @param separator
	 *        The separator used between each package name
	 * @return
	 *         The EClass' qualified name
	 */
	public static String getQualifiedName(EClass eClass, String separator) {
		return getQualifiedName(eClass.getEPackage(), separator) + separator + eClass.getName();
	}

	/**
	 * Return the ePackage's qualified name. The qualified name is obtained by the concatenation
	 * of its superPackage hierarchy with the ePackage name, separated by the given separator
	 * 
	 * @param ePackage
	 * @param separator
	 *        The separator used between each package name
	 * @return
	 *         The EPackage's qualified name
	 */
	public static String getQualifiedName(EPackage ePackage, String separator) {
		if(ePackage.getESuperPackage() == null) {
			return ePackage.getName();
		}
		return getQualifiedName(ePackage.getESuperPackage(), separator) + separator + ePackage.getName();
	}


}
