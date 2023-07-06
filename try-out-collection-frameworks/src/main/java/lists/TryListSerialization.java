package lists;

import practice.amigos.Character;
import practice.amigos.Gender;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.ArrayList;
import java.util.LinkedList;

public class TryListSerialization {

    ObjectMapper mapper = new ObjectMapper();

    public void function1(){
        var characterLinkedList = new LinkedList<>();

        characterLinkedList.add(new Character("Chandler Bing", 31, Gender.MALE));
        characterLinkedList.add(new Character("Joey Tribbiani", 30, Gender.MALE));
        characterLinkedList.add(new Character("Monika Geller", 28, Gender.FEMALE));
        characterLinkedList.add(new Character("Phoebe Buffay", 32, Gender.FEMALE));
        characterLinkedList.add(new Character("Ross Geller", 32, Gender.MALE));
        characterLinkedList.add(new Character("Rachel Green", 29, Gender.FEMALE));

        try {
            var s = mapper.writeValueAsString(characterLinkedList);
            System.out.println(s);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }

    public void function2(){
        String input = "[{\"name\":\"Chandler Bing\",\"age\":31,\"gender\":\"MALE\"},{\"name\":\"Joey Tribbiani\",\"age\":30,\"gender\":\"MALE\"},{\"name\":\"Monika Geller\",\"age\":28,\"gender\":\"FEMALE\"},{\"name\":\"Phoebe Buffay\",\"age\":32,\"gender\":\"FEMALE\"},{\"name\":\"Ross Geller\",\"age\":32,\"gender\":\"MALE\"},{\"name\":\"Rachel Green\",\"age\":29,\"gender\":\"FEMALE\"}]";
        try {
            var desrializedJson = mapper.readValue(input, new TypeReference<ArrayList<Character>>() {
            });
            desrializedJson.forEach(character -> System.out.println(character.getName()));

        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }
}
