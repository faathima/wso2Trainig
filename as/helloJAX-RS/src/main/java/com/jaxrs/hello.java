package com.jaxrs;

import javax.ws.rs.*;

@Path("/hello")
public class hello {
		@GET
		@Produces("text/plain")
		public String sayHello() {
			return "Hello......................";
		}

	}
