package com.vm.training.java.date;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class DateDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDate todayDate = LocalDate.now();
		System.out.println(" Date " +todayDate);
		LocalDateTime ldt = LocalDateTime.now();
		System.out.println(" DateTime "+ldt);
		System.out.println(" Day Of The Year "+ldt.getDayOfYear());
		System.out.println(" Month Of The day "+ldt.getDayOfMonth());
		System.out.println(" Week Of The Day "+ldt.getDayOfWeek());
		
		

	}

}
