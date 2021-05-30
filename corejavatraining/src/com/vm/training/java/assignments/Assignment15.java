package com.vm.training.java.assignments;
import java.util.Scanner;
public class Assignment15 {

	public static void main(String[] args) {
	@SuppressWarnings("resource")
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter number");
	long NumberOfDigits=0;
	long number = sc.nextLong();
	while(number>0)
	{
	number=number/10;
	NumberOfDigits++;

	}
	
	System.out.println("Number of digits in the number:"+NumberOfDigits);
	}
	}


