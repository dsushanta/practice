package HighestCommonFactor;

public class HCFProblem {
    public static int getHighestCommonFactor(int firstNumber, int secondNumber) {
        if(firstNumber <=0 || secondNumber <=0)
            throw new RuntimeException("Invalid input");

        if(firstNumber == secondNumber)
            return firstNumber;

        if(firstNumber%secondNumber==0)
            return secondNumber;
        if (secondNumber%firstNumber==0)
            return firstNumber;

        var smallerNumber = Math.min(firstNumber, secondNumber);

        for(int i=smallerNumber/2; i>0; i--){
            if(firstNumber%i==0 && secondNumber%i==0)
                return i;
        }

        return 1;
    }
}
