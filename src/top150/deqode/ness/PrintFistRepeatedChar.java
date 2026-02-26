package top150.deqode.ness;

import java.util.Optional;

public class PrintFistRepeatedChar {

    public static void main(String[] args) {
        String str = "swissbank";
        Optional<Character> first = str.chars().mapToObj(c -> (char) c)
                .filter(c -> str.indexOf(c) != str.lastIndexOf(c))
                .findFirst();
        System.out.println(first.get());
    }
}
