package com.usaa;

import java.util.HashMap;
import javax.enterprise.context.RequestScoped;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@RequestScoped
@Path("/insult")
public class MyResource {
	
	@GET()
	@Produces("application/json")
	public HashMap<String,String> getInsult() {
		HashMap<String, String> theInsult = new HashMap<String, String>();
		theInsult.put("someName", "value");
		return theInsult;
	}
}