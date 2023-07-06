package com.johny.bravo.hackerrank.Problems;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class Contacts_Tries {

	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Set<String> c_set = new LinkedHashSet<String>();
        int n = in.nextInt();
        for(int i = 0; i < n; i++){
            String op = in.next();
            String contact = in.next();
            int count = 0;
            if(op.equalsIgnoreCase("add")) {
            	c_set.add(contact);
            }
            else {
            	for(String c : c_set) {
            		if(c.contains(contact))
            			count++;
            	}
            	System.out.println(count);
            }
        }
        in.close();
    }
}
