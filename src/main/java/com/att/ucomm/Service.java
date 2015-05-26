package com.att.ucomm;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.Consumes;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;


@Path("/jobService")
public class Service {
	
	@GET
	@Path("/{techId}")
	@Produces(MediaType.APPLICATION_JSON)
	public Job produceJSON( @PathParam("techId") String techId ) {

		Job j1 = new Job(techId, 1234, 420, "WIP", "installation");

		return j1;

	}

}