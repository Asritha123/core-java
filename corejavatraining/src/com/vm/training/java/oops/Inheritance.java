package com.vm.training.java.oops;

public class Inheritance {
	
	int id;
	String name;
	String dept;
  public  Inheritance(){
	  System.out.println("default");
    }
	
	/*
	 * public Inheritance(int id, String name, String dept) { this.id = id;
	 * this.name = name; this.dept = dept;
	 * 
	 * }
	 */
	
	/*void show()
	{
		System.out.println(id+""+name+""+dept);
	}
	*/

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

public String getDept() {
	return dept;
}

public void setDept(String dept) {
	this.dept = dept;
}

/*
 * public static void main(String[] args) { Inheritance inherit = new
 * Inheritance(); //inherit.show(); Inheritance inherit1 = new Inheritance();
 * //inherit1.show();
 * 
 * System.out.println(inherit); System.out.println(inherit1);
 * 
 * 
 * 
 * }
 */
	
	}

