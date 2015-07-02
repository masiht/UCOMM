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

import com.att.ucomm.controllers.*;

@Path("/login")
public class Login {
	
//	Map<String, String> users = new HashMap<String, String>();
	
	
	@GET
	@Path("/{id}/{pass}")
	@Produces(MediaType.APPLICATION_JSON)
	public HashMap<String, Boolean> isUserValid(@PathParam("id") String id, @PathParam("pass") String pass) {
	
	// retrieve user map from database

		DatabaseController db = new DatabaseController();
//		users = db.user();
		HashMap<String, Boolean> validation = new HashMap<String, Boolean>();
		validation.put("isValid", false);
	
	for (Map.Entry<String, String> user : db.user().entrySet()) {
		if ( id.equals(user.getKey()) && pass.equals(user.getValue())) {
			validation.put("isValid", true);
		}
	}
	return validation;
	}

}
