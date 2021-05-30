package com.vm.training.java.assignments;
import java.util.*;
public class Assignment12 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("input no of numbers");
		int a=sc.nextInt();
		int b=0;
		while(a>0)
		{
		int number=sc.nextInt();
		if(number>0)
		{
		    b=b+number;
		}
		a--;
		}
		System.out.println(b);
		}

}
