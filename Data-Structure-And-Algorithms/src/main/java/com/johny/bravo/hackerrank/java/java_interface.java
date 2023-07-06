package com.johny.bravo.hackerrank.java;

interface AdvancedArithmetic{
	  int divisor_sum(int n);
	}

class MyCalculator implements AdvancedArithmetic {
    @Override
    public int divisor_sum(int n) {
        if(n == 1)
            return 1;
        int count = 1+n;
        for(int i=2; i<= n/2; i++) {
            if(n%i == 0)
                count += i;
        }
        return count;
    }
}

public class java_interface {

	public static void main(String[] args) {
		

	}

}
