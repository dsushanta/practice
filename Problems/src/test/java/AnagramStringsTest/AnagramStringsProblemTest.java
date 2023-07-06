package AnagramStringsTest;

import AnagramStrings.AnagramStringsProblem;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

public class AnagramStringsProblemTest {

    @ParameterizedTest
    @CsvSource(value = {"'care','race',true", "'abc','abx',false", "'abc','abcd',false"})
    public void testAnagramStrings(String firstString, String secondString, boolean status){
        assertEquals(status, AnagramStringsProblem.areStringsAnagram(firstString, secondString), ()-> "Strings are not anagram");
    }

    @ParameterizedTest
    @CsvSource(value = {"'   ','race'", "'','a'", ","})
    public void testAnagramStrings(String firstString, String secondString){
        assertThrows(RuntimeException.class, ()-> AnagramStringsProblem.areStringsAnagram(firstString, secondString), ()-> "Did not throw exception");
    }
}
