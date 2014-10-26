package org.wso2.carbon.humantask.sample;

import org.apache.axiom.om.OMAbstractFactory;
import org.apache.axiom.soap.SOAP12Constants;
import org.apache.axis2.AxisFault;
import org.apache.axis2.Constants;
import org.apache.axis2.addressing.AddressingConstants;
import org.apache.axis2.addressing.EndpointReference;
import org.apache.axis2.client.Options;
import org.apache.axis2.client.ServiceClient;
import javax.xml.namespace.QName;
import javax.xml.namespace.QName;
import org.wso2.carbon.humantask.core.api.event.HumanTaskEventListener;
import org.wso2.carbon.humantask.core.api.event.TaskEventInfo;
import org.wso2.carbon.humantask.core.dao.TaskType;

public class SimpleEventListener implements HumanTaskEventListener {
	@Override
	public void onEvent(TaskEventInfo taskEventInfo) {
		System.out.println("[ Task ID : " + taskEventInfo.getTaskInfo().getId()
				+ " ] [ Event : " + taskEventInfo.getEventType() + " ] at "
				+ taskEventInfo.getTaskInfo().getModifiedDate());
		if (taskEventInfo.getTaskInfo().getType() == TaskType.TASK) {
			System.out.println("\tTask Name :"
					+ taskEventInfo.getTaskInfo().getName());
			System.out.println("\tTask Subject :"
					+ taskEventInfo.getTaskInfo().getSubject());
			System.out.println("\tTask Description :"
					+ taskEventInfo.getTaskInfo().getDescription());
			System.out.println("\tTask Owner : "
					+ taskEventInfo.getTaskInfo().getOwner());
			ServiceClient serviceClient = null;
	        try {
	            serviceClient = new ServiceClient();
	       

	        Options options = serviceClient.getOptions();

	        EndpointReference targetEPR = new EndpointReference(
	                "mailto:faathima@ws02.com");
	        options.setTo(targetEPR);
	    
	        QName opAddItem = new QName("http://service.orderpocessing.com", "addItem");
	      
	            serviceClient.fireAndForget(OMAbstractFactory.getSOAP12Factory().createOMElement(opAddItem));;
	        } catch (AxisFault e) {
	            // TODO Auto-generated catch block
	            e.printStackTrace();
	        }


		} else if (taskEventInfo.getTaskInfo().getType() == TaskType.NOTIFICATION) {
			System.out.println("\tNotification Name :"
					+ taskEventInfo.getTaskInfo().getName());
			System.out.println("\tNotification Subject :"
					+ taskEventInfo.getTaskInfo().getSubject());
			System.out.println("\tNotification Description :"
					+ taskEventInfo.getTaskInfo().getDescription());
		}
	}

}
