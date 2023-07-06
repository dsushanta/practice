package ReverseString;

public class ReverseStringProblem {
    public static String reverseAString(String original) {
        if(original == null || original.isBlank())
            throw new RuntimeException("Invalid input");

        var length = original.length();
        var originalBuffer = new StringBuffer(original);
        for(int i=0; i<length/2; i++){
            var temp = originalBuffer.charAt(i);
            originalBuffer.setCharAt(i,originalBuffer.charAt(length-1-i));
            originalBuffer.setCharAt(length-1-i,temp);
        }
        return originalBuffer.toString();
    }
}
