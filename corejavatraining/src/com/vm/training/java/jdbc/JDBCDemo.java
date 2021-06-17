package com.vm.training.java.jdbc;

public class JDBCDemo {
	public static void main(String args[]) 
	{
		try
		{
		Class.forName("com.vm.session.jdbc.A");
		System.out.println("class found");
		
		}
		catch(ClassNotFoundException e)
		{
			e.printStackTrace();
		}
	}

}
