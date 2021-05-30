package com.vm.training.java.collections;

import java.util.ArrayList;
import java.util.Collections;

public class TestMovie {

public static void main(String[] args)
{
	ArrayList<Movie> list = new ArrayList<Movie>();
	list.add(new Movie("rrr",10,2022));
	list.add(new Movie("temper",10,2017));
	list.add(new Movie("janatha garage",10,2018));
	list.add(new Movie("avsm",10,202));
	
	Collections.sort(list);
	System.out.println("Movies after sorting : ");
	for(Movie movie :list)
	{
		System.out.println(movie.getName()+" "+movie.getRating()+" "+movie.getYear());
	}
	
	
}
}