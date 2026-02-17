package top150.deqode.intuit;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class LongestStringInList {

    public static void main(String[] args) {
        List<String> list = Arrays.asList("Nass","Deepak","Mohit", "Salman","Shahrukh");
        Optional<String> maxLengthString = list.stream().max(Comparator.comparing(String::length));
        System.out.println(maxLengthString.get());
    }
}
