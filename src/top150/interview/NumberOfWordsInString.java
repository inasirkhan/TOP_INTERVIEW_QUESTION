package top150.interview;

import java.util.stream.Stream;

public class NumberOfWordsInString {

    public static void main(String[] args) {
        String str = "My Name is Nasser Khan";
        System.out.println(Stream.of(str.split("\\s")).count());
    }
}
