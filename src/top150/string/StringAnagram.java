package top150.string;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StringAnagram {

    public static void main(String[] args) {
        Boolean result = isAnagram("Listen","Silent");
    }


    static boolean isAna(String s1, String s2){

        String collect = Stream.of(s1.split(""))
                .map(String::toUpperCase)
                .sorted()
                .collect(Collectors.joining());

        String collect1 = Stream.of(s2.split(""))
                .map(String::toUpperCase)
                .sorted()
                .collect(Collectors.joining());

        return collect1.equals(collect);
    }





    private static Boolean isAnagram(String str1, String str2) {
        String collect = Stream.of(str1.split(""))
                .map(String::toUpperCase)
                .sorted()
                .collect(Collectors.joining());

        String collect2 = Stream.of(str2.split(""))
                .map(String::toUpperCase)
                .sorted()
                .collect(Collectors.joining());
        return collect2.equals(collect);
    }
}
