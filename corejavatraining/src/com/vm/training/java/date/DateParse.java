package com.vm.training.java.date;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateParse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String startDate = "2021-05-25";
		LocalDate ld = LocalDate.parse(startDate);
		System.out.println(ld);
		String bookingDate = "2021/May/25";
		DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("yyyy/MMM/dd");
		LocalDate bookdate = LocalDate.parse(bookingDate,dtf1);
		System.out.println("bookingdate"+bookdate);
		

	}

}
