package maps;

import practice.amigos.Character;
import practice.amigos.Gender;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Serialization converts a Java object into a stream of bytes, which can be persisted or shared as needed.
 */
public class TryMapSerialization {

    /*@JsonSerialize(keyUsing = CharacterSerializer.class)
    private Map<Character, Character> charMap;*/

    ObjectMapper mapper = new ObjectMapper();

    public void function1(){

        var map = new HashMap<String, String>();
        map.put("friend1", "Chandler Bing");
        map.put("friend2", "Joey Tribbiani");

        String serializedMap = null;
        try {
            serializedMap = mapper.writerWithDefaultPrettyPrinter()
                    .writeValueAsString(map);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
        System.out.println(serializedMap);
    }

    public void function2(){
        Map<String, Character> characterMap;
        characterMap = new LinkedHashMap<>();
        characterMap.put("friend1", new Character("Phoebe", 32, Gender.FEMALE));
        characterMap.put("friend2", new Character("Monica", 28, Gender.FEMALE));
        characterMap.put("friend3", new Character("Joey", 30, Gender.MALE));
        characterMap.put("friend4", new Character("Chandler", 29, Gender.MALE));
        characterMap.put("friend5", new Character("Ross", 31, Gender.MALE));

        String serializedMap = null;
        try {
            serializedMap = mapper.writerWithDefaultPrettyPrinter()
                    .writeValueAsString(characterMap);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
        System.out.println(serializedMap);
    }

    public void function3(){

        var charMap = new HashMap<Character, Character>();

        var char1 = new Character("Phoebe", 32, Gender.FEMALE);
        var char2 = new Character("Joey", 30, Gender.MALE);
        var char3 = new Character("Chandler", 29, Gender.MALE);
        var char4 = new Character("Monica", 28, Gender.FEMALE);

        charMap.put(char1, char2);
        charMap.put(char3, char4);

        try {
            var serializedMap = mapper.writerWithDefaultPrettyPrinter()
                    .writeValueAsString(charMap);
            System.out.println(serializedMap);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }
}
