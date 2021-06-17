package com.vm.training.java.codingtest;

public class Employee { 

	private String firstName;
	private String lastName;
	public Employee(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	void Validation() throws Exception
	{
		if(firstName==null && lastName==null )
		{
			throw new  NullPointerException("Enter missing");
		}
		
		if(firstName.length()<3 && lastName.length()<3  )
		{
			throw new Exception("name should be minimum 3 character");
		}
	}
}