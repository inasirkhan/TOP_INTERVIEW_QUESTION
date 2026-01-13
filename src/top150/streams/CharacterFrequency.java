package top150.streams;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CharacterFrequency {

    public static Map<Character,Integer> charFrequency(String string){
        Map<Character,Integer> charFrequency = new HashMap<>();
        char[] charArray = string.toCharArray();
        for (Character character: charArray){
            charFrequency.put(character,charFrequency.getOrDefault(character, 0)+1);
        }
        return charFrequency;
    }

    public static Map<String, Integer> stringFrequency(List<String> list){
        HashMap<String, Integer> frequency = new HashMap<>();
        for (String word : list){
            frequency.put(word, frequency.getOrDefault(word,0)+1);
        }
        return frequency;
    }


    public static Map<Character, Integer> count(String s) {
        HashMap<Character, Integer> map = new HashMap<>();

        for (char c : s.toCharArray()) {
            char upperCase = Character.toUpperCase(c);
            map.put(upperCase, map.getOrDefault(upperCase, 0) + 1);
        }

        return map;
    }


    public static void main(String[] args) {
        String inputString = "Java Concept Of The Day";
//        System.out.println(charFrequency(inputString));
        System.out.println(count(inputString));
        Map<Character, Long> collect1 = inputString.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(),
                        Collectors.counting()));
//        Map<Character, Long> charFrequancy = inputString.chars()
//                .mapToObj(c->(char)c)
//                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
//        System.out.println(charFrequancy);

        List<String> stationeryList = Arrays.asList("Pen", "Eraser", "Note Book", "Pen", "Pencil", "Stapler", "Note Book", "Pencil");
        System.out.println(stringFrequency(stationeryList));
        Map<String, Long> collect = stationeryList
                .stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

    }
}
