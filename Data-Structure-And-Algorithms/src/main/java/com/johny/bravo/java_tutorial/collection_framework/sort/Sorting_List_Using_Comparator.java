package com.johny.bravo.java_tutorial.collection_framework.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class StringLengthComparator implements Comparator<String> {

	@Override
	public int compare(String s1, String s2) {
		Integer len1 = s1.length();
		Integer len2 = s2.length();
		if(len1 > len2)
			return 1;
		else if(len1 < len2)
			return -1;
		return 0;
	}
	
}

class RevAlphabeticalOrderComparator implements Comparator<String> {

	@Override
	public int compare(String s1, String s2) {
		return -s1.compareTo(s2);     //  Negative sign reverses the order
	}
		
}

public class Sorting_List_Using_Comparator {

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
		System.out.println("---------------------------------------------");
		
		// This sorting is stable. Uncomment the above line and see the difference
		Collections.sort(scientists, new StringLengthComparator()); 
		display(scientists);
		System.out.println("---------------------------------------------");
		
		Collections.sort(scientists, new RevAlphabeticalOrderComparator());
		
		display(scientists);
	}
	
	public static void display(List<String> ss) {
		for(String s : ss) {
			System.out.println(s);
		}
	}

}
