package com.johny.bravo.rough;

class Animal { public void eats() { System.out.println("Animal Eats"); } } 
class Cat extends Animal { public void walks() { System.out.println("Cat Walks"); } }

public class AnimalMain {
	public static void main(String args[]) { 
	Animal a=new Animal(); 
	display(a); 
	}
	public static void display(Animal a) { 
	a.eats(); 
	if(a instanceof Cat) 
		((Cat)a).walks();
	else
		((Cat)a).walks();
	}
}
