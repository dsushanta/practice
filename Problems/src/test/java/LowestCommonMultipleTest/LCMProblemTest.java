package LowestCommonMultipleTest;

import LowestCommonMultiple.LCMProblem;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class LCMProblemTest {
    @ParameterizedTest
    @CsvSource(value = {"3,5,15", "4,12,12", "6,8,24", "1,1,1", "7,7,7", "45,50,450", "23458, 43298, 507842242"})
    public void checkHighestCommonFactor(int firstNumber, int secondNumber, int lowestCommonMultiple){
        Assertions.assertEquals(lowestCommonMultiple, LCMProblem.getLowestCommonMultiple(firstNumber,secondNumber),
                () -> "Lowest common multiple is not matching");
    }

    @ParameterizedTest
    @CsvSource(value = {"0,0", "-1,-1", "-10,3", "3,-7", "2,0", "0,45"})
    public void checkExceptionForInvalidInput(int firstNumber, int secondNumber){
        assertThrows(RuntimeException.class, ()-> LCMProblem.getLowestCommonMultiple(firstNumber, secondNumber), ()-> "No exception was thrown for the inputs : "+firstNumber+ " , "+secondNumber);
    }
}
