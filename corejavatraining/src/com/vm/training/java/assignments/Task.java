package com.vm.training.java.assignments;
import java.util.HashMap;
import java.util.Scanner;
public class Task {
static HashMap add(HashMap contacts,String MobileNumber,String Name)
	{
		contacts.put(Name,MobileNumber);
		return contacts;
	}
// removing name
static HashMap removeName(HashMap contacts,String Name)
{
	contacts.remove(Name);
	return contacts;
	
}
static HashMap display(HashMap contacts)
{
	display(contacts);
	System.out.println(contacts);
}
	

		public static void main(String[] args) {
			  HashMap contacts=new HashMap();
			  add(contacts,"asri","46374683");
			  add(contacts,"hasndj","2335");
			  add(contacts,"mhdh","534556");
			  removeName(contacts,"asri");
			  System.out.println("after removing contact"+contacts);
			  display(contacts);
			 }
		
		
		

	}


