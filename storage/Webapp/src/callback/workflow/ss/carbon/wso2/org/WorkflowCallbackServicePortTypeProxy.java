package callback.workflow.ss.carbon.wso2.org;

public class WorkflowCallbackServicePortTypeProxy implements callback.workflow.ss.carbon.wso2.org.WorkflowCallbackServicePortType {
  private String _endpoint = null;
  private callback.workflow.ss.carbon.wso2.org.WorkflowCallbackServicePortType workflowCallbackServicePortType = null;
  
  public WorkflowCallbackServicePortTypeProxy() {
    _initWorkflowCallbackServicePortTypeProxy();
  }
  
  public WorkflowCallbackServicePortTypeProxy(String endpoint) {
    _endpoint = endpoint;
    _initWorkflowCallbackServicePortTypeProxy();
  }
  
  private void _initWorkflowCallbackServicePortTypeProxy() {
    try {
      workflowCallbackServicePortType = (new callback.workflow.ss.carbon.wso2.org.WorkflowCallbackServiceLocator()).getWorkflowCallbackServiceHttpsSoap11Endpoint();
      if (workflowCallbackServicePortType != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)workflowCallbackServicePortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)workflowCallbackServicePortType)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (workflowCallbackServicePortType != null)
      ((javax.xml.rpc.Stub)workflowCallbackServicePortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public callback.workflow.ss.carbon.wso2.org.WorkflowCallbackServicePortType getWorkflowCallbackServicePortType() {
    if (workflowCallbackServicePortType == null)
      _initWorkflowCallbackServicePortTypeProxy();
    return workflowCallbackServicePortType;
  }
  
  public void resumeEvent(java.lang.String workflowReference, java.lang.String status, java.lang.String description) throws java.rmi.RemoteException{
    if (workflowCallbackServicePortType == null)
      _initWorkflowCallbackServicePortTypeProxy();
    workflowCallbackServicePortType.resumeEvent(workflowReference, status, description);
  }
  
  
}