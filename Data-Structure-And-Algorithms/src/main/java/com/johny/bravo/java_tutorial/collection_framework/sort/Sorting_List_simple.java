package com.johny.bravo.java_tutorial.collection_framework.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Sorting_List_simple {

	public static void main(String[] args) {
		
		List<String> scientists = new ArrayList<String>();
		
		scientists.add("Newton");
		scientists.add("Einstein");
		scientists.add("Ruhterford");
		scientists.add("Bohr");
		scientists.add("Hiesenberg");
		scientists.add("Kirchhoff");
		
		Collections.sort(scientists);
		
		display(scientists);
	}
	
	public static void display(List<String> ss) {
		for(String s : ss) {
			System.out.println(s);
		}
	}

}
