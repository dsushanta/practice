package FirstNonRepeatingCharacterTest;

import AnagramStrings.AnagramStringsProblem;
import FirstNonRepeatingCharacter.FirstNonRepeatingCharacterProblem;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class FirstNonRepeatingCharacterProblemTest {

    @ParameterizedTest
    @CsvSource(value = {"'Sushanthu','a'", "'abc','a'", "'aabbcc','a'"})
    public void testFirstNonRepeatingCharacter(String inputString, char firstRepeatingCharacter){
        assertEquals(firstRepeatingCharacter, FirstNonRepeatingCharacterProblem.getFirstNonRepeatingCharacter(inputString), ()-> "First non-repeating character does not match");
    }

    @ParameterizedTest
    @CsvSource(value = {"'   '", "''"})
    public void testFirstNonRepeatingCharacter(String inputString){
        assertThrows(RuntimeException.class, ()-> FirstNonRepeatingCharacterProblem.getFirstNonRepeatingCharacter(inputString), ()-> "Did not throw exception");
    }
}
