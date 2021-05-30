package com.vm.training.java.newfeatures.LambaExpression;

import java.util.ArrayList;
import java.util.Arrays;

public class StreamDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Arrays.asList(2,4,6,89,34,56);
		ArrayList<Integer> nums = new ArrayList<Integer>();
		nums.add(1);
		nums.add(3);
		nums.add(4);
		nums.add(15);
		nums.add(16);
		System.out.println("ist:"+nums);
		nums.forEach(s->System.out.println(s));
		
		long count = nums.stream().count();
		System.out.println("total numbers"+count);
		System.out.println("greater tha 2");
		nums.stream().filter(s->s>2).forEach(s->System.out.println(s));
		System.out.println("=====");
		

	}

}
