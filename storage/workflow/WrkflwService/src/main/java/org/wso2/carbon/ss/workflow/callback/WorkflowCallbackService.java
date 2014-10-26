package org.wso2.carbon.ss.workflow.callback;s
import org.apache.axiom.om.util.AXIOMUtil;
import org.apache.axis2.AxisFault;
import org.apache.axis2.Constants;
import org.apache.axis2.addressing.EndpointReference;
import org.apache.axis2.client.Options;
import org.apache.axis2.client.ServiceClient;
import org.apache.axis2.transport.http.HTTPConstants;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
public class WorkflowCallbackService{
private static final Log log = LogFactory.getLog(WorkflowCallbackService.class);
public void resumeEvent(String workflowReference,String status, String description ){
	String workflowReff =workflowReference;
	String wfStatus =status;
	String wfDescription= description;
	
	System.out.print(workflowReff);
	System.out.print(wfStatus);
	System.out.print(wfDescription);
	System.out.println("ffms axis2 service for call back");
	String serviceEndpoint = null;
	String contentType=null;
	try{
	ServiceClient client=new ServiceClient();
	
     Options options = new Options();
     options.setAction("");
     options.setTo(new EndpointReference(serviceEndpoint));

    
     client.setOptions(options);

     String payload =
             "<wor:CreateDBApprovalWorkFlowProcessRequest xmlns:wor=\"http://workflow.createdb.ss.carbon.wso2.org\">\n"
                     + "        <wor:DatabaseName>$1</wor:DatabaseName>\n"

                     +"</wor:CreateDBApprovalWorkFlowProcessRequest>";
    

     payload = payload.replace("$1",contentType);
  
     client.fireAndForget(AXIOMUtil.stringToOM(payload));

 } catch (AxisFault axisFault) {
     axisFault.printStackTrace();

 } catch (Exception e) {
     e.printStackTrace();

 }
	}

}