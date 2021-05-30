package com.vm.training.java.concurrent;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.concurrent.ConcurrentHashMap;

//keyset-->keys
//values-->values
//entryset-->both key and values
public class MapIterator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String,Integer> hashmap = new HashMap<String,Integer>();
		hashmap.put("asri", 20);
		hashmap.put("sree", 30);

		hashmap.put("ammulu", 40);
		hashmap.put("mouni", 50);
		for(Entry<String,Integer>hm:hashmap.entrySet())
		{
			System.out.println(hm);
		}
		for(Integer i : hashmap.values())
		{
			System.out.println("values are"+ i);
		}
		for(String k:hashmap.keySet())
		{
			System.out.println("keys"+k+""+hashmap.get(k));
		}

	}

}
