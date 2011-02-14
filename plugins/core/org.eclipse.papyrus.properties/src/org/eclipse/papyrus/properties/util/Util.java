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

import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import org.eclipse.papyrus.properties.contexts.Context;
import org.eclipse.papyrus.properties.contexts.DataContextElement;
import org.eclipse.papyrus.properties.contexts.DataContextPackage;
import org.eclipse.papyrus.properties.environment.Namespace;

/**
 * A Helper class for miscellaneous elements of the Property view framework
 * 
 * @author Camille Letavernier
 */
public class Util {

	/**
	 * @param source
	 * @return
	 *         the given String with the first letter capitalized
	 */
	public static String firstToUpper(String source) {
		if(source.length() == 0)
			return source;
		return source.substring(0, 1).toUpperCase() + source.substring(1);
	}

	/**
	 * @param variableName
	 * @return
	 *         A formatted version of the given variable name
	 */
	public static String getLabel(String variableName) {
		return firstToUpper(variableName);
	}

	/**
	 * Tests if the given value is equal to the namespace's value
	 * 
	 * @param namespace
	 * @param value
	 * @return
	 *         True if they are equal
	 */
	public static boolean namespaceEquals(Namespace namespace, String value) {
		if(namespace == null) {
			return value == null || value.trim().equals(""); //$NON-NLS-1$
		} else {
			return namespace.getValue().equals(value);
		}
	}

	/**
	 * Tests if the given name is equal to the namespace's name
	 * 
	 * @param namespace
	 * @param name
	 * @return
	 *         True if they are equal
	 */
	public static boolean namespaceEqualsByName(Namespace namespace, String name) {
		if(namespace == null) {
			return name == null || name.trim().equals(""); //$NON-NLS-1$
		} else {
			return namespace.getName().equals(name);
		}
	}

	/**
	 * Return the full value of the namespace declaration
	 * e.g. clr-namespace:org.eclipse.papyrus.properties
	 * 
	 * @param namespace
	 *        The namespace we want to prefix
	 * @return
	 *         The prefixed namespace
	 */
	public static String getPrefixedValue(Namespace namespace) {
		String prefixedValue = ""; //$NON-NLS-1$
		if(namespace.getPrefix() != null && !namespace.getPrefix().trim().equals("")) { //$NON-NLS-1$
			prefixedValue = namespace.getPrefix() + ":"; //$NON-NLS-1$
		}
		prefixedValue += namespace.getValue();

		return prefixedValue;
	}

	/**
	 * Return the full name of the namespace declaration
	 * e.g. xmlns:ppe
	 * 
	 * @param namespace
	 *        The namespace for which we want to get the qualified name
	 * @return
	 *         The namespace's qualified name
	 */
	public static String getQualifiedName(Namespace namespace) {
		if(namespace.getName() == null || namespace.getName().trim().equals("")) { //$NON-NLS-1$
			return "xmlns"; //$NON-NLS-1$
		} else {
			return "xmlns:" + namespace.getName(); //$NON-NLS-1$
		}
	}

	/**
	 * Retrieve the DataContextElement matching the given qualifiedName.
	 * 
	 * @param qualifiedName
	 *        The fully qualified name of the DataContextElement. The separator is ":"
	 *        e.g. : UML:NamedElement
	 * @param fromContextElements
	 *        The collection of DataContextElements in which the method should look
	 * @return
	 *         The matching DataContextElement, or null if none was found
	 */
	public static DataContextElement getContextElementByQualifiedName(String qualifiedName, Collection<? extends DataContextElement> fromContextElements) {
		int index = qualifiedName.indexOf(":"); //$NON-NLS-1$
		if(index >= 0) {
			String name = qualifiedName.substring(0, index);
			qualifiedName = qualifiedName.substring(qualifiedName.indexOf(":") + 1, qualifiedName.length()); //$NON-NLS-1$
			for(DataContextElement contextElement : fromContextElements) {
				if(contextElement instanceof DataContextPackage && contextElement.getName().equals(name)) {
					DataContextElement result = getContextElementByQualifiedName(qualifiedName, ((DataContextPackage)contextElement).getElements());
					if(result != null)
						return result;
				}
			}
		} else {
			for(DataContextElement element : fromContextElements) {
				if(element.getName().equals(qualifiedName)) {
					return element;
				}
			}
		}
		return null;
	}

	/**
	 * Returns the list of Context on which the given context depends, directly
	 * or indirectly
	 * 
	 * @param context
	 *        The context for which we want to retrieve the list of dependencies
	 * @return
	 *         The list of Contexts on which the given context depends
	 */
	public static List<Context> getDependencies(Context context) {
		List<Context> result = new LinkedList<Context>();
		if(context == null)
			return result;

		result.add(context);
		findDependencies(context, result);
		return result;
	}

	private static void findDependencies(Context context, List<Context> result) {
		for(Context dependency : context.getDependencies()) {
			if(!result.contains(dependency)) {
				result.add(dependency);
				findDependencies(dependency, result);
			}
		}
	}

	/**
	 * Returns the set of DataContextElement containing the whole inheritance hierarchy
	 * for the given source DataContextElements
	 * 
	 * @param source
	 *        The collection of DataContextElements for which we want to retrieve all inherited elements
	 * @return
	 *         All DataContextElements inherited (Directly or indirectly) by at least one of the source
	 *         context elements
	 */
	public static Set<DataContextElement> getAllContextElements(Collection<DataContextElement> source) {
		Set<DataContextElement> result = new HashSet<DataContextElement>();
		getAllContextElements(source, result);
		return result;
	}

	private static void getAllContextElements(Collection<DataContextElement> source, Set<DataContextElement> result) {
		for(DataContextElement element : source) {
			if(!result.contains(element)) {
				result.add(element);
				getAllContextElements(element.getSupertypes(), result);
			}
		}
	}
}
