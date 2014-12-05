package org.eclipse.papyrus.revision.tool.command;

import org.eclipse.emf.compare.Diff;
import org.eclipse.emf.compare.Match;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.papyrus.revision.tool.core.ReviewResourceManager;

/**
 * this Command is used to add a diff erence into the model and to add the element inorder to make the difference with the currnet model
 * @author PT202707
 *
 */
public class CreateDiffSetCommand extends RecordingCommand {
	protected ReviewResourceManager reviewResourceManager;
/**
 * 
 * @param domain
 * @param reviewResourceManager
 */
	public CreateDiffSetCommand(TransactionalEditingDomain domain, ReviewResourceManager reviewResourceManager) {
		super(domain);
		this.reviewResourceManager= reviewResourceManager;
	}
@Override
	protected void doExecute() {
		// TODO Auto-generated method stub
	//	reviewResourceManager.getStashChangesModel();
	}
}
