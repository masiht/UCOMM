package com.att.ucomm.controllers;

import java.sql.*;
import java.util.HashMap;
import java.util.Map;

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

}
