package top150.deqode.intuit.day2;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ReverseStringStreamApi {

    public static void main(String[] args) {
        String str = "Nasser khan is";
        String str1 = "Nasser";
        String collect = Stream.of(str.split(" "))
                .map(s -> new StringBuilder(s).reverse())
                .collect(Collectors.joining(" "));
        System.out.println(collect);

        String reverse = Stream.of(str1.split(""))
                .reduce("", (a, b) -> b + a);
        System.out.println(reverse);
    }
}
