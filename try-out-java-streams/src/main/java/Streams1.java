import java.util.Arrays;
import java.util.List;

public class Streams1 {

    public void method1(){
        var nums = Arrays.asList(2,3,4,5,6,7,8,9);
        nums.stream()
                .filter(n-> n%2 != 0)
                .map(n -> n*2)
                .filter(n -> n < 11)
                .forEach(System.out::println);

        var sum = nums.stream()
                .filter(n-> n%2 != 0)
                .reduce(0, (c,e) -> c+e);
        System.out.println(sum);

        nums.stream()
                .filter(n-> n%2 != 0)
                .sorted()
                .forEach(System.out::println);
    }
}
