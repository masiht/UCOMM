package com.att.ucomm.controllers;

import java.sql.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.att.ucomm.models.*;



public class DatabaseController {

	// JDBC driver name and database URL
	static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";  
	static final String DB_URL = "jdbc:mysql://127.0.0.1:3306/ucomm";

	// Database credentials
	static final String USER = "root";
	static final String PASS = "root";

	public Map<String, String> user() {

		Connection conn = null;
		Statement stmt = null;

		Map<String, String> users = new HashMap<String, String>();

		try{
			// Register JDBC Driver
			Class.forName(JDBC_DRIVER);

			// Open a connection
			conn = DriverManager.getConnection(DB_URL,USER,PASS);

			// Execute a query
			stmt = conn.createStatement();
			String sql;
			sql = "SELECT * FROM User";
			ResultSet rs = stmt.executeQuery(sql);

			// Extract data from result set
			while(rs.next()){
				//Retrieve by column name
				String id  = rs.getString("id");
				String pass = rs.getString("pass");

				users.put(id, pass);
			}
			// Clean-up environment
			rs.close();
			stmt.close();
			conn.close();

		}catch(SQLException se){
			//Handle errors for JDBC
			se.printStackTrace();
		}catch(Exception e){
			//Handle errors for Class.forName
			e.printStackTrace();
		}finally{
			//finally block used to close resources
			try{
				if(stmt!=null)
					stmt.close();
			}catch(SQLException se2){
			}
			try{
				if(conn!=null)
					conn.close();
			}catch(SQLException se){
				se.printStackTrace();
			}
		}

		return users;

	}

	public List<Customer> loadCustomers() {

		Connection conn = null;
		Statement stmt = null;

		List<Customer> allCustomers = new ArrayList<Customer>();

		try{
			// Register JDBC Driver
			Class.forName(JDBC_DRIVER);

			// Open a connection
			conn = DriverManager.getConnection(DB_URL,USER,PASS);

			// Execute a query
			stmt = conn.createStatement();
			String sql;
			sql = "SELECT * FROM Customer";
			ResultSet rs = stmt.executeQuery(sql);

			// Extract data from result set
			while(rs.next()){
				//Retrieve by column name
				int ban  = rs.getInt("ban");
				String name = rs.getString("name");
				String address = rs.getString("address");
				String latitude = rs.getString("latitude");
				String longitude = rs.getString("longitude");

				Customer c = new Customer(name, ban, address, latitude, longitude);
				allCustomers.add(c);
			}
			// Clean-up environment
			rs.close();
			stmt.close();
			conn.close();

		}catch(SQLException se){
			//Handle errors for JDBC
			se.printStackTrace();
		}catch(Exception e){
			//Handle errors for Class.forName
			e.printStackTrace();
		}finally{
			//finally block used to close resources
			try{
				if(stmt!=null)
					stmt.close();
			}catch(SQLException se2){
			}
			try{
				if(conn!=null)
					conn.close();
			}catch(SQLException se){
				se.printStackTrace();
			}
		}

		return allCustomers;

	}

	public ArrayList<Job> loadJobs() {

		Connection conn = null;
		Statement stmt = null;

		ArrayList<Job> allJobs = new ArrayList<Job>();

		try{
			// Register JDBC Driver
			Class.forName(JDBC_DRIVER);

			// Open a connection
			conn = DriverManager.getConnection(DB_URL,USER,PASS);

			// Execute a query
			stmt = conn.createStatement();
			String sql;
			sql = "SELECT * FROM Job";
			ResultSet rs = stmt.executeQuery(sql);

			// Extract data from result set
			while(rs.next()){
				//Retrieve by column name
				int jobid  = rs.getInt("jobid");
				String techid = rs.getString("techid");
				int ban  = rs.getInt("ban");
				String day = rs.getString("day");
				String startDate = rs.getString("startdate");
				String endDate = rs.getString("enddate");
				String status = rs.getString("status");
				String jobType = rs.getString("jobtype");

				Job j = new Job(techid, ban, jobid, day, startDate, endDate, status, jobType, "0");
				allJobs.add(j);
			}
			// Clean-up environment
			rs.close();
			stmt.close();
			conn.close();

		}catch(SQLException se){
			//Handle errors for JDBC
			se.printStackTrace();
		}catch(Exception e){
			//Handle errors for Class.forName
			e.printStackTrace();
		}finally{
			//finally block used to close resources
			try{
				if(stmt!=null)
					stmt.close();
			}catch(SQLException se2){
			}
			try{
				if(conn!=null)
					conn.close();
			}catch(SQLException se){
				se.printStackTrace();
			}
		}

		return allJobs;

	}


	public ArrayList<Tech> loadTechs() {

		Connection conn = null;
		Statement stmt = null;

		ArrayList<Tech> allTech = new ArrayList<Tech>();

		try{
			// Register JDBC Driver
			Class.forName(JDBC_DRIVER);

			// Open a connection
			conn = DriverManager.getConnection(DB_URL,USER,PASS);

			// Execute a query
			stmt = conn.createStatement();
			String sql;
			sql = "SELECT * FROM Tech";
			ResultSet rs = stmt.executeQuery(sql);

			// Extract data from result set
			while(rs.next()){
				//Retrieve by column name
				String techid = rs.getString("techid");
				String name = rs.getString("name");
				String latitude = rs.getString("latitude");
				String longitude = rs.getString("longitude");
				int availibility  = rs.getInt("availibility");
				String coc = rs.getString("coc");
				
				
				Tech t = new Tech(name, techid, latitude,longitude, availibility, coc); 
				allTech.add(t);
			}
			// Clean-up environment
			rs.close();
			stmt.close();
			conn.close();

		}catch(SQLException se){
			//Handle errors for JDBC
			se.printStackTrace();
		}catch(Exception e){
			//Handle errors for Class.forName
			e.printStackTrace();
		}finally{
			//finally block used to close resources
			try{
				if(stmt!=null)
					stmt.close();
			}catch(SQLException se2){
			}
			try{
				if(conn!=null)
					conn.close();
			}catch(SQLException se){
				se.printStackTrace();
			}
		}

		return allTech;


	}
}