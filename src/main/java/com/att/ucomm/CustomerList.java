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

@Path("/customers")
public class CustomerList {
	
	List<Customer> allCustomers = new ArrayList<Customer>();

	@GET
	@Path("/{bans}")
	@Produces(MediaType.APPLICATION_JSON)
	public HashMap<String, Customer> customers( @PathParam("bans") String bans) {
		
		HashMap<String, Customer> customers = new HashMap<String, Customer>();
		loadData();
		String[] banList = bans.split("-");
		
		for (Customer c : allCustomers) {
			for (String b : banList) {
				if (c.getBan() == Integer.parseInt(b)) {
					customers.put(b, c);
				}
			}
		}
		customers.put(banList[0], allCustomers.get(0));
		
		return customers;
	}

	
	public void loadData() {
		
		Customer c1 = new Customer("Customer1", 1234, "SomeWhere", "40.414830", "-74.229589");
		Customer c2 = new Customer("Customer2", 5678, "SomeWhere", "40.430450", "-74.254159");
		Customer c3 = new Customer("Customer3", 1000, "SomeWhere", "40.410450", "-74.234159");
		allCustomers.add(c1);
		allCustomers.add(c2);
		allCustomers.add(c3);
	}
}
