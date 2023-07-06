/* Problem Statement ----------------------
 * Given a time in 12-hour AM/PM format, convert it to military (24-hour) time.
 */

package com.johny.bravo.hackerrank.Problems;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Time_Conversion {

	public static void main(String[] args) throws IOException {
		
		InputStreamReader in_reader = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(in_reader);
		String time = br.readLine();
		System.out.println(convert(time));
	}
	
	public static String convert(String time) {
		int size = time.length();
		String converted_time = null;
		if(time.contains("AM")) {
			String s = null;
			int hr = Integer.parseInt(time.substring(0, 2));
			String temp = time.substring(0, size-2);
			converted_time = time.substring(2, size-2);
			if(hr == 12) {
				s = "00";
				converted_time = s+converted_time;
			}
			else 
				converted_time = temp;
			
		}	
		else if(time.contains("PM")){
			int hr = Integer.parseInt(time.substring(0, 2));
			converted_time = time.substring(2, size-2);
			if(hr != 12)
				hr += 12;
			if(hr >= 24)
				hr -= 24;
			converted_time = hr+converted_time;
		}
		return converted_time;
	}
}
