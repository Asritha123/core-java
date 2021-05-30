package com.vm.training.java.oops;

public class Person {
	int id;
	String name;
	Address address;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	 public Address getAddress() {
		    return address;
    }
	public Person()
	{
	  address = new Address();
	  
	}
	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", address=" + address + "]";
	}
	
	
	
	
	
	
	

}
