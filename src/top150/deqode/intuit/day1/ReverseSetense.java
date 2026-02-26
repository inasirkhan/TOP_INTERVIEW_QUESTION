package top150.deqode.intuit.day1;

import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ReverseSetense {

    public static String reverseSent(String str){
        StringBuilder builder = new StringBuilder();
        String[] split = str.split("\\s");
        System.out.println(Arrays.toString(split));
        int n = split.length;
        System.out.println(n);
        for (int i=n-1;i>=0;i--){
//            builder.append(split[n-1]); this will give out of memory error
            builder.append(split[i]);
            if (i!=0){
                builder.append(" ");
            }
        }

        return builder.toString();
    }

    public static void main(String[] args) {
        String sentense = "My name is nasser Khan";
        String s = reverseSent(sentense);
        System.out.println(s);

        String collect = Stream.of(sentense.split("\\s")).map(str -> new StringBuilder(str).reverse().toString()).collect(Collectors.joining(" "));
        System.out.println(collect);

        String reverse = Stream.of(sentense.split("\\s")).collect(Collectors.collectingAndThen(Collectors.toList(),
                List -> {
                    Collections.reverse(List);
                    return String.join(" ", List);
                }
        ));
        System.out.println(reverse);
    }

}
