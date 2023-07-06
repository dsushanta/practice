/* Problem Statement ----------------------
Alice is taking a cryptography class and finding anagrams to be very useful. We consider two strings to be anagrams of each other if the first string's letters can be rearranged to form the second string. In other words, both strings must contain the same exact letters in the same exact frequency For example, bacdc and dcbac are anagrams, but bacdc and dcbad are not.
Alice decides on an encryption scheme involving two large strings where encryption is dependent on the minimum number of character deletions required to make the two strings anagrams. Can you help her find this number? 
Given two strings, a and b, that may or may not be of the same length, determine the minimum number of character deletions required to make a and b anagrams. Any characters can be deleted from either of the strings
*/


package com.johny.bravo.hackerrank.Problems;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Making_Anagrams {
  
	public static int numberNeeded(String first, String second) {
	 
		Map<String, Integer> chars = new HashMap<String, Integer>();
		for(int i=0; i<first.length(); i++) {
			Boolean present = chars.containsKey(first.substring(i, i+1));
			if(present) {
				Integer c = chars.get(first.substring(i, i+1));
				c = c+1;
				chars.put(first.substring(i, i+1), c);
			} else {
				chars.put(first.substring(i, i+1), 1);
			}
		}
		for(int i=0; i<second.length(); i++) {
			Boolean present = chars.containsKey(second.substring(i, i+1));
			if(present) {
				Integer c = chars.get(second.substring(i, i+1));
				System.out.println(c);
				c = c-1;
				chars.put(second.substring(i, i+1), c);
				System.out.println(chars.get(second.substring(i, i+1)));
			} else {
				chars.put(second.substring(i, i+1), -1);
			}
		}
		
		int needed = 0;
		Set<String> keys = chars.keySet();
		Iterator<String> it = keys.iterator();
		while(it.hasNext()) {
			String k = it.next();
			int v = chars.get(k);
			v = Math.abs(v);
			needed = needed + v;
			System.out.println(k+" : "+v);
		}
		for(int i=0; i<chars.size(); i++) {
			
		}
		return needed;
    }
	
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        /*String first = in.next();
        String second = in.next();*/
        String first = "cde";
        String second = "abc";
        System.out.println(numberNeeded(first, second));
        in.close();
    }

}
