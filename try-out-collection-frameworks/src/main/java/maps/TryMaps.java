package maps;

import practice.amigos.Character;
import practice.amigos.Gender;

import java.util.*;
import java.util.stream.Collectors;

public class TryMaps {

    private Map<String, Character> characterMap;

    public TryMaps function1(){

        characterMap = new HashMap<>();
        characterMap.put("friend1", new Character("Phoebe", 32, Gender.FEMALE));
        characterMap.put("friend22", new Character("Monica", 28, Gender.FEMALE));
        characterMap.put("friend333", new Character("Joey", 30, Gender.MALE));
        characterMap.put("friend4444", new Character("Chandler", 29, Gender.MALE));
        characterMap.put("friend55555", new Character("Ross", 31, Gender.MALE));

        characterMap.forEach((key, value) -> System.out.println(key + " : " + value));

        characterMap.keySet()
                .stream()
                .sorted(Comparator.comparing(String::length).reversed())
                .forEach(System.out::println);

        return this;
    }

    public TryMaps function2(){

        characterMap = new HashMap<>();
        characterMap.put("friend1", new Character("Phoebe", 32, Gender.FEMALE));
        characterMap.put("friend22", new Character("Monica", 28, Gender.FEMALE));
        characterMap.put("friend333", new Character("Joey", 30, Gender.MALE));
        characterMap.put("friend4444", new Character("Chandler", 29, Gender.MALE));
        characterMap.put("friend55555", new Character("Ross", 31, Gender.MALE));

        characterMap.keySet()
                .stream()
                .sorted(Comparator.comparing(String::length).reversed())
                .forEach(System.out::println);

        return this;
    }

    public TryMaps function3(){

        characterMap = new HashMap<>();
        characterMap.put("friend1", new Character("Phoebe", 32, Gender.FEMALE));
        characterMap.put("friend2", new Character("Monica", 28, Gender.FEMALE));
        characterMap.put("friend3", new Character("Joey", 30, Gender.MALE));
        characterMap.put("friend4", new Character("Chandler", 29, Gender.MALE));
        characterMap.put("friend5", new Character("Ross", 31, Gender.MALE));

        // Fetched using Key Set
        /**
         * Here, the loop iterates over keySet. For each key, we get the corresponding value using Map.get()
         * While this is okay but it requires two operations for each entry — one to get the next key and one to look up the value with get.
         */
        System.out.println("Fetched using Key Set");
        for(String key : characterMap.keySet()){
            System.out.println("Key : "+ key +", Value : "+characterMap.get(key));
        }

        // Fetched using Entry Set
        /**
         * As Map.Entry stores both the key and value together in one class, we get them both in a single operation.
         * If we want to access both key and value, this option is better than keyset
         */
        System.out.println("Fetched using Entry Set");
        for(Map.Entry<String, Character> entry : characterMap.entrySet()){
            System.out.println("Key : "+ entry.getKey() +", Value : "+entry.getValue());
        }

        System.out.println("Using streams");
        characterMap.entrySet().forEach(System.out::println);

        return this;
    }

    public TryMaps function4(){

        characterMap = new LinkedHashMap<>();
        characterMap.put("friend1", new Character("Phoebe", 32, Gender.FEMALE));
        characterMap.put("friend22", new Character("Monica", 28, Gender.FEMALE));
        characterMap.put("friend333", new Character("Joey", 30, Gender.MALE));
        characterMap.put("friend4444", new Character("Chandler", 29, Gender.MALE));
        characterMap.put("friend55555", new Character("Ross", 31, Gender.MALE));

        characterMap.entrySet().stream()
                .sorted(Map.Entry.comparingByKey())
                .forEach(System.out::println);

        var mapSortedByValue = characterMap.entrySet().stream()
                .sorted(Map.Entry.comparingByValue())
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (oldValue, newValue) -> oldValue, LinkedHashMap::new
                ));
        System.out.println("");
        mapSortedByValue.forEach((key,value) -> System.out.println("Key : " +key+ ", Value : "+value));
        return this;
    }
}
