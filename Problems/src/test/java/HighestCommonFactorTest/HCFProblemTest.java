package HighestCommonFactorTest;

import HighestCommonFactor.HCFProblem;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

public class HCFProblemTest {

    @ParameterizedTest
    @CsvSource(value = {"18,27,9", "4,12,4", "3,5,1", "1,1,1", "7,7,7", "45,50,5", "23458, 43298, 2"})
    public void checkHighestCommonFactor(int firstNumber, int secondNumber, int highestCommonFactor){
        assertEquals(highestCommonFactor, HCFProblem.getHighestCommonFactor(firstNumber,secondNumber),
                () -> "Highest common factor is not matching");
    }

    @ParameterizedTest
    @CsvSource(value = {"0,0", "-1,-1", "-10,3", "3,-7", "2,0", "0,45"})
    public void checkExceptionForInvalidInput(int firstNumber, int secondNumber){
        assertThrows(RuntimeException.class, ()-> HCFProblem.getHighestCommonFactor(firstNumber, secondNumber), ()-> "No exception was thrown for the inputs : "+firstNumber+ " , "+secondNumber);
    }
}
