package problems;

import practice.amigos.Character;
import practice.amigos.Gender;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class JavaHungryProblems {

    public static List<Character> getCharacters(){
        return List.of(
                new Character("Chandler Bing", 31, Gender.MALE),
                new Character("Joey Tribbiani", 30, Gender.MALE),
                new Character("Monika Geller", 28, Gender.FEMALE),
                new Character("Phoebe Buffay", 32, Gender.FEMALE),
                new Character("Ross Geller", 32, Gender.MALE),
                new Character("Rachel Green", 29, Gender.FEMALE)
        );
    }

    public static void problem1(){
        var characters = getCharacters();
        characters.forEach(System.out::println);
    }

    public static void problem2(){
        var characters = getCharacters().toArray();
        Arrays.stream(characters).forEach(System.out::println);
    }

    public static void problem3(){
        var characterSet = new HashSet<Character>();
        characterSet.add(new Character("Chandler Bing", 31, Gender.MALE));
        characterSet.add(new Character("Joey Tribbiani", 30, Gender.MALE));
        characterSet.add(new Character("Monika Geller", 28, Gender.FEMALE));
        characterSet.add(new Character("Phoebe Buffay", 32, Gender.FEMALE));
        characterSet.add(new Character("Ross Geller", 32, Gender.MALE));
        characterSet.add(new Character("Rachel Green", 29, Gender.FEMALE));

        System.out.println(characterSet.stream()
                .anyMatch(character -> character.getName().contains("Joey")));

        characterSet.stream().forEach(System.out::println);
    }

    public static void problem4(){
        var characters = getCharacters();
        characters.stream()
                .filter(character -> character.getName().contains("Joey"))
                .forEach(System.out::println);
    }
}
