package com.johny.bravo.rough;

public class abc {

	public static void main(String[] args) {
		
		a a1 = new a();
		b b1 = (b) a1;
		b1.bc();
	}

}	
	
class a{
	void ac() {
		
	}
}	

class b extends a{
	void bc() {
		System.out.println("hello");
	}
}
