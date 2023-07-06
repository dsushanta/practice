package com.johny.bravo.misc;

public class misc {

	public void isPalindrome(int n) {
		int temp=n;
		int r, sum=0;
		while(n>0){    
			r=n%10;  //getting remainder  
			sum=(sum*10)+r;    
			n=n/10;    
		}    
		System.out.println(n);
		if(temp==sum)    
			System.out.println("palindrome number ");    
		else    
			System.out.println("not palindrome");   
	}
	
	public String longestCommonPrefix(String [] strings) {
		int lenghts[] = new int[strings.length];
		for(int i=0; i<lenghts.length; i++) {
			lenghts[i] = strings[i].length();
		}
		int m = min(lenghts);
		for(int j=0; j<m; j++) {
			
		}
		//for(int j=0; j)
		return null;
	}
	public int min(int[] l) {
		int m = l[0];
		for(int i=0; i<l.length; i++) {
			if(m>l[i])
				m = l[i];
		}
		return m;
	}
	
	
	public boolean isUniqueInt(Integer num) {
		int rem;
		int freq[] = new int[10];
		for(int i=0; i<10; i++)
			freq[i] = 0;
		
		while(num > 0) {
			rem = num%10;
			num = num/10;
			freq[rem]++;
		}
		
		for(int i=0; i<10; i++) {
			if(freq[i] > 1)
				return false;
		}
		
		return true;
	}
	
	public void factor_inefficient(double n) {
		// not completed
		for(double i=2; i<n; i++) {
			if(n%i == 0)
				System.out.print(" "+i);
		}
	}
	
	public void factor(long n) {
		while(n%2 == 0) {
			System.out.print(" 2");
			n = n/2;
		}
		long s = Math.round(Math.sqrt(n));
		for(long i=3; i<s; i=i+2) {
			while(n%i == 0) {
				System.out.print(" "+i);
				n = n/i;
			}
		}
		if(n > 2)
			System.out.print(" "+n);
	}
	
	public boolean threesum(int[] a, int n) {
		int s = a.length;
		// sort the array
		for(int i=0; i<s-2; i++) {
			int l = i+1;
			int h = s-1;
			while(l<h) {
				if(a[i]+a[l]+a[h] == n)
					return true;
				else if(a[i]+a[l]+a[h] < n)
					l++;
				else
					h--;
			}
		}	
		return false;
	}
	
//	public int bestFit(int [] boxes, int item) {
//		
//	}
//	
//	private int bstfit(int [] boxes, int start, int end, int item) {
//		if(start < end) {
//			int mid = start + (end - start)/2;
//		}
//	}
	
}
