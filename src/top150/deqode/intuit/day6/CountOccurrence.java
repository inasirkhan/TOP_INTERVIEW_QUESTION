package top150.deqode.intuit.day6;

import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CountOccurrence {

    public static void main(String[] args) {
        String str = "Nasser Khan";
        Map<Character, Long> collect = str.chars().mapToObj(c -> (char) c)
                .filter(c->!Character.isWhitespace(c))
                .map(Character::toUpperCase)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        System.out.println(collect);

        Stream.of(1,2,3,4,5,6,7,8,9)
                .peek(no-> System.out.print(no+" "))
                .limit(4)
                .forEach(na-> System.out.println(na+" "));
//        first repeating chars
        Optional<Character> first = str.chars().mapToObj(c -> (char) c)
                .filter(c -> str.indexOf(c) != str.lastIndexOf(c))
                .findFirst();
        System.out.println(first.get());
    }
}
