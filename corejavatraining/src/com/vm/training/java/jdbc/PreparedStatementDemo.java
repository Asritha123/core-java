package com.vm.training.java.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class PreparedStatementDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			//step1
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("driver class loaded");
		
		//step2
		Connection con1=DriverManager.getConnection("jdbc:mysql://localhost:3306/digital?verifyServerCertificate=false&useSSL=true","root","root");
		System.out.println("connected to digital");
		PreparedStatement ps = con1.prepareStatement("insert into product values(?,?,?,?)");
		ps.setInt(2, 40);
		
		ps.setString(2, "ac");
		ps.setInt(2, 30000);
		ps.execute();
		

	}
		catch(Exception e)
		{
			e.printStackTrace();		
			}
	}

}
