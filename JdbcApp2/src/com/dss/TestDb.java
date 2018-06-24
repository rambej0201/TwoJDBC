package com.dss;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.SQLException;

public class TestDb {

	public static void main(String[] args) throws ClassNotFoundException, SQLException{
		// TODO Auto-generated method stub
		//Accessing driver from JAR file
		Class.forName("com.mysql.jdbc.Driver");
		
		//Creating a variable for the connection called "con"
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:4406/izzat", "root", "R@ghu123");
		
		System.out.println("Number 7 updating Publisher details RamBej");
		
	    PreparedStatement statement = (PreparedStatement) con.prepareStatement("select * from publishers");
			ResultSet result = statement.executeQuery();
			while (result.next()) 
			System.out.println("publisher ID is "+ result.getString(1)+" publisher Name is "+result.getString(2));
		        
		  	con.close();	
		    }
	}
