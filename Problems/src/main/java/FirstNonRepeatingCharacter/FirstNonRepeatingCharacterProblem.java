package FirstNonRepeatingCharacter;

import java.util.LinkedHashMap;

public class FirstNonRepeatingCharacterProblem {
    public static char getFirstNonRepeatingCharacter(String inputString){
        if(inputString == null || inputString.isBlank())
            throw new RuntimeException("Invalid input");

        var characterMap = new LinkedHashMap<Character, Integer>();

        for (char c: inputString.toLowerCase().toCharArray()) {
            if(characterMap.containsKey(c))
                characterMap.put(c,characterMap.get(c)+1);
            else
                characterMap.put(c,1);
        }
        return characterMap.entrySet().stream()
                .filter(e -> e.getValue()==1)
                .findFirst()
                .get()
                .getKey();
    }
}
