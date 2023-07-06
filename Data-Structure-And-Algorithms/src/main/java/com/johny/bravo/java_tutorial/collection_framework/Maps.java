package com.johny.bravo.java_tutorial.collection_framework;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Maps {

	public static void main(String[] args) {
		
		// This type of map is not sorted
		Map<Integer, String> map = new HashMap<Integer,String>();

		map_operations(map);
		System.out.println("\n ------------------------------------------------------------- \n");
		
		// This type of map stores entry in the order in which the values were entered
		map = new LinkedHashMap<Integer,String>();
		map_operations(map);
		System.out.println("\n ------------------------------------------------------------- \n");
		
		// This type of map is sorted
		map = new TreeMap<Integer,String>();
		map_operations(map);
		System.out.println("\n ------------------------------------------------------------- \n");
	}
	
	public static void map_operations (Map<Integer, String> mp) {
		
		mp.put(4, "Four");
		mp.put(5, "Five");
		mp.put(6, "Six");
		mp.put(7, "Seven");
		mp.put(3, "Three");
		
		mp.put(6, "SixtySix");
		
		for(Map.Entry<Integer, String> entry : mp.entrySet()) {
			int key = entry.getKey();
			String v = entry.getValue();
			System.out.println(key+" : "+v);
		}
		
		// 2nd way to iterate
		
		/*for(Integer key: mp.keySet()) {
			String v = mp.get(key);
			System.out.println(key+" : "+v);
		}*/
	}

}
