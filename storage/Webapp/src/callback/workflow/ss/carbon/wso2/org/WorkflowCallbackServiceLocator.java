/**
 * WorkflowCallbackServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package callback.workflow.ss.carbon.wso2.org;

public class WorkflowCallbackServiceLocator extends org.apache.axis.client.Service implements callback.workflow.ss.carbon.wso2.org.WorkflowCallbackService {

    public WorkflowCallbackServiceLocator() {
    }


    public WorkflowCallbackServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public WorkflowCallbackServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for WorkflowCallbackServiceHttpsSoap11Endpoint
    private java.lang.String WorkflowCallbackServiceHttpsSoap11Endpoint_address = "https://10.100.4.100:9443/services/WorkflowCallbackService.WorkflowCallbackServiceHttpsSoap11Endpoint/";

    public java.lang.String getWorkflowCallbackServiceHttpsSoap11EndpointAddress() {
        return WorkflowCallbackServiceHttpsSoap11Endpoint_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String WorkflowCallbackServiceHttpsSoap11EndpointWSDDServiceName = "WorkflowCallbackServiceHttpsSoap11Endpoint";

    public java.lang.String getWorkflowCallbackServiceHttpsSoap11EndpointWSDDServiceName() {
        return WorkflowCallbackServiceHttpsSoap11EndpointWSDDServiceName;
    }

    public void setWorkflowCallbackServiceHttpsSoap11EndpointWSDDServiceName(java.lang.String name) {
        WorkflowCallbackServiceHttpsSoap11EndpointWSDDServiceName = name;
    }

    public callback.workflow.ss.carbon.wso2.org.WorkflowCallbackServicePortType getWorkflowCallbackServiceHttpsSoap11Endpoint() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(WorkflowCallbackServiceHttpsSoap11Endpoint_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getWorkflowCallbackServiceHttpsSoap11Endpoint(endpoint);
    }

    public callback.workflow.ss.carbon.wso2.org.WorkflowCallbackServicePortType getWorkflowCallbackServiceHttpsSoap11Endpoint(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            callback.workflow.ss.carbon.wso2.org.WorkflowCallbackServiceSoap11BindingStub _stub = new callback.workflow.ss.carbon.wso2.org.WorkflowCallbackServiceSoap11BindingStub(portAddress, this);
            _stub.setPortName(getWorkflowCallbackServiceHttpsSoap11EndpointWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setWorkflowCallbackServiceHttpsSoap11EndpointEndpointAddress(java.lang.String address) {
        WorkflowCallbackServiceHttpsSoap11Endpoint_address = address;
    }


    // Use to get a proxy class for WorkflowCallbackServiceHttpSoap11Endpoint
    private java.lang.String WorkflowCallbackServiceHttpSoap11Endpoint_address = "http://10.100.4.100:9763/services/WorkflowCallbackService.WorkflowCallbackServiceHttpSoap11Endpoint/";

    public java.lang.String getWorkflowCallbackServiceHttpSoap11EndpointAddress() {
        return WorkflowCallbackServiceHttpSoap11Endpoint_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String WorkflowCallbackServiceHttpSoap11EndpointWSDDServiceName = "WorkflowCallbackServiceHttpSoap11Endpoint";

    public java.lang.String getWorkflowCallbackServiceHttpSoap11EndpointWSDDServiceName() {
        return WorkflowCallbackServiceHttpSoap11EndpointWSDDServiceName;
    }

    public void setWorkflowCallbackServiceHttpSoap11EndpointWSDDServiceName(java.lang.String name) {
        WorkflowCallbackServiceHttpSoap11EndpointWSDDServiceName = name;
    }

    public callback.workflow.ss.carbon.wso2.org.WorkflowCallbackServicePortType getWorkflowCallbackServiceHttpSoap11Endpoint() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(WorkflowCallbackServiceHttpSoap11Endpoint_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getWorkflowCallbackServiceHttpSoap11Endpoint(endpoint);
    }

    public callback.workflow.ss.carbon.wso2.org.WorkflowCallbackServicePortType getWorkflowCallbackServiceHttpSoap11Endpoint(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            callback.workflow.ss.carbon.wso2.org.WorkflowCallbackServiceSoap11BindingStub _stub = new callback.workflow.ss.carbon.wso2.org.WorkflowCallbackServiceSoap11BindingStub(portAddress, this);
            _stub.setPortName(getWorkflowCallbackServiceHttpSoap11EndpointWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setWorkflowCallbackServiceHttpSoap11EndpointEndpointAddress(java.lang.String address) {
        WorkflowCallbackServiceHttpSoap11Endpoint_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     * This service has multiple ports for a given interface;
     * the proxy implementation returned may be indeterminate.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (callback.workflow.ss.carbon.wso2.org.WorkflowCallbackServicePortType.class.isAssignableFrom(serviceEndpointInterface)) {
                callback.workflow.ss.carbon.wso2.org.WorkflowCallbackServiceSoap11BindingStub _stub = new callback.workflow.ss.carbon.wso2.org.WorkflowCallbackServiceSoap11BindingStub(new java.net.URL(WorkflowCallbackServiceHttpsSoap11Endpoint_address), this);
                _stub.setPortName(getWorkflowCallbackServiceHttpsSoap11EndpointWSDDServiceName());
                return _stub;
            }
            if (callback.workflow.ss.carbon.wso2.org.WorkflowCallbackServicePortType.class.isAssignableFrom(serviceEndpointInterface)) {
                callback.workflow.ss.carbon.wso2.org.WorkflowCallbackServiceSoap11BindingStub _stub = new callback.workflow.ss.carbon.wso2.org.WorkflowCallbackServiceSoap11BindingStub(new java.net.URL(WorkflowCallbackServiceHttpSoap11Endpoint_address), this);
                _stub.setPortName(getWorkflowCallbackServiceHttpSoap11EndpointWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("WorkflowCallbackServiceHttpsSoap11Endpoint".equals(inputPortName)) {
            return getWorkflowCallbackServiceHttpsSoap11Endpoint();
        }
        else if ("WorkflowCallbackServiceHttpSoap11Endpoint".equals(inputPortName)) {
            return getWorkflowCallbackServiceHttpSoap11Endpoint();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://org.wso2.carbon.ss.workflow.callback", "WorkflowCallbackService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://org.wso2.carbon.ss.workflow.callback", "WorkflowCallbackServiceHttpsSoap11Endpoint"));
            ports.add(new javax.xml.namespace.QName("http://org.wso2.carbon.ss.workflow.callback", "WorkflowCallbackServiceHttpSoap11Endpoint"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("WorkflowCallbackServiceHttpsSoap11Endpoint".equals(portName)) {
            setWorkflowCallbackServiceHttpsSoap11EndpointEndpointAddress(address);
        }
        else 
if ("WorkflowCallbackServiceHttpSoap11Endpoint".equals(portName)) {
            setWorkflowCallbackServiceHttpSoap11EndpointEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
