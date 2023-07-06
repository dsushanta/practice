package FirstNonRepeatingCharacter;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Stream;

public class FirstNonRepeatingCharacterProblem {
    public static char getFirstNonRepeatingCharacter(String inputString){
        if(inputString == null || inputString.isBlank())
            throw new RuntimeException("Invalid input");

        var characterMap = new LinkedHashMap<Character, Integer>();

        for (char c: inputString.toCharArray()) {
            if(characterMap.containsKey(c))
                characterMap.put(c,characterMap.get(c)+1);
            else
                characterMap.put(c,1);
        }
        return 'a';

        /*return characterMap.entrySet().stream()
                .filter(e-> e.getValue()==1)
                .findFirst()
                .ifPresentOrElse()
                .get()
                .getKey();*/
    }
}
