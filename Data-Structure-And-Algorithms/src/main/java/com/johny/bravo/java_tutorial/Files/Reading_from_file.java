package com.johny.bravo.java_tutorial.Files;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Reading_from_file {

	public static void main(String[] args) throws FileNotFoundException {
		
		String fName = "example.txt";
		
		// File Object - Java representation of file
		File file_object = new File(fName);    		
		
		// For User inputs - Argument to scanner constructor is System.in (in varibale of system class) which indicates that it will be an input from console
		//Scanner in = new Scanner(System.in);
		// For File inputs - Argument to scanner constructor is a file object
		Scanner in = new Scanner(file_object);
		
		while(in.hasNextLine()) {
			String l = in.nextLine();
			System.out.println(l);
		}
		in.close();
	}

}
