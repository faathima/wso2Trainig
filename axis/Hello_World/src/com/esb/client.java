package com.esb;

import java.io.FileInputStream;

import org.apache.axis2.Constants;
import org.apache.axis2.client.Options;
import org.apache.axis2.client.ServiceClient;
import org.apache.axis2.transport.http.HTTPConstants;
import org.apache.axis2.transport.http.HttpTransportProperties;
import org.apache.neethi.PolicyEngine;
import org.apache.rampart.RampartMessageData;


public class client {
	private static String SERVICE_EPR = "https://msffayaza-TECRA-M11:8243/services/hello_World";
	private static String CARBON_JKS_PATH = "/home/msffayaza/wso2esb-4.8.1/repository/resources/security/wso2carbon.jks"; 
	public static void main(String args[])throws Exception { 
		try { 
			Hello_WorldStub stub = new Hello_WorldStub(SERVICE_EPR);
			ServiceClient service=stub._getServiceClient(); 
			Options options = new Options(); 
        	System.setProperty("javax.net.ssl.trustStore", CARBON_JKS_PATH); 
        	System.setProperty("javax.net.ssl.trustStorePassword", "wso2carbon"); 
        	HttpTransportProperties.Authenticator authenticator = new HttpTransportProperties.Authenticator(); 
        	authenticator.setUsername("admin"); 
        	authenticator.setPassword("admin"); 
        	stub._getServiceClient().getOptions() .setProperty(HTTPConstants.AUTHENTICATE, authenticator);
        	stub._getServiceClient().getOptions() .setProperty(Constants.Configuration.ENABLE_REST, Constants.VALUE_TRUE);


        	/*System.setProperty("javax.net.ssl.trustStore", "CARBON_JKS_PATH");
        	System.setProperty("javax.net.ssl.trustStorePassword", "wso2carbon");

        	Hello_WorldStub stub = new Hello_WorldStub(SERVICE_EPR);
        	

        	stub._getServiceClient().getOptions().setUserName("admin");

        	stub._getServiceClient().getOptions().setProperty(RampartMessageData.KEY_RAMPART_POLICY,
        	         PolicyEngine.getPolicy(new FileInputStream("src/com/esb/policy.xml")));

        	stub._getServiceClient().engageModule("rampart");
        	HttpTransportProperties.Authenticator authenticator = new HttpTransportProperties.Authenticator();
        	authenticator.setUsername("admin");
        	authenticator.setPassword("admin");

        	stub._getServiceClient().getOptions().setProperty(HTTPConstants.AUTHENTICATE, authenticator);
        	stub._getServiceClient().getOptions().setProperty(Constants.Configuration.ENABLE_REST, Constants.VALUE_TRUE);*/


        	
        	/*System.setProperty("javax.net.ssl.trustStore", "client/conf/wso2carbon.jks");
        	System.setProperty("javax.net.ssl.trustStorePassword", "wso2carbon");

        	CustomerOrderServiceStub stub = new CustomerOrderServiceStub("https://localhost:8243/services/CustomerOrderService");
        	HttpTransportProperties.Authenticator authenticator = new HttpTransportProperties.Authenticator();
        	authenticator.setUsername("amila");
        	authenticator.setPassword("chinthaka");

        	stub._getServiceClient().getOptions().setProperty(HTTPConstants.AUTHENTICATE, authenticator);
        	stub._getServiceClient().getOptions().setProperty(Constants.Configuration.ENABLE_REST, Constants.VALUE_TRUE);*/
	     
	    
	     //Creating the request
	     com.esb.Hello_WorldStub.SayHello  request = new  com.esb.Hello_WorldStub.SayHello();
	     request.setName("ffms");
	   
	     //Invoking the service
	     com.esb.Hello_WorldStub.SayHelloResponse response  = stub.sayHello(request);
	     System.out.println("Response : " + response.get_return());
	    }
		catch(Exception e){
			e.printStackTrace();
			}
		}
}
