package ReverseStringTest;

import ReverseString.ReverseStringProblem;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class ReverseStringProblemTest {

    @ParameterizedTest
    @CsvSource(value = {"'hello','olleh'", "'a','a'", "'aa','aa'", "'oyo','oyo'"})
    public void testReverseString(String original, String reversed){
        assertEquals(reversed, ReverseStringProblem.reverseAString(original), () -> "String is not correctly reversed");
    }

    @ParameterizedTest
    @CsvSource(value = {"''", "'   '"})
    public void testReverseString(String original){
        assertThrows(RuntimeException.class, ()->ReverseStringProblem.reverseAString(original), () -> "Did not throw exception");
    }
}
