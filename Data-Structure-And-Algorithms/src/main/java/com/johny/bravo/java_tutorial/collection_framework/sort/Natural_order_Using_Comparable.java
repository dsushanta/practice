package com.johny.bravo.java_tutorial.collection_framework.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Person implements Comparable<Person>{
	int id;
	String name;
	
	Person(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public String toString() {
		return "[ "+name+" : "+id+" ]";
	}
	
	         // This method decides the natural sorting order
	/*public int compareTo(Person o) {
		return this.name.compareTo(o.name);
	}*/
	
	@Override
	public int compareTo(Person o) {
		Integer len1 = this.name.length();
		Integer len2 = o.name.length();
		if(len1 > len2)
			return 1;
		else if(len1 < len2)
			return -1;
		return this.name.compareTo(o.name);
	}

}	
class revRustomObjectComparator implements Comparator<Person> {

	@Override
	public int compare(Person o1, Person o2) {
		return -o1.compareTo(o2);
	}
	
	
}

public class Natural_order_Using_Comparable {

	public static void main(String[] args) {
		
		Person p1 = new Person(10, "joey");
		Person p2 = new Person(20, "chandler");
		Person p3 = new Person(30, "monica");
		Person p4 = new Person(40, "phoebe");
		Person p5 = new Person(50, "rachel");
		Person p6 = new Person(60, "ross");
		
		List<Person> p = new ArrayList<Person>();
		p.add(p1);
		p.add(p5);
		p.add(p6);
		p.add(p2);
		p.add(p4);
		p.add(p3);
		
		display(p);
		System.out.println("\n -----------------------------------------\n");
		Collections.sort(p, new revRustomObjectComparator());
		display(p);
		System.out.println("\n -----------------------------------------\n");
		Collections.sort(p);   // sorting by natural order
		display(p);
	}

	public static void display(List<Person> pp) {
		for(Person p : pp)
			System.out.println(p);
	}
}
