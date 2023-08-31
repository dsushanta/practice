package practice;

import java.util.List;

public class Runner {

    public static void main(String[] args) {

        var l = List.of(6, 4, 7, 1, 4, 7);

        l.stream().sorted().limit(2).forEach(System.out::println);
        System.out.println("-----------------");

        l.stream().distinct().forEach(System.out::println);

        var s1 = new Streams1();
//        s1.method1();
//        s1.method2();
    }
}
