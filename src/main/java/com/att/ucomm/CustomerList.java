package com.att.ucomm;

import  java.text.*;
import java.util.*;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.Consumes;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.att.ucomm.models.Customer;
import com.att.ucomm.controllers.*;

@Path("/customers")
public class CustomerList {
	
	@GET
	@Path("/{bans}")
	@Produces(MediaType.APPLICATION_JSON)
	public HashMap<String, Customer> customers( @PathParam("bans") String bans) {
		
		DatabaseController db = new DatabaseController();
		HashMap<String, Customer> customers = new HashMap<String, Customer>();
		String[] banList = bans.split("-");
		
		for (Customer c : db.loadCustomers()) {
			for (String b : banList) {
				if (c.getBan() == Integer.parseInt(b)) {
					customers.put(b, c);
				}
			}
		}
		
		return customers;
	}

}
