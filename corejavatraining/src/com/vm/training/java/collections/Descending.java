package com.vm.training.java.collections;


import java.util.ArrayList;
import java.util.Collections;

public class Descending {
	static boolean search(ArrayList arraylist ,Integer key)
	{
		return arraylist.contains(key);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> array = new ArrayList<Integer>();
		array.add(1);
		array.add(2);
		array.add(5);
		array.add(3);
		array.add(9);
		
		
		Collections.sort(array, Collections.reverseOrder());
		System.out.println("list in descending order :"+array);

	}

}
