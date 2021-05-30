package com.vm.training.java.date;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class DateFormatterDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDate today = LocalDate.now();
		System.out.println("today"+today);
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd");
		DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("yyyy MM dd");
		DateTimeFormatter  dtFull = DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL);
		DateTimeFormatter  dtmedium = DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM);
		DateTimeFormatter  dtshort = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
		
		String afterFormat = today.format(dtf);
		System.out.println("date after format"+ afterFormat);
		String afterFormat2 = today.format(dtf1);
		System.out.println("date after format"+ afterFormat2);
		
		String fulldate = today.format(dtFull);
		System.out.println("full date"+ fulldate);
		
		String MediumDate = today.format(dtmedium);
		System.out.println("medium date"+ MediumDate);
		
		String ShortDate = today.format(dtshort);
		System.out.println("short date"+ ShortDate);

		
	}

}
