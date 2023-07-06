package com.johny.bravo.hackerrank.java;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class java_map {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
	      int n=in.nextInt();
	      in.nextLine();
	      Map<String, Integer> phone_book = new HashMap<String, Integer>();
	      for(int i=0;i<n;i++)
	      {
	         String name=in.nextLine();
	         int phone=in.nextInt();
	         phone_book.put(name, phone);
	         in.nextLine();
	      }
	      while(in.hasNext())
	      {
	         String s=in.nextLine();
	         if(phone_book.containsKey(s))
	        	 System.out.println(s+"="+phone_book.get(s));
	         else
	        	 System.out.println("Not found");
	      }
	}

}
