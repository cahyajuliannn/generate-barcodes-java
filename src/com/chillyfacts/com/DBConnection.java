package com.chillyfacts.com;



import java.sql.Connection;
import java.sql.DriverManager; 

                                         
public class DBConnection {        
	  
	                     
	public Connection getConnection(){          
		Connection connection=null;                      
		System.out.println("Connection called");                  
		try {                                                                  
			Class.forName("com.mysql.jdbc.Driver");              
		connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root", "cahyacahya");
    	 		
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return connection;
	}

	
}
 