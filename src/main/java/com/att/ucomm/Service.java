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

import com.att.ucomm.models.Job;
import com.att.ucomm.models.Tech;


/*returns the list of technicians and the list of jobs associated with each of them */
@Path("/jobService")
public class Service {
	
	ArrayList<Job> jobList = new ArrayList<Job>();
	List<Tech> allTeches = new ArrayList<Tech>();
	List<Job> allJobs = new ArrayList<Job>();
	
	@GET
	@Path("/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public HashMap<String, ArrayList<Job>> currentJobs( @PathParam("id") String id ) {
		
		HashMap<String, ArrayList<Job>> jobMap = new HashMap<String, ArrayList<Job>>();
		
		loadData();
		
		// iterate thru teches for all jobs
		for (Tech t : techForCoc(id)) {
			ArrayList<Job> jobsforATech = new ArrayList<Job>();
			for (Job j : allJobs) {
				if (j.getTechId().equals(t.getId())) {
					
					jobsforATech.add(j);
				}
			}
			jobMap.put(t.getName(), jobsforATech);
		}

		return jobMap;

	}
	
	/*Helper method to get list of Teches given COC */
	public List<Tech> techForCoc(String coc) {
		List<Tech> foundTeches = new ArrayList<Tech>();
		for (Tech t : allTeches) {
			if (t.getCoc().equals(coc)) {
				foundTeches.add(t);
			}
		}
		return foundTeches;
	}
	
	
	public void loadData() {
		// data base interactions
		//
		Job j1 = new Job("tm1038", 1234, 420, "06-02-2015", "04:00", "05:00", "WIP", "installation");
		Job j2 = new Job("mk1017", 4567, 421, "06-02-2015", "04:00", "05:00", "WIP", "repair");
		
		allJobs.add(j1);
		allJobs.add(j2);

		// load Teches
		Tech t1 = new Tech("Mark Hughes", "tm1038", 40.397549, -74.135592, 0, "jj0000");
		Tech t2 = new Tech("Marry Molehill", "mk1017", 40.384170, -74.161266, 1, "jj0000");
		Tech t3 = new Tech("Richard Nelson", "ll1010", 40.364170, -74.191266, 2, "jj0000");
		
		allTeches.add(t1);
		allTeches.add(t2);
		allTeches.add(t3);
		
	}

}