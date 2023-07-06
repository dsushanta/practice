package com.johny.bravo.java_tutorial.Problems;

public class dd {

	public static void main(String[] args) {
		
		int d = 666;
		System.out.println(xyz(d));
		
	}

	
	public static String xyz(int d) {
		String result = "";
		int[] denom = {2000, 500, 100, 50, 20, 10, 5, 2, 1};
		
		for(int i=0; i< denom.length; i++) {
			int t1 = d / denom[i];
			if(t1 != 0) {
				result = result + t1 + "*" + denom[i] + ",";
				d = d % denom[i];
			}
		}
		result = result.substring(0,result.length()-1);
		return result;
	}
}
