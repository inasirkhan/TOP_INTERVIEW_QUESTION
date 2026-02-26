package top150.deqode.day7;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ReverseString {

    public static void main(String[] args) {
        String str = "Nasser Khan";
        String reverseStr = reverseStr(str);
        System.out.println(reverseStr);
        String reverse = str.chars().mapToObj(c -> (char) c)
                .collect(StringBuilder::new,
                        StringBuilder::append,
                        StringBuilder::append)
                .reverse().toString();
        System.out.println(reverse);
        System.out.println(reverse);

        String reduce = Stream.of(str.split(""))
                .reduce("", (a, b) -> b + a);

//        reduce() is a terminal operation in Java Stream API.
//        It is used to:
//        Combine all elements of a stream into a single result.

        System.out.println(reduce);


    }

    private static String reverseStr(String str) {
        int n = str.length();
        StringBuilder builder = new StringBuilder();
        for (int i=n-1;i>=0;i--){
            char current = str.charAt(i);
            builder.append(current);
        }
        return builder.toString();
    }
}
