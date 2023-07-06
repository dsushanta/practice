package com.johny.bravo.java_tutorial.Files;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class File_Utils {

	public static void replaceWordInFile(String filePath, String oldString, String newString) {
        
        File f = new File(filePath);
        BufferedReader br = null;
        FileReader fr;
        FileWriter fw =null;
        String old_content = "";
        String new_content = null;
        try {
			fr = new FileReader(f);
			br = new BufferedReader(fr);
			String line = br.readLine();
			while(line != null) {
				old_content = old_content + line + System.lineSeparator();
				line = br.readLine();
			}
			new_content = old_content.replaceAll(oldString, newString);
			fw = new FileWriter(f);
			//fw = new FileWriter(f, true); // use this if you want to append something in an existing file. Otherwise full content of file will get overwitten. 
			fw.write(new_content);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
        finally {
        	try {
				br.close();
				fw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
        }
    }
}
