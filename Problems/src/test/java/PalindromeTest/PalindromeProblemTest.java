package PalindromeTest;

import Palindrome.PalindromeProblem;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

public class PalindromeProblemTest {

    @ParameterizedTest
    @CsvSource(value = {"'aba', true","'helloaslkdfhksdhfkahsjdfkjhsdiufhksghksjdhfgiuerksjdghksjdghiuwehfksdgbksdjhgksdjhfkdsbvisdjgisuekhfksj,fhksdjhgaieufhsdkjgskdgjhskdhweuibvkjbgieukfshksdfkjshdgfuiegfksdgisrukbgisd', false",", false","'    ' , false"})
    public void testIfPalindrome(String inputString, boolean status){
        assertEquals(status, PalindromeProblem.isPalindrome(inputString),
                () -> "The input string "+inputString+" is not a palindrome !!");
    }

    /*@Test
    public void a(){
        System.out.println(Problem.isPalindrome(null));
    }*/
}
