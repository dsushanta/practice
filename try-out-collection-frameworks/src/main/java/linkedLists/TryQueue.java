package linkedLists;

import practice.amigos.Character;
import practice.amigos.Gender;

import java.util.LinkedList;
import java.util.Queue;

public class TryQueue {

    public TryQueue() {
    }

    public TryQueue function1(){
        Queue<Character> chars = new LinkedList<>();
        chars.add(new Character("Chandler", 29, Gender.MALE));
        chars.add(new Character("Joey", 30, Gender.MALE));
        chars.add(new Character("Phoebe", 32, Gender.FEMALE));
        chars.add(new Character("Monica", 28, Gender.FEMALE));
        chars.add(new Character("Ross", 31, Gender.MALE));

        System.out.println("Element at the front : "+chars.peek());

        return this;
    }
}
