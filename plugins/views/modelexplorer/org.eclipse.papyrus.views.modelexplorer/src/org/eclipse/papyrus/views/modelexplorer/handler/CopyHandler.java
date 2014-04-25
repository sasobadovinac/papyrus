/*****************************************************************************
 * Copyright (c) 2011, 2014 CEA LIST and others.
 *
 *    
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *  Vincent Lorenzo (CEA LIST) vincent.lorenzo@cea.fr - Initial API and implementation
 *  Benoit Maggi (CEA LIST) benoit.maggi@cea.fr - Use of a paste strategies
 *****************************************************************************/
package org.eclipse.papyrus.views.modelexplorer.handler;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.papyrus.infra.core.clipboard.PapyrusClipboard;
import org.eclipse.papyrus.infra.gmfdiag.common.commands.DefaultCopyCommand;
import org.eclipse.papyrus.infra.gmfdiag.common.strategy.IStrategy;
import org.eclipse.papyrus.infra.gmfdiag.common.strategy.paste.IPasteStrategy;
import org.eclipse.papyrus.infra.gmfdiag.common.strategy.paste.PasteStrategyManager;

/**
 * Handler for the Copy Action
 */
public class CopyHandler extends AbstractCommandHandler {

	/**
	 * Check if the selection allow copy
	 * @param selectedElements
	 * @return
	 */
	public static boolean isCopyEnabled(Collection<EObject> selectedElements) {
		return !selectedElements.isEmpty();
	}	

	/**
	 * Construct copy command from the selection
	 * @param editingDomain
	 * @param selectedElements
	 * @return
	 */
	public static Command buildCopyCommand(TransactionalEditingDomain editingDomain, Collection<EObject> selectedElements) {
		PapyrusClipboard<Object> papyrusClipboard = PapyrusClipboard.getNewInstance();
		DefaultCopyCommand defaultCopyCommand = new DefaultCopyCommand(editingDomain, papyrusClipboard, selectedElements); 
		List<IStrategy> allStrategies = PasteStrategyManager.getInstance().getAllStrategies();
		for(IStrategy iStrategy : allStrategies) {
			IPasteStrategy iPasteStrategy = (IPasteStrategy)iStrategy;
			iPasteStrategy.prepare(papyrusClipboard, selectedElements);
		}
		return defaultCopyCommand;		
	}
	
	/**
	 * 
	 * @see org.eclipse.papyrus.views.modelexplorer.handler.AbstractCommandHandler#getCommand()
	 * 
	 * @return
	 */
	@Override
	protected Command getCommand() {
		return buildCopyCommand(getEditingDomain(),getSelectedElements());
	}
	
	/* (non-Javadoc)
	 * @see org.eclipse.papyrus.views.modelexplorer.handler.AbstractCommandHandler#computeEnabled()
	 */
	@Override
	protected boolean computeEnabled() { // copy is enable as long as there is an EObject to put in the Clipboard
		return isCopyEnabled(getSelectedElements());
	}
	

	/* (non-Javadoc)
	 * @see org.eclipse.papyrus.views.modelexplorer.handler.AbstractCommandHandler#setEnabled(java.lang.Object)
	 */
	@Override
	public void setEnabled(Object evaluationContext) {
		PapyrusClipboard<Object> instance = PapyrusClipboard.getInstance();
		super.setEnabled(evaluationContext); // setenabled should'nt clear/modify the clipboard
		PapyrusClipboard.setInstance(instance);
	}
	
}
