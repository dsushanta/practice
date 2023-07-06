package arrays;

import java.util.Arrays;
import java.util.Comparator;

public class TryArrays {

    private final String[] chars;

    public TryArrays(){
        chars = new String[]{"Chandler", "Joey", "Monica"};
    }

    public void tryToString(){
        System.out.println(Arrays.toString(chars));
    }

    public void tryStream(){
        Arrays.stream(chars).forEach(System.out::println);
    }

    public void tryAsList(){
        Arrays.asList(chars).stream().forEach(System.out::println);
    }

    public void tryBinarySearch(){
        var r = Arrays.binarySearch(chars, "Joey");
        System.out.println(r);
    }

    public void tryFill(){
        Arrays.fill(chars, 0, 1, "Phoebe");
        System.out.println(Arrays.toString(chars));
    }

    public void trySort(){
        Arrays.sort(chars, Comparator.comparing(String::length).reversed());
        System.out.println(Arrays.toString(chars));
    }
}
