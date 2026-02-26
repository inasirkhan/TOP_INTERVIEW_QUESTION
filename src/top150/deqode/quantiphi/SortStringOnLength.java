package top150.deqode.quantiphi;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SortStringOnLength {

//    Sort the List of string on basis of length and if length is same then sort alphabetically.
public static void main(String[] args) {
    String[] strings = {"Mohit", "Nasser","Arpit","Devnedra","Alexender"};
//    List<String> list = Arrays.stream(strings).
//            sorted((s1,s2)-> s1.length()>s2.length()?1:s1.length()<s2.length()?-1:s1.compareTo(s2)
//            )
//            .toList();

    List<String> list = Arrays.stream(strings)
            .sorted(Comparator.comparing(String::length)
                    .thenComparing(String::compareTo))
            .toList();
    System.out.println(list);
}

}
