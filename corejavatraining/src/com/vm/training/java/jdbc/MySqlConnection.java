package com.vm.training.java.jdbc;

import java.sql.DriverManager;
import java.sql.*;
import java.sql.DriverManager;
import java.sql.Statement;
public class MySqlConnection {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		//step1
		
		try
		{
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("driver class loaded");
		//step2
		Connection con1=DriverManager.getConnection("jdbc:mysql://localhost:3306/digital?verifyServerCertificate=false&useSSL=true","root","root");
		System.out.println("connected to digital");
		
		
		//step3
		Statement stmt =con1.createStatement();
		stmt.execute("insert into emp values(6,'ammulu','2000-01-19')");
		System.out.println("inserted");
		Statement stmt1 =con1.createStatement();
	
		stmt1.execute("insert into product values(1,'electronic',4)");
         System.out.println("created");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	
		
	}

		
		
