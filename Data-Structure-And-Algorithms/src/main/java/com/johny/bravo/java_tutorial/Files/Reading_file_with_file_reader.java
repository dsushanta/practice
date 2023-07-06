package com.johny.bravo.java_tutorial.Files;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class Reading_file_with_file_reader {

	public static void main(String[] args) {
		
		File f_name = new File("file_for_file_reader.txt");
		FileReader fr;
		brr br = null;
		BufferedReader br1 = null;
		
		try {
			fr = new FileReader(f_name);
			 //br1 = new BufferedReader(fr);
			// brr class extends BufferedReader class and implements toString method
			br = new brr(fr);
			
			System.out.println("This is the output of my toString method : "+br.toString());
			
			String l;
			
			while((l=br.readLine()) != null) {
				System.out.println(l);
			}
			
		} catch (FileNotFoundException e) {
			System.out.println("\n Please check...Looks like the file -"+f_name.toString()+" is missing !!");
		} catch (IOException e) {
			System.out.println("\n Please check...Looks like the file -"+f_name.toString()+" is not accessible !!");
		}
		finally {
			try {
				br.close();
			} catch (IOException | NullPointerException e) {
				System.out.println("\n Can not close the file -"+f_name.toString()+" !!");
			}
		}
	}

}
