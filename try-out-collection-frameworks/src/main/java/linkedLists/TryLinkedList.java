package linkedLists;

import practice.amigos.Character;
import practice.amigos.Gender;

import java.util.LinkedList;

public class TryLinkedList {
    private final LinkedList<Character> characters;
    public TryLinkedList() {
        characters = new LinkedList<>();
    }

    public TryLinkedList function1(){
        characters.add(new Character("Phoebe", 32, Gender.FEMALE));
        characters.add(new Character("Monica", 28, Gender.FEMALE));
        characters.addLast(new Character("Joey", 30, Gender.MALE));
        characters.addFirst(new Character("Chandler", 29, Gender.MALE));
        characters.add(1, new Character("Ross", 31, Gender.MALE));

        characters.forEach(System.out::println);

        return this;
    }
}
