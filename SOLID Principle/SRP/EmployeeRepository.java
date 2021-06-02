package com.SRP;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class EmployeeRepository {
	
	public void save(Employee employee)
	
	{
		
		String objectstr = MyUtils.serializeIntoAString(this);
		
		Connection con = null;
		
		Statement smt = null;
		
		try 
		
		{
			Class.forName("com.mysql.jdbc.Driver");
			
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/MyDB", "root", "password");
			smt = con.createStatement();
			smt.execute("Insert into Employee values (" + objectstr + ")");
		}
		
		catch (Exception e)
		
		{
		
			e.printStackTrace();
			
		}
		
	}

}
