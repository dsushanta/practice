package Palindrome;

public class PalindromeProblem {

    public static boolean isPalindrome(String inputString){
        if(inputString == null)
            return false;
        if(inputString.isEmpty() || inputString.isBlank())
            return false;

        var sizeOfInputString = inputString.length();
        for (int i=0; i<=sizeOfInputString/2; i++){
            if(inputString.charAt(i) != inputString.charAt(sizeOfInputString-1-i))
                return false;
        }
        return true;

        /*var reversedString = new StringBuilder(inputString).reverse().toString();
        return inputString.equals(reversedString);*/
    }
}
