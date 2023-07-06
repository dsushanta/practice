package LowestCommonMultiple;

public class LCMProblem {
    public static int getLowestCommonMultiple(int firstNumber, int secondNumber) {
        if(firstNumber <=0 || secondNumber <=0)
            throw new RuntimeException("Invalid input");

        if(firstNumber == secondNumber)
            return firstNumber;

        if(firstNumber%secondNumber==0)
            return firstNumber;
        if (secondNumber%firstNumber==0)
            return secondNumber;

        var biggerNumber = Math.max(firstNumber, secondNumber);

        for(int i=biggerNumber*2; i<=firstNumber*secondNumber; i++){
            if(i%firstNumber==0 && i%secondNumber==0)
                return i;
        }
        return 0;
    }
}
