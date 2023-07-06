package com.johny.bravo.java_tutorial.collection_framework;

import java.util.ArrayList;
import java.util.List;

public class Array_List {

	public static void main(String[] args) {
		List<Integer> numbers = new ArrayList<Integer>();
		numbers.add(50);
		numbers.add(23);
		numbers.add(70);
		numbers.add(33);
		
		for(Integer n : numbers) {
			System.out.println(n);
		}
		
		// Use Arraylist if you will not be removing items from positions other than the end
		// This is very slow - Removal from the beginnning of the array
		numbers.remove(0);
		
		for(int i=0; i<numbers.size(); i++) {
			System.out.println(numbers.get(i));
		}
	}

}
