package top150.practice3;

import java.util.*;
import java.util.stream.Collectors;

public class FindThirdLargestNumber {

    public static void main(String[] args) {
        int[] arr = {5,3,1,6,4,2};
        Integer i = Arrays.stream(arr).boxed()
                .sorted(Comparator.reverseOrder())
                .skip(2)
                .findFirst()
                .orElse(null);
        System.out.println(i);

//        find max
        Optional<Integer> max = Arrays.stream(arr)
                .boxed().max(Comparator.naturalOrder());
        System.out.println(max.get());

//        first none repeating charactor
        String str = "swiss";
        Optional<Character> first = str.chars().mapToObj(c -> (char) c)
                .filter(c -> str.indexOf(c) == str.lastIndexOf(c))
                .findFirst();

//        sum of no in a list
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        int sum = numbers.stream().mapToInt(Integer::intValue).sum();

//        group strings by length
        List<String> words = Arrays.asList("Java", "Stream", "API", "Code", "Fun");
        Map<Integer, List<String>> collect = words.stream().collect(Collectors.groupingBy(String::length));

        List<List<Integer>> listOfLists = Arrays.asList(
                Arrays.asList(1, 2, 3),
                Arrays.asList(4, 5),
                Arrays.asList(6, 7, 8, 9)
        );

        List<Integer> collect1 = listOfLists.stream().flatMap(list -> list.stream()).collect(Collectors.toList());

//        concait strings
        List<String> wordss = Arrays.asList("Stream", "API", "is", "powerful");
        String collect2 = wordss.stream().collect(Collectors.joining(" ", " ", " "));
        System.out.println(collect2);

//        max length
        List<String> wordsss= Arrays.asList("Java", "Stream", "API", "Development");
        wordsss.stream().max(Comparator.comparingInt(e -> e.length()));

        Optional<String> max1 = wordsss.stream().max(Comparator.comparingInt(String::length));

        List<Integer> numberss = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        Map<Boolean, List<Integer>> partitioned = numberss.stream().collect(Collectors.partitioningBy(n -> n % 2 == 0));
        System.out.println(partitioned);


    }
}
