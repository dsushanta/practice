package ReverseNumberTest;

import ReverseNumber.ReverseNumberProblem;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

public class ReverseNumberProblemTest {

    @ParameterizedTest
    @CsvSource(value = {"123, 321","0,0","1,1", "7,7", "0,0", "200, 002"})
    public void testReverseNumber(int original, int reversed){
        assertEquals(reversed, ReverseNumberProblem.reverseANumber(original), () -> "Number is not correctly reversed");
    }

    @ParameterizedTest
    @CsvSource(value = {"-123"})
    public void testReverseNumber(int original){
        assertThrows(RuntimeException.class, ()->ReverseNumberProblem.reverseANumber(original), () -> "Did not throw exception");
    }
}
