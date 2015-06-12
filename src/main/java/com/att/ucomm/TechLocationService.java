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

import com.att.ucomm.models.Tech;

@Path("/techlocation")
public class TechLocationService {

	List<Tech> allTech = new ArrayList<Tech>();

	@GET
	@Path("/{techid}")
	@Produces(MediaType.APPLICATION_JSON)
	public HashMap<String, List> techLocations(@PathParam("techid") String techid) {

		HashMap<String, List> techlocations = new HashMap<String, List>();
		loadData();
		String[] idList = techid.split("-");


		for (Tech t : allTech) {
			for (String id : idList) {
				if (t.getId().equals(id)) {
					List<String> location = Arrays.asList(t.getLatitude(), t.getLongitude());
					techlocations.put(t.getName(), location);
				}
			}
		}
		return techlocations;
	}


	public void loadData() {

		Tech t1 = new Tech("Mark Hughes", "tm1038", "40.397549", "-74.135592", 0, "jj0000");
		Tech t2 = new Tech("Marry Molehill", "mk1017", "40.384170", "-74.161266", 1, "jj0000");
		Tech t3 = new Tech("Richard Nelson", "ll1010", "40.364170", "-74.191266", 2, "jj0000");
		allTech.add(t1);
		allTech.add(t2);
		allTech.add(t3);
	}
}
