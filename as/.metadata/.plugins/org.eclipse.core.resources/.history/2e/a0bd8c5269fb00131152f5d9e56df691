package com.jaxrs;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.core.Response;

public class client {
	public static void main (String [] args){
	   Client client = ClientBuilder.newClient();
	   Response res = client.target("http://10.100.4.100:9763/JAX-RS_1.0.0/1.0/services/hello/hello").request("text/plain").get();
	   System.out.println(res);
}
}
