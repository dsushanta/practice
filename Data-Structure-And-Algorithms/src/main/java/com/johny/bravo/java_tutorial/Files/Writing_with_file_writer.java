package com.johny.bravo.java_tutorial.Files;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Writing_with_file_writer {

	public static void main(String[] args) {

		File f = new File("o.txt");
		// Try with resources. It automatically calls the close method for buffere reader/writer
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(f))) {
			bw.write("Hello There");
			bw.newLine();
			bw.write("I am writing this in a file !!");
		} catch (IOException e) {			
			e.printStackTrace();
		}
		
		
	}

}
