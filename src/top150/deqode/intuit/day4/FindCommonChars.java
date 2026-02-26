package top150.deqode.intuit.day4;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FindCommonChars {

//    10. Find the common letter in Input list of string "ravi", "ram", "ranjit". Output -: ra . Using stream

    public static void main(String[] args) {
        List<String> list = Arrays.asList("ravi","ranjit","ram");
        String commonLatters = findCommonLatters(list);
        System.out.println(commonLatters);
    }

    private static String findCommonLatters(List<String> list) {
        int n = list.size();
        StringBuilder builder = new StringBuilder();
        Collections.sort(list);
        String first = list.get(0);
        String last = list.get(n-1);
        for (int i = 0;i<Math.min(first.length(),last.length());i++){
            if (first.charAt(i) != last.charAt(i)){
                return builder.toString();
            }
            builder.append(first.charAt(i));
        }
        return builder.toString();
    }
}
