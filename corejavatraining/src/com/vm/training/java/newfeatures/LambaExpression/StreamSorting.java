package com.vm.training.java.newfeatures.LambaExpression;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StreamSorting {
	List<Integer>sortList(ArrayList<Integer> List)
	{
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> nums = new ArrayList<Integer>();
		ArrayList<String> arraylist = new ArrayList<String>();
		arraylist.add("asri");
		arraylist.add("ammulu");
		arraylist.add("sree");
		arraylist.add("avutu");
		nums.add(1);
		nums.add(5);
		nums.add(9);
		nums.add(2);
		nums.add(8);
		
		nums.forEach(s->System.out.println(s));
		System.out.println("=======sort=====");
		nums.stream().sorted().forEach(s->System.out.println(s));
		arraylist.forEach(s1->System.out.println(s1));
		System.out.println("=======sort=====");
		arraylist.stream().sorted().forEach(s1->System.out.println(s1));
		nums.stream().sorted(Collections.reverseOrder(s->System.out.println(s)));
		
		

	}

}
