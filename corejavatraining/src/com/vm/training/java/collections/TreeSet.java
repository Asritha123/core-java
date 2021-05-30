package com.vm.training.java.collections;
import java.util.*;
class Employee{
	int id;
	String name;
	public Employee(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + "]";
	}
	
}
class EmployeeDetails extends Employee{
	String Phno;
	String city;
	public EmployeeDetails(int id, String name, String phno, String city) {
		super(id, name);
		Phno = phno;
		this.city = city;
	}
	@Override
	public String toString() {
		return "EmployeeDetails [Phno=" + Phno + ", city=" + city + "]";
	}
	
}
public class TreeSet {
	public static void main(String[] args)
	{
		
	//	ArrayList<Employee> arrayList = new ArrayList<>();//First Method
	//	arrayList.add(new Employee(1035,"asri"));
	//	System.out.println(arrayList);
	
	ArrayList<String> al = new ArrayList<>(); /*
	* al.add("abc"); al.add("dhg"); al.add("asri"); al.add("10"); String s
	 * =(String)al.get(2); System.out.println(s); String
     * s1=(String)al.get(3); System.out.println(s1);
 */
	
		
		HashMap hashmap = new HashMap<>();
		hashmap.put(100,"asri");
		hashmap.put(102,"polu");
		hashmap.put(103,"yashu");
		hashmap.put(105,"tha");
		String s =(String)al.get(1);
		System.out.println(s);
		String s1=(String)al.get(3); 
		System.out.println(s1);
		
				
		/*
		 * ArrayList<EmployeeDetails> arraylist = new ArrayList<>(); arraylist.add(new
		 * EmployeeDetails(1035, "asri","9494320199","vijayawada"));
		 * System.out.println(arraylist);
		 * 
		 * Employee e1 = new Employee(1035,"asri");//constructor created and passing
		 * values through constructor ArrayList<Employee> arrayList = new ArrayList<>();
		 * arrayList.add(e1);//adding passed values to array list
		 * System.out.println(arrayList);
		 */
		/*
		 * HashSet hashset = new HashSet();
		 * 
		 * hashset.add("abbc"); hashset.add("kfc"); hashset.add("asri");
		 * hashset.add(null); hashset.add("sashi"); System.out.println(hashset);
		 */
		/*
		 * TreeSet treeset = new TreeSet(); treeset.add("abbc"); treeset.add("asri");
		 * treeset.add("kfc"); treeset.add(null); System.out.println(treeset);
		 */
				
	}

}
