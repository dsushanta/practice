package com.johny.bravo.hackerrank.Problems;

import java.util.Scanner;

public class The_Time_In_Words {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int hour = in.nextInt();
		int minute = in.nextInt();
		String words = null;
		if(minute > 30)
			hour++;
		if(minute == 0)
			words = num_to_words(hour)+" "+min_in_words(minute);
		else {
			words = min_in_words(minute)+" "+num_to_words(hour);
		}
		System.out.println(words);
		in.close();
	}

	public static String min_in_words(int min) {
		String words = null;
		if(min == 0) {
			words = "o' clock";
		}
		else if(min == 30) {
			words = "half past";
		}
		else if(min < 30) {
			if(min == 15)
				words = "quarter past";
			else if(min == 1)
				words = num_to_words(min)+" minute past";
			else 
				words = num_to_words(min)+" minutes past";
		}
		else {
			if(min == 45)
				words = "quarter to";
			else if(min == 59)
				words = num_to_words(60-min)+" minute to";
			else 
				words = num_to_words(60-min)+" minutes to";
		}
		return words;
	}
	
	public static String num_to_words(int n) {
		String words = null;
		if(n <= 20) {
			switch(n) {
				case 1 :
					words = "one";
					break;
				case 2 :
					words = "two";
					break;
				case 3 :
					words = "three";
					break;
				case 4 :
					words = "four";
					break;
				case 5 :
					words = "five";
					break;
				case 6 :
					words = "six";
					break;
				case 7 :
					words = "seven";
					break;
				case 8 :
					words = "eight";
					break;
				case 9 :
					words = "nine";
					break;
				case 10 :
					words = "ten";
					break;
				case 11 :
					words = "eleven";
					break;
				case 12 :
					words = "tweleve";
					break;
				case 13 :
					words = "thirteen";
					break;
				case 14 :
					words = "fourteen";
					break;
				case 16 :
					words = "sixteen";
					break;
				case 17 :
					words = "seventeen";
					break;
				case 18 :
					words = "eighteen";
					break;
				case 19 :
					words = "nineteen";
					break;
				case 20 :
					words = "twenty";
					break;	
			}
		}
		else {
			int s = n%10;
			words = "twenty "+num_to_words(s);
		}
		return words;
	}
}
