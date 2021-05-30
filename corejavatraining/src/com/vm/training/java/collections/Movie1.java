package com.vm.training.java.collections;


import java.util.ArrayList.*;
import java.util.Collections;
import java.util.Comparator;
//a class movie that implements compatable
 public class Movie1 implements Comparable<Movie1>
{
	private double rating;
	private String name;
	private int year;
	//used to sort movie by year
	public int compareTo(Movie1 m)
	{
		//return this.year - m.year;
		return this.year - m.year;
	}
	public Movie1(String name,double rating,int year)
	{
		this.name=name;
		this.rating=rating;
		this.year=year;
	}
	
	
	public double getRating() {
		return rating;
	}
		
	public String getName() {
		return name;
	}
	public int getYear() {
		return year;
	}
	//class to compare Movies by ratings

class RatingCompare implements Comparator<Movie1>
{
	public int compare(Movie m1,Movie m2)
	{
		if(m1.getRating() < m2.getRating())
			return -1;
		if(m1.getRating() < m2.getRating())
			return 1;
		else
			return 0;
	}
}
 class NameCompare implements Comparator<Movie1>
{
	public int compare(Movie m1,Movie m2)
	{
		return m1.getName().compareTo(m2.getName());
		
	}
}
	
}

	

