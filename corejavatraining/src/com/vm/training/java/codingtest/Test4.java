package com.vm.training.java.codingtest;
import java.util.*;
public class Test4 {
public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		String string=sc.nextLine();
		int length=string.length();
		int a=0;
		int b=0;
		for(int i=0;i<length;i++)
		{
			b++;
			if(string.charAt(i)==' ')
			{
			  a++;	
			}
				
		}
		a=a+1;
		System.out.println("Wordcount->"+a);
		System.out.println("Charactercount->"+b);

	}

}