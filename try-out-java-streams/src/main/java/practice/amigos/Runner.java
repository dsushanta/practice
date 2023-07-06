package practice.amigos;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Runner {
    public static void main(String[] args) {
//        tryStreamFilter();
        tryStreamSorting();
//        tryStreamAllMatch();
//        tryStreamAnyMatch();
//        tryStreamMax();
//        tryStreamMin();
//        tryStreamGroup();
//        findYoungestFemaleFriend();
    }

    public static void tryStreamFilter(){
        var allCharacters = getCharacters();

        var allFemaleCharacters = allCharacters.stream()
                .filter(character -> character.getGender().equals(Gender.FEMALE))
                .collect(Collectors.toList());

        allFemaleCharacters.forEach(System.out::println);
    }

    public static void tryStreamSorting(){
        var allCharacters = getCharacters();

        var allCharactersSorted = allCharacters.stream()
                .sorted(Comparator.comparing(Character::getAge).reversed())
                .toList();
        System.out.println("default");
        allCharacters.stream().sorted().forEach(System.out::println);
        System.out.println("reverse");
        allCharactersSorted.forEach(System.out::println);
    }

    public static void tryStreamAllMatch(){
        var allCharacters = getCharacters();

        var allMatch = allCharacters.stream()
                .allMatch(character -> character.getAge() > 28);

        System.out.println(allMatch);
    }

    public static void tryStreamAnyMatch(){
        var allCharacters = getCharacters();

        var anyMatch = allCharacters.stream()
                .anyMatch(character -> character.getAge() > 28);

        System.out.println(anyMatch);
    }

    public static void tryStreamMax(){
        var allCharacters = getCharacters();

        allCharacters.stream()
                .max(Comparator.comparing(Character::getAge))
                .ifPresent(System.out::println);
    }

    public static void tryStreamMin(){
        var allCharacters = getCharacters();

        allCharacters.stream()
                .min(Comparator.comparing(Character::getAge))
                .ifPresent(System.out::println);
    }

    public static void tryStreamGroup(){
        var allCharacters = getCharacters();

        allCharacters.stream()
                .collect(Collectors.groupingBy(Character::getGender))
                .forEach((gender, persons) -> {
                    System.out.println(gender);
                    persons.forEach(System.out::println);
                });
    }

    public static void findYoungestFemaleFriend(){
        var allCharacters = getCharacters();

        allCharacters.stream()
                .filter(character -> character.getGender().equals(Gender.FEMALE))
                .min(Comparator.comparing(Character::getAge))
                .map(Character::getName)
                .ifPresent(System.out::println);
    }

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
}
