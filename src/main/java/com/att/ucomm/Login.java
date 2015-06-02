package com.att.ucomm;

import java.util.*;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.Consumes;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;


@Path("/login")
public class Login {
	
	Map<String, String> users = new HashMap<String, String>();
	
	
	@POST
	@Path("/{id}/{pass}")
	@Produces(MediaType.APPLICATION_JSON)
	public boolean isUserValid( @PathParam("id") String id, @PathParam("pass") String pass) {
	
	// populate user map from database
	users.put("kaveh", "att");
	users.put("masih", "masih");
	
	for (Map.Entry<String, String> user : users.entrySet()) {
		if ( id.equals(user.getKey()) && pass.equals(user.getValue())) {
			return true;
		}
	}
	
	
	
	return false;
	}

}
