package com.vm.training.java.assignments;
import java.util.*;
public class Assignment14 {
	public static void main(String[] args)
	{
	Scanner sc=new Scanner(System.in);
	int number1=0,number2=0,number3=0,number4=0;
	
	for(int i=1;i<=4;i++)
	{
	if(i==1)
	{
	System.out.println("input  1st number");
	number1=sc.nextInt();
	}
	else if(i==2)
	{
	System.out.println("input  2nd number");
	number2=sc.nextInt();
	}
	else if(i==3)
	{
	System.out.println("input 3rd number");
	number3=sc.nextInt();
	}
	else 
	{
		System.out.println("input 4th number");
		number4=sc.nextInt();
	}
	}
	if((number1<number2)&&(number2<number3)&&(number3<number4))
	{
	System.out.println("Increasing");
	}
	else if((number1>number2) && (number2>number3)&&(number3>number4))
	{
	System.out.println("Decreasing");
	}
	else 
	{
	System.out.println("Neither Increasing or Decreasing");
	}
	}

}
