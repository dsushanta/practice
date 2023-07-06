package ReverseNumber;

public class ReverseNumberProblem {
    public static int reverseANumber(int original) {

        if(original < 0)
            throw new RuntimeException("invalid input");

        if(original/10 == 0)
            return original;

        var reversed = 0;

        while (original > 0){
            reversed = reversed*10 + original%10;
            original = original/10;
        }

        return reversed;
    }
}
