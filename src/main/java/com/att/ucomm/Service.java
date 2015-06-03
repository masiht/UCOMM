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
			jobMap.put(t.getId(), jobsforATech);
		}
		
		
		
		
		
		
		
/*		// search for given id
		//
		for (Job j : allJobs) {
			if (j.getTechId().equals(id)) {
				jobList.add(j);
				jobMap.put(j.getTechId(), jobList);
			}
		}*/

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
		Job j1 = new Job("1038mt", 1234, 420, "06-02-2015", "04:00", "05:00", "WIP", "installation");
		Job j2 = new Job("1038mt", 4567, 420, "06-02-2015", "04:00", "05:00", "WIP", "repair");
		Job j3 = new Job("1038mt", 2323, 420, "06-02-2015", "04:00", "05:00", "WIP", "repair");

		Job j4 = new Job("1017mk", 9999, 999, "06-02-2015", "04:00", "05:00", "N/A", "N/A");

		Job j5 = new Job("47ak", 8888, 987, "06-02-2015", "04:00", "05:00", "N/A", "N/A");
		Job j6 = new Job("47ak", 7777, 876, "06-02-2015", "04:00", "05:00", "N/A", "N/A");


		allJobs.add(j1);
		allJobs.add(j2);
		allJobs.add(j3);
		allJobs.add(j4);
		allJobs.add(j5);
		allJobs.add(j6);

		// load teches
		Tech t1 = new Tech("M", "1038mt", "Here", 1, "1017mk");
		Tech t2 = new Tech("K", "1017mk", "There", 1, "0000jj");
		Tech t3 = new Tech("AK", "47ak", "NoWhere", 1, "1017mk");
		Tech t4 = new Tech("J", "0000jj", "SomeWhere", 1, "");
		Tech t5 = new Tech("Relax", "420", "EveryWhere", 0, "1017mk");

		allTeches.add(t1);
		allTeches.add(t2);
		allTeches.add(t3);
		allTeches.add(t4);
		allTeches.add(t5);

	}

}