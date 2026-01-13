package top150.streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class JoinStrings {

    public static void main(String[] args) {
        List<String> listOfStrings = Arrays.asList("Facebook", "Twitter", "YouTube", "WhatsApp", "LinkedIn");
        String collect = listOfStrings.stream().collect(Collectors.joining(",","[","]"));
        System.out.println(collect);

        List<Integer> listOfIntegers = Arrays.asList(45, 12, 56, 15, 24, 75, 31, 89);
        Optional<Integer> min = listOfIntegers.stream().min(Comparator.naturalOrder());
        Optional<Integer> max = listOfIntegers.stream().max(Comparator.naturalOrder());

        System.out.println(min.get()+", "+max.get());
    }
}
