package com.vm.training.java.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class MySqlConnection1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			Connection con=DBConnection.getConnection();
			PreparedStatement ps = con.prepareStatement("select * from product");
			ResultSet rs=ps.executeQuery();
			while(rs.next())
			{
				System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3));
			}
		}
			catch(Exception e)
			{
				e.printStackTrace();
			}
			
			}

	}





