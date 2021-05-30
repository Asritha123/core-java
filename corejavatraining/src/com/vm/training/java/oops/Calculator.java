package com.vm.training.java.oops;

public class Calculator {
	int num1,num2;
	double sum=0;
	long l;
	/*public Calculator(int num1,int num2)
	{
		this.num1=num1;
		this.num2=num2;
		
	}
	
	public Calculator() {
		super();
		// TODO Auto-generated constructor stub
	}
*/
	/*int add(int num1,int num2)
	{
		sum=num1+num2;
		return sum;
	}
	int add(int num1,int num2,int num3)
	{
		sum=num1+num2+num3;
		return sum;
	}
	int add(int num1,int num2,int num3,int num4)
	{
		sum=num1+num2+num3+num4;
		return sum;
	}
*/
	void add(int num1,int num2)
	{
		l=num1+num2;
		System.out.println(l);
	}
	double add(int num1,double f)
	{
		sum=num1+f;
		return sum;
	}
	long add(int num1,int num2,int num3)
	{
		sum=num1+num2+num3;
		return l;
	}
	long add(int num1,int num2,int num3,int num4)
	{
		sum=num1+num2+num3+num4;
		return l;
	}
}
