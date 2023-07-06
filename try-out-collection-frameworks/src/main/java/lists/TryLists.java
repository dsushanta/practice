package lists;

import practice.amigos.Character;
import practice.amigos.Gender;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

/**
 * Lists are backed by arrays
 * Use Arraylist if you will not be removing items from positions other than the end
 * This is very slow - Removal from the beginning of the array
 */

public class TryLists {
    public TryLists() {
    }

    public void function1(){
        ArrayList<Character> characterList = new ArrayList<>();

        characterList.add(new Character("Chandler Bing", 31, Gender.MALE));
        characterList.add(new Character("Joey Tribbiani", 30, Gender.MALE));
        characterList.add(new Character("Monika Geller", 28, Gender.FEMALE));
        characterList.add(new Character("Phoebe Buffay", 32, Gender.FEMALE));
        characterList.add(new Character("Ross Geller", 32, Gender.MALE));
        characterList.add(new Character("Rachel Green", 29, Gender.FEMALE));

        characterList
                .stream()
                .sorted(Comparator.comparing(Character::getAge).reversed())
                .forEach(System.out::println);
    }

    public void function2(){
        LinkedList<Character> characterLinkedList = new LinkedList<>();

        characterLinkedList.add(new Character("Chandler Bing", 31, Gender.MALE));
        characterLinkedList.add(new Character("Joey Tribbiani", 30, Gender.MALE));
        characterLinkedList.add(new Character("Monika Geller", 28, Gender.FEMALE));
        characterLinkedList.add(new Character("Phoebe Buffay", 32, Gender.FEMALE));
        characterLinkedList.add(new Character("Ross Geller", 32, Gender.MALE));
        characterLinkedList.add(new Character("Rachel Green", 29, Gender.FEMALE));

        Collections.reverse(characterLinkedList);
        characterLinkedList.forEach(System.out::println);

        characterLinkedList
                .stream()
                .sorted(Comparator.comparing(Character::getAge).reversed())
                .forEach(System.out::println);



        var characterArrayList = new ArrayList<>(characterLinkedList);
    }
}
