package com.att.ucomm;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.Consumes;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.att.ucomm.models.Job;



@Path("/jobService")
public class Service {
	
	List<Job> jobList = new ArrayList<Job>();
	
	
	@GET
	@Path("/{techId}")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Job> currentJobs( @PathParam("techId") String techId ) {
		
		// data base interactions
		//
		/*Job j1 = new Job("1038mt", 1234, 420, "WIP", "installation");
		Job j2 = new Job("1038mt", 4567, 420, "WIP", "repair");
		Job j3 = new Job("1038mt", 2323, 420, "WIP", "repair");
		
		Job j4 = new Job("1017mk", 9999, 999, "N/A", "N/A");*/
/*		List<Job> allJobs = new ArrayList<Job>();
		allJobs.add(j1);
		allJobs.add(j2);
		allJobs.add(j3);
		allJobs.add(j4);
		*/
		// search for given tech id
		//
/*		for (Job j : allJobs) {
			if (j.getTechId().equals(techId)) {
				jobList.add(j);
			}
		}*/
		

		return jobList;

	}

}