package com.vm.training.java.oops;

class A
{
	static int i=1;
	A()
	{
		i++;
		System.out.println(i);
		
	}
	static void display()
	{
		System.out.println(i);
	}
}
public class TestStatic {
	
	public static void main(String[] args)
	{
		
		A a1 = new A();
		A.display();
		//A a2 = new A();
		//A a3 = new A();
		
	}

}
