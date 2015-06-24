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

import com.att.ucomm.controllers.DatabaseController;
import com.att.ucomm.models.Tech;

@Path("/techlocation")
public class TechLocationService {

	@GET
	@Path("/{techid}")
	@Produces(MediaType.APPLICATION_JSON)
	public HashMap<String, List> techLocations(@PathParam("techid") String techid) {

		HashMap<String, List> techlocations = new HashMap<String, List>();
		DatabaseController db = new DatabaseController();
		String[] idList = techid.split("-");


		for (Tech t : db.loadTechs()) {
			for (String id : idList) {
				if (t.getId().equals(id)) {
					List<String> location = Arrays.asList(t.getLatitude(), t.getLongitude());
					techlocations.put(t.getName(), location);
				}
			}
		}
		return techlocations;
	}
}
