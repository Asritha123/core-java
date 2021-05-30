package com.vm.training.java.date;

import java.time.LocalDate;

public class DateCalculation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LocalDate today = LocalDate.now();
		System.out.println(" today "+today);
		System.out.println(" NextDay "+today.plusDays(5));
		System.out.println(" Nextyear "+today.plusYears(1));
		System.out.println(" NextMonth "+today.plusMonths(5));
		LocalDate bookingdate = LocalDate.of(2021, 05, 30);
		if(bookingdate.isAfter(today))
		
	        System.out.println("correct date u can book");
	         else
	        

				System.out.println(" invalid date ");
				}
		
		
		

	}


