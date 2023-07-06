/* Problem Statement ----------------------
A kidnapper wrote a ransom note but is worried it will be traced back to him. 
He found a magazine and wants to know if he can cut out whole words from it and use them to create an untraceable replica of his ransom note. 
The words in his note are case-sensitive and he must use whole words available in the magazine, 
meaning he cannot use substrings or concatenation to create the words he needs.
Given the words in the magazine and the words in the ransom note, print Yes if he can 
replicate his ransom note exactly using whole words from the magazine; otherwise, print No.

Input Format
The first line contains two space-separated integers describing the respective values of m (the number of words in the magazine) and 
n (the number of words in the ransom note). 
The second line contains m space-separated strings denoting the words present in the magazine. 
The third line contains n space-separated strings denoting the words present in the ransom note

Sample Input :
6 4
give me one grand today night
give one grand today
Sample Output : Yes
*/
package com.johny.bravo.hackerrank.Problems;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ransom_note {

	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//        int m = in.nextInt();
//        int n = in.nextInt();
//        String magazine[] = new String[m];
//        for(int magazine_i=0; magazine_i < m; magazine_i++){
//            magazine[magazine_i] = in.next();
//        }
//        String ransom[] = new String[n];
//        for(int ransom_i=0; ransom_i < n; ransom_i++){
//            ransom[ransom_i] = in.next();
//        }
        
        String magazine[] = {"o", "l", "x", "imjaw", "bee", "khmla", "v", "o", "v", "o", "imjaw", "l", "khmla", "imjaw", "x"};
        String ransom[] = {"imjaw", "l", "khmla", "x", "imjaw", "o", "l", "l", "o", "khmla", "v", "bee", "o", "o", "imjaw", "imjaw", "o"};
        
        boolean b = check(magazine, ransom);
        if(b)
        	System.out.println("Yes");
        else
        	System.out.println("No");
        in.close();
    }
	
	public static boolean check(String m[], String n[]) {
		Map<String, Integer> m_map = new HashMap<String, Integer>();
		for(int i=0; i<m.length; i++) {
			if(m_map.containsKey(m[i])) {
				Integer v = m_map.get(m[i]);
				m_map.put(m[i], v+1);
			}
			else
				m_map.put(m[i], 1);
		}
		for(int i=0; i<n.length; i++) {
			if(!m_map.containsKey(n[i]))
				return false;
			if(m_map.containsKey(n[i])) {
				Integer v = m_map.get(n[i]);
				if(v>0) {
					m_map.put(n[i], v-1);
				}
				else
					return false;
			}
		}
		return true;
	}

}
