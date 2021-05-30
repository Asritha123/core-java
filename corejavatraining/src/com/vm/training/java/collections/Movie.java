package com.vm.training.java.collections;
import java.io.*;
import java.util.*;
import java.util.ArrayList.*;
//a class movie that implements compatable
 public class Movie implements Comparable<Movie>
{
	private double rating;
	private String name;
	private int year;
	//used to sort movie by year
	public int compareTo(Movie m)
	{
		//return this.year - m.year;
		return this.year - m.year;
	}
	public Movie(String name,double rating,int year)
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
}

	

