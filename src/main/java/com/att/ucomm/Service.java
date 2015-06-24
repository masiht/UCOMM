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
import com.att.ucomm.models.Job;
import com.att.ucomm.models.Tech;


/*returns the list of technicians and the list of jobs associated with each of them */
@Path("/jobService")
public class Service {
	
	ArrayList<Tech> allTechs = new ArrayList<Tech>(); 
	
	@GET
	@Path("/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public HashMap<String, ArrayList<Job>> currentJobs( @PathParam("id") String id ) {
		
		HashMap<String, ArrayList<Job>> jobMap = new HashMap<String, ArrayList<Job>>();
		DatabaseController db = new DatabaseController();
		allTechs = db.loadTechs();
		
		// iterate thru teches for all jobs
		for (Tech t : techForCoc(id)) {
			ArrayList<Job> jobsforATech = new ArrayList<Job>();
			for (Job j : db.loadJobs()) {
				if (j.getTechId().equals(t.getId())) {
					
					jobsforATech.add(j);
				}
			}
			jobMap.put(t.getName(), jobsforATech);
		}

		return jobMap;

	}
	
	/*Helper method to get list of Techs given COC */
	public List<Tech> techForCoc(String coc) {
		List<Tech> foundTeches = new ArrayList<Tech>();
		for (Tech t : allTechs) {
			if (t.getCoc().equals(coc)) {
				foundTeches.add(t);
			}
		}
		return foundTeches;
	}
	
	

}