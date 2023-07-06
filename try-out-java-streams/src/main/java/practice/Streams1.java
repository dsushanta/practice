package practice;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Streams1 {

    public void method1(){
//        var nums = Arrays.asList(6,9,5,8,7,2,3,4);
        var nums = List.of(6,9,5,8,7,2,3,4);
        nums.stream()
                .filter(n-> n%2 != 0)
                .map(n -> n*2)
                .filter(n -> n < 11)
                .forEach(System.out::println);

        nums.stream()
                .filter(n -> n%2 == 0)
                .map(n -> n+2)
                .filter(n -> n > 10)
                .reduce(0, Integer::sum);

        var sum = nums.stream()
                .filter(n-> n%2 != 0)
                .reduce(0, Integer::sum);
        System.out.println("Sum : "+sum);

        var a = nums.stream()
                .filter(n-> n%2 != 0)
                .sorted();
//                .forEach(System.out::println);

        a.forEach(System.out::println);

        System.out.println("Highest number");
        nums.stream().sorted(Comparator.comparing(Integer::intValue).reversed()).findFirst().ifPresent(System.out::println);
        nums.stream().max(Comparator.comparing(Integer::intValue)).ifPresent(System.out::println);

        System.out.println("Lowest number");
        nums.stream().min(Comparator.comparing(Integer::intValue)).ifPresent(System.out::println);

        System.out.println("2nd smallest");
        nums.stream().sorted(Comparator.comparing(Integer::intValue)).skip(1).findFirst().ifPresent(System.out::println);
        System.out.println("3rd smallest");
        nums.stream().sorted(Comparator.comparing(Integer::intValue)).skip(2).findFirst().ifPresent(System.out::println);

        System.out.println("2nd largest");
        nums.stream().sorted(Comparator.comparing(Integer::intValue).reversed()).skip(1).findFirst().ifPresent(System.out::println);

        System.out.println("Skip");
        nums.stream().skip(nums.size()-2).forEach(System.out::println);
    }

    public void method2(){
        var players = List.of("Ronaldo", "messi", "hazard", "zidane");
        var players1 = Arrays.asList("Ronaldo", "messi", "hazard", "zidane");

        players1.stream().min(Comparator.comparing(String::length)).ifPresent(System.out::println);

        var arr = new int[] {2,6,7,5,1};
        Arrays.stream(arr).sorted().findFirst().ifPresent(System.out::println);
    }
}
