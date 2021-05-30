package com.vm.training.java.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrayIterator {
 public static void main(String[] args)
 {
	 ArrayList<String> arr = new ArrayList();
	 arr.add("yashu");
	 arr.add("asri");
	 arr.add("siri");
	 arr.add("mummy");
	 System.out.println(arr);
	 Iterator it = arr.iterator();
	 while(it.hasNext())
	 {
		 System.out.println(it.next());
	 }
	 Collections.reverse(arr);
	 for(String str : arr)
	 {
		 System.out.println(str);
	 }
	 
 }
}
