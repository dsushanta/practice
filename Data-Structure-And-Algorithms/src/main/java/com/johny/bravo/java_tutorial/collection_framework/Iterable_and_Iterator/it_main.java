package com.johny.bravo.java_tutorial.collection_framework.Iterable_and_Iterator;

public class it_main {

	public static void main(String[] args) {
		UrlLibrary urls = new UrlLibrary();

		for(String html : urls) {
			System.out.println(html);
			System.out.println("\n ---------------------------------------------------------\n");
		}
	}

}
