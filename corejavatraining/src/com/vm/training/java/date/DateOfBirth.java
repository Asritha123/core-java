package com.vm.training.java.date;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class DateOfBirth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDate today=LocalDate.now();
		  Scanner sc=new Scanner(System.in);
		  System.out.println("Enter the date of birth");
		  String str=sc.nextLine();
		  Period period = Period.between(today);
		
	}

}
