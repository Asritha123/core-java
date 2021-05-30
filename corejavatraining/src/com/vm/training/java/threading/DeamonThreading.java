package com.vm.training.java.threading;
class Company extends Thread
{
	public void run()
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println(Thread.currentThread().getName()+ " "+i);
		}
	}
}
class Employee2 extends Thread
{
	public void run()
	{
		for(int i=1;i<=50;i++)
		{
			System.out.println(Thread.currentThread().getName()+ " "+i);
		}
	}
}

public class DeamonThreading {
	

	public static void main(String[] args) {
		Company company = new Company();
		Employee2 emp = new Employee2();
		
		
		
		// TODO Auto-generated method stub

	}

}
