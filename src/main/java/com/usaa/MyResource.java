package com.usaa;

import java.util.HashMap;
import javax.enterprise.context.RequestScoped;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@RequestScoped
@Path("/resources")
public class MyResource {
	
	@GET()
	@Produces("application/json")
	public HashMap<String,String> getResource() {
		HashMap<String, String> theResource = new HashMap<String, String>();
		theResource.put("someAttr", "value");
		theResource.put("someAttr2", "value 2");
		return theResource;
	}
}
