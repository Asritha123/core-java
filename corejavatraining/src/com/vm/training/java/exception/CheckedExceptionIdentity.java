package com.vm.training.java.exception;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;


public class CheckedExceptionIdentity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * try { int[] i = {1,2}; System.out.println(i[2]); Connection con =
		 * DriverManager.getConnection("","",""); } catch(Exception e) {
		 * e.printStackTrace(); }
		 */
		try
		{
			
		}
		catch(ArithmeticException e)
		
		{
			
		}
		catch(NullPointerException e)
		{
			
		}
		catch(Exception e)
		{
			
		}
		try
		{
			
		}
		catch(ArithematicException | NullPointerException)
		{
			e.printStackTrace();
		}
	}

}
