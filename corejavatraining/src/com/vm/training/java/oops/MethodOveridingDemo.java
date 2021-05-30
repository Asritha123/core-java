package com.vm.training.java.oops;
class Bank
{
	void RateOfInterst()
	
	{
		System.out.println("2%");
	}
	static void loan()
	{
		System.out.println("you can apply on in any bank");
	}
}
class AXIS extends Bank
{
void RateOfInterst()
	
	{
		System.out.println("4%");
	}
static void loan()
{
	System.out.println("2%");
}
// we cannot overide static method
}
class SBI extends Bank
{
void RateOfInterst()
	
	{
		System.out.println("5%");
	}
}
public class MethodOveridingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bank bank = new SBI();
		bank.RateOfInterst();
		Axis axis = new Axis();
		axis.loan();
		

	}

}
