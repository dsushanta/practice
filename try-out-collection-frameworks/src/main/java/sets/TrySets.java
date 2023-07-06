package sets;

import practice.amigos.Character;
import practice.amigos.Gender;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class TrySets {
    private Set<Character> characterSet;

    public TrySets function1(){
        characterSet = new HashSet<>();
        characterSet.add(new Character("Phoebe", 32, Gender.FEMALE));
        characterSet.add(new Character("Monica", 28, Gender.FEMALE));
        characterSet.add(new Character("Joey", 30, Gender.MALE));
        characterSet.add(new Character("Chandler", 29, Gender.MALE));
        characterSet.add(new Character("Ross", 31, Gender.MALE));

        System.out.println("");
        characterSet.forEach(c -> System.out.print(c.getName() + " : " + c.getAge() + " ,"));

        return this;
    }

    public TrySets function2(){
        characterSet = new LinkedHashSet<>();
        characterSet.add(new Character("Phoebe", 32, Gender.FEMALE));
        characterSet.add(new Character("Monica", 28, Gender.FEMALE));
        characterSet.add(new Character("Joey", 30, Gender.MALE));
        characterSet.add(new Character("Chandler", 29, Gender.MALE));
        characterSet.add(new Character("Ross", 31, Gender.MALE));

        System.out.println("");
        characterSet.forEach(c -> System.out.print(c.getName() + " : " + c.getAge() + " ,"));

        return this;
    }

    public TrySets function3(){
        characterSet = new TreeSet<>();
        characterSet.add(new Character("Phoebe", 32, Gender.FEMALE));
        characterSet.add(new Character("Monica", 28, Gender.FEMALE));
        characterSet.add(new Character("Joey", 30, Gender.MALE));
        characterSet.add(new Character("Chandler", 29, Gender.MALE));
        characterSet.add(new Character("Ross", 31, Gender.MALE));
        System.out.println("");
        characterSet.forEach(c -> System.out.print(c.getName() + " : " + c.getAge() + " ,"));

        characterSet.toArray();
        return this;
    }
}
