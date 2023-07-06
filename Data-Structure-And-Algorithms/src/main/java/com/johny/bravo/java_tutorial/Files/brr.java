package com.johny.bravo.java_tutorial.Files;

import java.io.BufferedReader;
import java.io.Reader;

public class brr extends BufferedReader {

	public brr(Reader in, int sz) {
		super(in, sz);
		// TODO Auto-generated constructor stub
	}

	public brr(Reader in) {
		super(in);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		/*return "brr [lock=" + lock + ", read()=" + read() + ", readLine()=" + readLine() + ", ready()=" + ready()
				+ ", markSupported()=" + markSupported() + ", lines()=" + lines() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";*/
		return "hello";
	}
	
}
