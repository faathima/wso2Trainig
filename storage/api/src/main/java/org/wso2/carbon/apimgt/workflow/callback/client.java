package org.wso2.carbon.apimgt.workflow.callback;

public class client {
public static void main(String [] args){
	//WorkflowCallbackServiceSkelton 
	org.wso2.carbon.apimgt.workflow.callback.WorkflowCallbackServiceSkeleton sk= new org.wso2.carbon.apimgt.workflow.callback.WorkflowCallbackServiceSkeleton();
	sk.resumeEvent(resumeEvent);
}
}
