package com.johny.bravo.java_tutorial.collection_framework;

import java.util.LinkedHashMap;
import java.util.Map;

class Person {
	int id;
	String name;
	
	Person(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	public String toString() {
		return "[ "+id+" : "+name+" ]";
	}

	
	// uncomment the code to have unique keys in tha map
	
	
//	@Override
//	public int hashCode() {          // This generates id which is different for two different objects
//		final int prime = 31;		 // and same for two same objects
//		int result = 1;
//		result = prime * result + id;
//		result = prime * result + ((name == null) ? 0 : name.hashCode());
//		return result;
//	}
//
//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj)             // This checks if two objects are same or not
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		Person other = (Person) obj;
//		if (id != other.id)
//			return false;
//		if (name == null) {
//			if (other.name != null)
//				return false;
//		} else if (!name.equals(other.name))
//			return false;
//		return true;
//	}
	
}

public class Set_for_Customized_objects {
	
	public static void main(String[] args) {
		
		Person p1 = new Person(10, "joey");
		Person p2 = new Person(20, "chandler");
		Person p3 = new Person(30, "monica");
		Person p4 = new Person(40, "phoebe");
		Person p5 = new Person(50, "rachel");
		Person p6 = new Person(60, "ross");
		Person p7 = new Person(30, "monica");
		Person p8 = new Person(40, "phoebe");
		
		Map<Person, Integer> map = new LinkedHashMap<Person, Integer>();
		
		map.put(p1, 1);
		map.put(p2, 2);
		map.put(p3, 3);
		map.put(p4, 4);
		map.put(p5, 5);
		map.put(p6, 6);
		map.put(p7, 7);
		map.put(p8, 8);
		
		for(Person p : map.keySet()) {
			System.out.println(p+" : "+map.get(p));
		}
	}

}
