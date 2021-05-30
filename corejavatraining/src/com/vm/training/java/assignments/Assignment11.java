package com.vm.training.java.assignments;
import java.util.*;
public class Assignment11 {
	public static void main(String[] args)
	{
	 Scanner sc=new Scanner(System.in);
			
			int number1=0;
			int number2=1;
			int number3;

			System.out.println("Input the number");
			int number=sc.nextInt();
			System.out.print(number1+" "+number2);
			for(int i=2;i<=number;i++)
			{
			number3=number1+number2;
			System.out.print(" "+number3);
			number1=number2;
			number2=number3;
			}
			}
}

