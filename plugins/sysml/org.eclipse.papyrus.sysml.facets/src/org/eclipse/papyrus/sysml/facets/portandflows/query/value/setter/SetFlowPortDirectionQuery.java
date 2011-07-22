package org.eclipse.papyrus.sysml.facets.portandflows.query.value.setter;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.facet.infra.query.core.exception.ModelQueryExecutionException;
import org.eclipse.emf.facet.infra.query.core.java.IJavaModelQueryWithEditingDomain;
import org.eclipse.emf.facet.infra.query.core.java.ParameterValueList;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.papyrus.core.services.ServiceException;
import org.eclipse.papyrus.core.utils.GMFtoEMFCommandWrapper;
import org.eclipse.papyrus.core.utils.ServiceUtilsForActionHandlers;
import org.eclipse.papyrus.gmf.diagram.common.commands.IdentityCommandWithNotification;
import org.eclipse.papyrus.sysml.facets.messages.Messages;
import org.eclipse.papyrus.sysml.portandflows.FlowDirection;
import org.eclipse.papyrus.sysml.portandflows.FlowPort;
import org.eclipse.papyrus.sysml.portandflows.PortandflowsPackage;
import org.eclipse.papyrus.sysml.util.ElementUtil;
import org.eclipse.papyrus.ui.toolbox.notification.Type;
import org.eclipse.uml2.uml.Port;

/** Query to qet the attribute "Direction" of the FlowPort */
public class SetFlowPortDirectionQuery implements IJavaModelQueryWithEditingDomain<Port, FlowDirection> {

	public FlowDirection evaluate(final Port context, final ParameterValueList parameterValues)
			throws ModelQueryExecutionException {
		//nothing to do
		return null;
	}

	public FlowDirection evaluate(Port context, ParameterValueList parameterValues, EditingDomain editingDomain) throws ModelQueryExecutionException {
		FlowPort flowPort = ElementUtil.getStereotypeApplication(context, FlowPort.class);

		if(flowPort != null) {
			if(!((parameterValues.isEmpty()) || (parameterValues.get(0) == null))) {



				// Retrieve new value from parameter and update if the property value has changed.
				Enumerator newValue = (parameterValues.get(0).getValue() instanceof Enumerator) ? (Enumerator)parameterValues.get(0).getValue() : null;
				if(newValue != flowPort.getDirection()) {
					try {
						TransactionalEditingDomain domain = ServiceUtilsForActionHandlers.getInstance().getTransactionalEditingDomain();
						SetCommand command = new SetCommand(domain, flowPort, PortandflowsPackage.eINSTANCE.getFlowPort_Direction(), newValue);
						if(command.canExecute()) {
							domain.getCommandStack().execute(command);
						}

					} catch (ServiceException e) {
						throw new ModelQueryExecutionException(e);
					}

				}
			}
		} else {
			editingDomain.getCommandStack().execute(new GMFtoEMFCommandWrapper(new IdentityCommandWithNotification(Messages.SetRequirementTextQuery_AssignmentCantBeDone, "The edited element is not a SysML FlowPort.", Type.ERROR)));
		}

		return null;
	}
}
