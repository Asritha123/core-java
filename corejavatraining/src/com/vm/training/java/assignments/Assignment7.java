package com.vm.training.java.assignments;
import java.util.*;
public class Assignment7 {

	static String SumAndAverage(int a,int b,int c,int d,int e)
	{
	int Sum=0;
	int Average;
	Sum=a+b+c+d+e;
	Average=Sum/2;
	return "Sum of number:"+Sum+"\n"+"Average of number:"+Average;
	
	}
	public static void main(String[] sasi) {
	
	@SuppressWarnings("resource")
	Scanner sc=new Scanner(System.in);
	int a=sc.nextInt();
	int b=sc.nextInt();
	int c=sc.nextInt();
	int d=sc.nextInt();
	int e=sc.nextInt();
	System.out.println(SumAndAverage(a, b, c, d, e));
	}

}
