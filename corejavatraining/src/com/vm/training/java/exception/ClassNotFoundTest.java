package com.vm.training.java.exception;

public class ClassNotFoundTest {

	public static void main(String[] args)
	{
		try
		{
			Class.forName("Asri.class");
			//Class.forName("con.");
			System.out.println("Found class");
		}
		catch(ClassNotFoundException e)
		{
			e.printStackTrace();
		}
		
	}

}
