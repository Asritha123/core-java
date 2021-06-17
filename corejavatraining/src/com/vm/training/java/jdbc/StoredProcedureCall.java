package com.vm.training.java.jdbc;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;


public class StoredProcedureCall {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
		Connection con = DBConnection.getConnection();
		CallableStatement stmt=con.prepareCall("{call findAllRecord()} ");
	    ResultSet rs = stmt.executeQuery();
	    CallableStatement stmt1=con.prepareCall("{call insertNewEmployee()} ");
	    ResultSet rs1 = stmt1.executeQuery();
	    
		
		while(rs1.next())
		{
			System.out.println(rs.getInt(1)+" "+rs.getString(2));
		}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
