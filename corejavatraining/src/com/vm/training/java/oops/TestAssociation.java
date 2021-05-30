package com.vm.training.java.oops;

public class TestAssociation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		showAggregation();
		showComposition();
		

	}
	static void showAggregation()
	{
		Address address = new Address();
		address.setCity("Vijayawada");
		address.setCountry("India");
		address.setState("Andhra");
		
		
		Employee emp =new Employee();
		emp.setId(1035);
		emp.setFirstName("Asri");
		emp.setLastName("polu");
		emp.setAddress(address);
		
	        System.out.println(emp);
	        System.out.println("---------------------------------");
	        emp=null;
	        System.out.println(emp);
	        System.out.println(address);
	     
	}    
			
			  @SuppressWarnings("unused")
			static void showComposition()
			  {
				  Person person = new Person();
				  person.setId(1035);
				  person.setName("chanti");
				  person.getAddress().setCity("vij");
				  person.getAddress().setState("Andhra");
				  person.getAddress().setCountry("India");
			  System.out.println(person);
			  System.out.println("---------------------------------");
			  System.out.println(person);
			  if(person != null)
			  
				  System.out.println(person.getAddress());
				  else
			       System.out.println("no address found");
			  
					  
			  }
}
			 
	


