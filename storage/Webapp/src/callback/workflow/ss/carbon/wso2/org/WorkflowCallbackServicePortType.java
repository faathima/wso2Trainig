/**
 * WorkflowCallbackServicePortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package callback.workflow.ss.carbon.wso2.org;

public interface WorkflowCallbackServicePortType extends java.rmi.Remote {
    public void resumeEvent(java.lang.String workflowReference, java.lang.String status, java.lang.String description) throws java.rmi.RemoteException;
}
