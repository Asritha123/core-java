package com.vm.training.java.date;

import java.time.LocalDate;
import java.time.Period;

public class PeriodDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDate today = LocalDate.now();
		LocalDate joiningDate = LocalDate.of(2000, 01, 10);
		Period period = Period.between(joiningDate, today);
		System.out.println("Year:"+period.getYears()+"month :"+period.getMonths()+" day :"+ period.getDays());

	}

}
