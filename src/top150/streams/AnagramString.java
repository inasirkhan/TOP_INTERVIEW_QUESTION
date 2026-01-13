package top150.streams;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class AnagramString {

    public static void main(String[] args) {
        String s1 = "RaceCar";
        String s2 = "CarRace";
        boolean anagram = isAnagram(s1, s2);
        System.out.println(anagram);
    }

    private static boolean isAnagram(String s1, String s2) {
        String string1 = Stream.of(s1.split(""))
                .map(String::toUpperCase)
                .sorted()
                .collect(Collectors.joining());

        System.out.println(string1);
        String string2 = Stream.of(s2.split(""))
                .map(String::toUpperCase)
                .sorted()
                .collect(Collectors.joining());
        System.out.println(string2);
        return string1.equals(string2);
    }
}
