package com.vm.training.java.concurrent;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       ArrayList<Integer> arraylist = new ArrayList<Integer>();
       arraylist.add(1);
       arraylist.add(6);

       arraylist.add(3);
       System.out.println("elements are"+arraylist);
       for(Integer i : arraylist)
       {
    	   System.out.println(i);
    	   arraylist.add(9);
       }
	}

}
