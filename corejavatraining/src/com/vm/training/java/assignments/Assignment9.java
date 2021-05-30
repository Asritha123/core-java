package com.vm.training.java.assignments;

import java.util.Scanner;

public class Assignment9 {
	public static void main(String[] args) {
			
			@SuppressWarnings("resource")
			Scanner sc=new Scanner(System.in);
			System.out.println("Input number of rows:");
			int number=sc.nextInt();
			int number1=1;
			while(number1<=number){
			for(int i=1;i<=number1;i++) 
			{
			System.out.print(i);
			}
			System.out.println();
			number1++;
			}
			
			}
	}


