package com.johny.bravo.LeetCode;

import java.util.Scanner;

public class Longest_Substring_Without_Repeating_Characters {

    public static void main(String[] args) {

        //Scanner in = new Scanner(System.in);
        //String inputString = in.next();
        String inputString = "dvdf";

        System.out.println(lengthOfLongestSubstring(inputString));
    }

    public static int lengthOfLongestSubstring(String s) {
        char[] chars = s.toCharArray();
        int longestStringMinIndex = 0, longestStringMaxIndex =0;
        int subStringStartingIndex = 0;

        for(int i=0; i< chars.length; i++) {
            char c = chars[i];
            if(check(chars, subStringStartingIndex, i, c) == false) {
                ;
            }else {
                if((longestStringMaxIndex-longestStringMinIndex) < i - subStringStartingIndex) {
                    longestStringMinIndex = subStringStartingIndex;
                    longestStringMaxIndex = i;
                }
                i = subStringStartingIndex;
                subStringStartingIndex = i+1;
            }
            if(i == chars.length-1) {
                if((longestStringMaxIndex-longestStringMinIndex) <= i - subStringStartingIndex) {
                    longestStringMinIndex = subStringStartingIndex;
                    longestStringMaxIndex = i+1;
                }
            }
        }
        return longestStringMaxIndex-longestStringMinIndex;
    }

    private static boolean check(char[] chars, int start, int end, char c) {
        boolean result = false;
        for(int i=start; i<end; i++) {
            if(chars[i] == c) {
                result = true;
                break;
            }
        }
        return result;
    }
}
