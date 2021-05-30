package com.vm.training.java.oops;

public class CustomerGetterSetter {
	public static void main(String[] args)
	{
		
		Customer customer = new Customer();
		customer.setId(1035);
		customer.setFirstName("Asri");
		customer.setLastName("polu");
		customer.setAccount("savings");
		
		System.out.println(customer.getId());
		System.out.println(customer.getFirstName());
		System.out.println(customer.getLastName());
		System.out.println(customer.getAccount());
		
	}

}
