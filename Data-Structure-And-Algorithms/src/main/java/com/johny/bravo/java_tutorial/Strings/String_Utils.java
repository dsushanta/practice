package com.johny.bravo.java_tutorial.Strings;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class String_Utils {

	public static void CountCharacterOccurence() {
		String sentence = "Joey is a character from Friends Joey eats a lot of food Joey is an actor";
		char a = 'a';
		int count = sentence.length() - sentence.replaceAll("a", "").length();
		System.out.println(a+" : "+count);
	}

	public static void rotatedStingCheck() {
		String s1 = "JoeyChandlerPhoebe";
		String s2 = "ChandlerPhoebeJoeh";
		if(s1.length() != s2.length())
			return;
		String s3 = s2 + s2;
		if(s3.contains(s1))
			System.out.println(s2+" is a rotated version of "+s1);
		else
			System.out.println(s2+" is NOT a rotated version of "+s1);
	}
	
	public static void find_duplicate_words() {
		String sentence = "Joey is a character from Friends Joey eats a lot of food Joey is an actor";
		String[] words = sentence.split(" ");
		Map<String, Integer> unique = new HashMap<String, Integer>();
		
		for(String s : words) {
			if(unique.containsKey(s))
				unique.put(s, unique.get(s)+1);
			else
				unique.put(s, 1);
		}
		
		Set<String> k = unique.keySet();
		
		for(String s : k) {
			if(unique.get(s) > 1)
				System.out.println(s+" : "+unique.get(s));
		}
	}
	
	public static void String_concat_performance()
    {
        String s = "JAVA";    
        long startTime = System.currentTimeMillis();
        for(int i = 0; i <= 10000; i++)
        {
            s = s + "J2EE";
        }
        long endTime = System.currentTimeMillis();
        System.out.println("Time taken by String class : "+(endTime - startTime)+" ms");
        
        StringBuffer sb = new StringBuffer("JAVA");
        startTime = System.currentTimeMillis();
        for(int i = 0; i <= 10000; i++)
        {
            sb.append("J2EE");
        }
        endTime = System.currentTimeMillis();
        System.out.println("Time taken by StringBuffer class : "+(endTime - startTime)+" ms");
        
        StringBuilder sb1 = new StringBuilder("JAVA");
        startTime = System.currentTimeMillis();
        for(int i = 0; i <= 10000; i++)
        {
            sb1.append("J2EE");
        }
        endTime = System.currentTimeMillis();
        System.out.println("Time taken by StringBuilder class : "+(endTime - startTime)+" ms");
        
        StringBuilder sb2 = new StringBuilder("Joey");
        System.out.println(sb2.reverse());
    }
	
	public static void strings_are_immutable() {
		
		//Strings are immutable. 
		//That means once you create a string object, you can’t modify the contents of that object. 
		//If you try to modify the contents of string object, a new string object is created with modified content.
		
		String s1 = "Chandler";
        String s2 = "Chandler";
 
        System.out.println(s1 == s2);         //Output : true
 
        s1 = s1 + "Bing";
 
        System.out.println(s1 == s2);         //Output : false. 
        
        // That means now both s1 and s2 are pointing to two different objects in the pool. 
        //Before modifications they are pointing to same object. 
        //Once we tried to change the content of the object using ‘s1’, 
        //a new object is created in the pool with “ChandlerBing” as it’s content and 
        //it’s reference is assigned to s1. If the strings are mutable, 
        //both s1 and s2 should point to same object even after modification. 
        //That never happened here. That proves the string objects are immutable in java.
	}
	
	public static void string_memory() {
		
		String s1 = "Johny";
		String s2 = "Johny";
		System.out.println("\n Only one object created : "+(s1==s2));
		
		char[] c = {'J','o','e','y'};
		String s5 = new String(c);
		String s6 = new String(c);
		System.out.println("\n Two different objects created : "+(s5==s6));
		
		String s7 = new String("Chandler");
		String s8 = new String("Chandler");
		System.out.println("\n Two different objects created : "+(s7==s8));
	}
	
	public static void isAnagram() {
		
		String string_1 = "abc"; 
		String string_2 = "Bca";
		
		String s1 = string_1.replaceAll("\\s", "");
		String s2 = string_2.replaceAll("\\s", "");
		
		if(s1.length() != s2.length()) {
			System.out.println("Strings are not A	nagrams !!");
			return;
		}
		
		s1 = s1.toLowerCase();
		s2 = s2.toLowerCase();
		
		char[] c1 = s1.toCharArray();
		char[] c2 = s2.toCharArray();
		
		Arrays.sort(c1);
		Arrays.sort(c2);
		
		boolean status = Arrays.equals(c1, c2);
		
		if(status)
			System.out.println("String are Anagrams !!");
		else
			System.out.println("String are not Anagrams !!");
	}
	
	static void reverseStringByKeepingSpacesinSamePosition()
    {
		String inputString = "My Name is joey";
        //Converting inputString to char array 'inputStringArray'
         
        char[] inputStringArray = inputString.toCharArray();
         
        //Defining a new char array 'resultArray' with same size as inputStringArray
         
        char[] resultArray = new char[inputStringArray.length];
         
        //First for loop : 
        //For every space in the 'inputStringArray', 
        //we insert spaces in the 'resultArray' at the corresponding positions 
         
        for (int i = 0; i < inputStringArray.length; i++) 
        {
            if (inputStringArray[i] == ' ') 
            {
                resultArray[i] = ' ';
            }
        }
         
        //Initializing 'j' with length of resultArray
         
        int j = resultArray.length-1;
                 
        //Second for loop :
        //we copy every non-space character of inputStringArray 
        //from first to last at 'j' position of resultArray
         
        for (int i = 0; i < inputStringArray.length; i++)
        {
            if (inputStringArray[i] != ' ') 
            {
                //If resultArray already has space at index j then decrementing 'j'
                 
                if(resultArray[j] == ' ')
                {
                    j--;
                }
                 
                resultArray[j] = inputStringArray[i];
                 
                j--;
            }
        }
         
        System.out.println(inputString+" ---> "+String.valueOf(resultArray));
    }
	
	public static void longestSubString() {
		
		String original = "javaconceptoftheday";
		int size = 0;
		String longestSubString = null;
		
		char[] c1 = original.toCharArray();
		Map<Character, Integer> pos = new LinkedHashMap<Character, Integer>();
		
		for(int i=0; i<c1.length; i++) {
			char ch = c1[i];
			if(!pos.containsKey(ch))
				pos.put(ch, i);
			else {
				i = pos.get(ch);
				pos.clear();
				
			}
			if(pos.size() > size) {
				size = pos.size();
				longestSubString = pos.keySet().toString();
			}
		}
		System.out.println("Longest Substring : "+longestSubString+" of length : "+size);
	}
	
	public static void firstReapetedChar() {
		
		String original = "JavaConceptOfTheDay";
		char[] c1 = original.toCharArray();
		Map<Character, Integer> m = new LinkedHashMap<Character, Integer>();
		
		for(char c : c1) {
			if(m.containsKey(c)) {
				m.put(c, m.get(c)+1);
			}	
			else
				m.put(c, 1);
		}
		Set<Character> keys = m.keySet();
		for(Character k : keys) {
			if(m.get(k) > 1) {
				System.out.println(k+" is the first repeated char !!");
				break;
			}	
		}
		
		for(Character k : keys) {
			if(m.get(k) == 1) {
				System.out.println(k+" is the first non-repeated char !!");
				break;
			}	
		}
	}
	
	public static void swapWithoutThirdVar() {
		
		String s1 = "Hello";
		String s2 = "World";
		
		s1 = s1 + s2;
		s2 = s1.substring(0,s1.length()-s2.length());
		s1 = s1.substring(s2.length());
		
		System.out.println(s1+" : "+s2);
	}
}




































































































