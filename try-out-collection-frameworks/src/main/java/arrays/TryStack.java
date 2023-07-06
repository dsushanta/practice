package arrays;

import practice.amigos.Character;
import practice.amigos.Gender;

import java.util.Stack;

public class TryStack {
    public TryStack() {
    }

    public void function1(){
        Stack<Character> chars = new Stack<>();
        chars.push(new Character("Chandler", 29, Gender.MALE));
        chars.push(new Character("Joey", 30, Gender.MALE));
        chars.push(new Character("Phoebe", 32, Gender.FEMALE));
        chars.push(new Character("Monica", 28, Gender.FEMALE));
        chars.push(new Character("Ross", 31, Gender.MALE));

        System.out.println("Element at top of the stack : "+chars.peek());
    }
}
