package com.vm.training.java.collections;
import java.util.ArrayList;
import java.util.Collections;

public class AscendingOrder {
	static boolean search(ArrayList arraylist ,Integer key)
	{
		return arraylist.contains(key);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> array = new ArrayList<Integer>();//adding elements to the list
		array.add(11);
		array.add(56);
		array.add(12);
		array.add(90);
		array.add(10);
		
		Collections.sort(array);
		System.out.println("list in ascending order :"+array);//printing ascending order

	}

}
