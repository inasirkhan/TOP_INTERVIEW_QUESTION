package top150.deqode.intuit.day3;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CharCountOrderMaintained {

    public static void main(String[] args) {
        String str = "programming";
        Map<Character, Long> collect = str.chars().mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(), TreeMap::new, Collectors.counting()));

        System.out.println(collect);
    }
}
