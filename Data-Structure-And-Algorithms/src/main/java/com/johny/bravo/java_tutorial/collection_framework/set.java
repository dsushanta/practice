package com.johny.bravo.java_tutorial.collection_framework;

import java.util.*;

public class set {

	public static void main(String[] args) {
		
		// Set contains unique elements
		
		// HashSet - Elements are not stored in some random order
		// TreeSet - Elements are sorted
		// LinkedSet - Elements are stored in the order they were entered
		
		Set<String> animals = new HashSet<String>();
		
		animals.add("Panther");
		animals.add("Lion");
		animals.add("Dinosaur");
		animals.add("Anaconda");
		animals.add("Cheetah");
		animals.add("Snake");
		
		System.out.println(animals);         // Set has a "toArray" method implemented. So it displays all the elements by using the set object
		
//		for(String e : animals) {
//			System.out.println(e);
//		}
		
		System.out.println(animals.contains("Lion"));
		System.out.println(animals.contains("Tiger"));
		
		Set<String> s1 = new HashSet<String>();
		
		s1.add("Dolphin");
		s1.add("Frog");
		s1.add("Dinosaur");
		s1.add("Anaconda");
		s1.add("Ant");
		s1.add("Snake");
		
		Set<String> s2 = new HashSet<String>(animals);
		s2.retainAll(s1);
		
		System.out.println(s2);
		
		Set<String> s3 = new HashSet<String>(animals);
		s3.removeAll(s1);
		
		System.out.println(s3);
	}
		

}
