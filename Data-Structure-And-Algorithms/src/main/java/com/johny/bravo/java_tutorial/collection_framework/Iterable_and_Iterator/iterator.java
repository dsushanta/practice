package com.johny.bravo.java_tutorial.collection_framework.Iterable_and_Iterator;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class iterator {

	public static void main(String[] args) {
		
		List<String> friends = new LinkedList<String>();
		
		friends.add("Monica");
		friends.add("Ross");
		friends.add("Chandler");
		friends.add("Joey");
		friends.add("Gunther");
		friends.add("Rachel");
		friends.add("Phoebe");
		
		// Modern way of iteration
		for(String s : friends) {
			System.out.print(s+" ");
		}
		System.out.println();
		
		// old way using Iterator	
		Iterator<String> it = friends.iterator();
		while(it.hasNext()) {
			if(it.next().equals("Gunther"))
				it.remove();
		}
		
		
		it = friends.iterator();
		System.out.println("\nPrinting using Iterator");
		while(it.hasNext()) {
			System.out.print(it.next()+" ");
		}
	}

}
