package com.vm.training.java.collections;

import java.util.ArrayList;
import java.util.Collections;

public class TestMovie1 {

public static void main(String[] args)
{
	ArrayList<Movie1> list = new ArrayList<Movie1>();
	list.add(new Movie1("rrr",10,2022));
	list.add(new Movie1("temper",10,2017));
	list.add(new Movie1("janatha garage",10,2018));
	list.add(new Movie1("avsm",10,202));
	
	Collections.sort(list);
	System.out.println("Movies after sorting : ");
	RatingCompare ratingCompare = new RatingCompare();
	Collections.sort(list,ratingCompare);
	for(Movie1 movie :list)
	{
		System.out.println(movie.getName()+" "+movie.getRating()+" "+movie.getYear());
	}
	//call overloaded sort method with RatingCompare
	//same three steps as above

	System.out.println("\nsorted by name");
	NameCompare nameCompare = new NameCompare();
	Collections.sort(list,nameCompare);
	for(Movie1 movie:list)
		System.out.println(movie.getName()+" "+movie.getRating()+" "+movie.getYear());
	
}
}