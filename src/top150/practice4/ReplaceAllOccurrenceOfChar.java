package top150.practice4;

import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ReplaceAllOccurrenceOfChar {

    public static void main(String[] args) {
        String str1 = "abcdABCDabcdABCD";
        System.out.println(str1.replace("a",""));

//        distinct char and their counts
        Map<Character, Long> collect = str1.chars().mapToObj(c -> (char) c)
                .map(Character::toUpperCase)
                .collect(Collectors.groupingBy(c -> c, Collectors.counting()));
        System.out.println(collect);

        String s1 = "NASSER";
        String s2 = "KHAN";

        s1 = s1.concat(s2);
        s2 = s1.substring(0, s1.length() - s2.length());
        s1 = s1.substring(s2.length());
        System.out.println(s1+" "+s2);

        String str = "madam";
        Stream.of(str)
                .map(String::toLowerCase)
                .map(s -> new StringBuilder(s).reverse().toString())
                .anyMatch(str.toLowerCase()::equals);

    }
}
