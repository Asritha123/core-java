package com.vm.training.java.threading;

class Employee extends Thread
{
	public void run()
	{
		System.out.println("this is task of employees");
	}
}

public class CreateDemo {

	public static void main(String[] args) {
		Employee emp = new Employee();
		emp.start();
		// TODO Auto-generated method stub

	}

}
