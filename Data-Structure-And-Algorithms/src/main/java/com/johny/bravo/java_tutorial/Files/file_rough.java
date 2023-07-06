package com.johny.bravo.java_tutorial.Files;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class file_rough {

	public static void main(String[] args) throws IOException {
		
		File f = new File("example.txt");
		/*FileReader fr = new FileReader(f);
		
		BufferedReader br = new BufferedReader(fr);
		
		String l = br.readLine();
		System.out.println(l);*/
		
		InputStreamReader ir = new InputStreamReader(System.in);
		BufferedReader br_u = new BufferedReader(ir);
		String a = br_u.readLine();
		System.out.println(a);
		
		Scanner in = new Scanner (System.in);    // This is for taking input from user
		
		//Scanner in = new Scanner(f);       // This is for reading from a file
		
		// then normal ways
		String s = in.nextLine();
	}

}
