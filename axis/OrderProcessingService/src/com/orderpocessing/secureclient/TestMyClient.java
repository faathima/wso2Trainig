package com.orderpocessing.secureclient;

import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.List;

import org.apache.axis2.AxisFault;
import org.apache.axis2.Constants;
import org.apache.axis2.client.Options;
import org.apache.axis2.client.ServiceClient;
import org.apache.axis2.transport.http.HTTPConstants;
import org.apache.axis2.transport.http.HttpTransportProperties;
import org.apache.commons.httpclient.Header;

import com.orderpocessing.secureclient.OrderProcessingServiceStub.*;



public class TestMyClient {
	private static String SERVICE_EPR = "https://msffayaza-TECRA-M11:8243/services/orderProcessingService";
	private static String CARBON_JKS_PATH = "/home/msffayaza/wso2esb-4.8.1/repository/resources/security/wso2carbon.jks";
	
	public static void main(String args[]){
		try {
		OrderProcessingServiceStub stub=new OrderProcessingServiceStub(SERVICE_EPR);
		ServiceClient service=stub._getServiceClient();
		Options options = new Options();
		System.setProperty("javax.net.ssl.trustStore", CARBON_JKS_PATH);
		System.setProperty("javax.net.ssl.trustStorePassword", "wso2carbon");
		HttpTransportProperties.Authenticator authenticator = new HttpTransportProperties.Authenticator();
		authenticator.setUsername("admin");
		authenticator.setPassword("admin");
		stub._getServiceClient().getOptions()
				           .setProperty(HTTPConstants.AUTHENTICATE, authenticator);
		stub._getServiceClient().getOptions()
			           .setProperty(Constants.Configuration.ENABLE_REST, Constants.VALUE_TRUE);
		
		Item item=new Item();
		item.setId(1);
		item.setName("Bicycle");
		item.setPrice(200);
		item.setDescription("This is a normal bicycle");
		
		AddItem request=new AddItem();
		request.setItem(item);
		
		AddItemResponse response1=stub.addItem(request);
		System.out.println(response1.get_return().getName());
		
		} catch (AxisFault e) {
			e.printStackTrace();
		} catch (RemoteException e) {
			e.printStackTrace();
		}
	}
}
