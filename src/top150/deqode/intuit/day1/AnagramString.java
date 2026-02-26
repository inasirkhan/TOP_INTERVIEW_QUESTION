package top150.deqode.intuit.day1;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class AnagramString {

    public static void main(String[] args) {
        String s1 = "RaceCar";
        String s2 = "CarRace";
        List<String> words = Arrays.asList(
                "tea", "tan", "ate", "nat", "bat", "eat");
//      group anagrams

        boolean anagram = isAnagram(s1, s2);
        System.out.println(anagram);
        groupAnagrams(words);
    }

    public static void groupAnagrams(List<String> list){
        HashMap<String,List<String>> map = new HashMap<>();
        for (String current : list){
            char[] charArray = current.toCharArray();
            Arrays.sort(charArray);
            String key = new String(charArray);
            map.computeIfAbsent(key,k->new ArrayList<>()).add(current);
        }
        System.out.println(map);

        Map<String, List<String>> collect = list.stream().collect(Collectors.groupingBy(word -> {
            char[] charArray = word.toCharArray();
            Arrays.sort(charArray);
            return new String(charArray);
        }));
        System.out.println(collect);
    }

    private static boolean isAnagram(String s1, String s2) {
        return Stream.of(s1.split(""))
                .map(String::toUpperCase)
                .sorted()
                .collect(Collectors.joining()).equals(Stream.of(s2.split(""))
                .map(String::toUpperCase)
                .sorted()
                .collect(Collectors.joining()));
    }
}
