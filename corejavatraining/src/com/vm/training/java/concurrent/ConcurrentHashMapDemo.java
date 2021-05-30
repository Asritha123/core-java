package com.vm.training.java.concurrent;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.concurrent.ConcurrentHashMap;
public class ConcurrentHashMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//	HashMap<String,Integer> hashmap = new HashMap <String,Integer>();
		ConcurrentHashMap<String,Integer> hashmap = new ConcurrentHashMap<String,Integer>();
		
		hashmap.put("asri", 20);
		hashmap.put("sree", 30);

		hashmap.put("ammulu", 40);
		hashmap.put("mouni", 50);
		System.out.println("elements of hashmap"+hashmap);
	//	hashmap.computeIfPresent("sam",a->90);
		//hashmap.computeIfPresent("john",a->88);
		//hashmap.computeIfAbsent("sam", a->90);
		for(Integer val :hashmap.values())
		{
		//System.out.println(hashmap.containsValue(30));
		//System.out.println("elements of hashmap"+hashmap);
			System.out.println(val);
			hashmap.computeIfAbsent("mahesh", a->88);
		
		

	}
		System.out.println("elements of hashmap"+hashmap);

}
}
