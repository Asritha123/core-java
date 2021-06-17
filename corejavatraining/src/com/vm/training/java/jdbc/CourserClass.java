package com.vm.training.java.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class CourserClass {

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
				Statement stmt = con1.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
				ResultSet rs = stmt.executeQuery("select * from product");
				//rs.absolute(3);
				rs.last();
				System.out.println(rs.getInt(1)+" "+ rs.getString(2)+" "+rs.getString(3));
				
				
				}
				catch(Exception e)
				{
					e.printStackTrace();
				}

	}

}
