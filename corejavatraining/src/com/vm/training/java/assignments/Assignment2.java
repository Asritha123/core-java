package com.vm.training.java.assignments;
import java.util.*;
public class Assignment2{
	public static void main(String[] args)
	{
		int a;
		int b;
		int c;
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		if(a>b&&a>c)
		{
			System.out.println("GreatestNumber"+" "+ a);
		}
		if(b>a&&b>c)
		{
			System.out.println("GreatestNumber"+" "+b);
		}
		if(c>b&&c>a)
		{
			System.out.println("GreatestNumber"+" "+c);
		}
	}
}
