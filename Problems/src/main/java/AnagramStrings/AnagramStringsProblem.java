package AnagramStrings;

import java.util.Arrays;

public class AnagramStringsProblem {
    public static boolean areStringsAnagram(String firstString, String secondString){
        if(firstString == null || firstString.isBlank() || secondString == null || secondString.isBlank())
            throw new RuntimeException("Invalid input");

        var firstCharSet = firstString.toCharArray();
        Arrays.sort(firstCharSet);
        var secondCharSet = secondString.toCharArray();
        Arrays.sort(secondCharSet);

        return Arrays.equals(firstCharSet, secondCharSet);
    }
}
