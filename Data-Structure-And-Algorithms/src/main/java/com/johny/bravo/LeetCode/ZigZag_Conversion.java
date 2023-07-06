package com.johny.bravo.LeetCode;

public class ZigZag_Conversion {

    public static String convert(String s, int numRows) {

        String result = "";
        int lastIndexUsed =0;
        int intialIndex = 0;
        for(int i=1; i<= numRows; i++) {
            result += s.charAt(intialIndex);
            int j = 2;
            int diff = numRows - i;
            while (true) {
                int nextIndex = intialIndex;
                int addition = diff * j;

                if(i == numRows) {
                    addition = (i-1) * j;
                    if(addition != 0) {
                        nextIndex += addition;
                        if(nextIndex >= s.length())
                            break;
                        if(lastIndexUsed != nextIndex) {
                            result += s.charAt(nextIndex);
                            lastIndexUsed = nextIndex;
                        }
                    } else {
                        break;
                    }
                } else {
                    if(addition != 0) {
                        nextIndex += addition;
                        if(nextIndex >= s.length())
                            break;
                        if(lastIndexUsed != nextIndex) {
                            result += s.charAt(nextIndex);
                            lastIndexUsed = nextIndex;
                        }
                    }

                    addition = (i-1) * 2;
                    if(addition != 0) {
                        nextIndex += addition;
                        if(nextIndex >= s.length())
                            break;
                        if(lastIndexUsed != nextIndex) {
                            result += s.charAt(nextIndex);
                            lastIndexUsed = nextIndex;
                        }
                    }
                }


                j += 2;
            }
            intialIndex++;
        }

        return result;
    }

    public static void main(String[] args) {
        String s = "PAYPALISHIRING";
        int rows = 4;
        System.out.println(convert(s, rows));
    }
}
