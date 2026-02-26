package top150.deqode.intuit.day1;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CharacterOccurrence {

    public static void main(String[] args) {
        String str = "NASSER KHANN";
        Map<Character, Long> collect = str.chars().mapToObj(c -> (char) c)
                .filter(c->!Character.isWhitespace(c))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(collect);
        HashMap<Character, Integer> characterIntegerHashMap = countOccurrence(str);
        System.out.println(characterIntegerHashMap);
    }

    private static HashMap<Character, Integer> countOccurrence(String str) {
        HashMap<Character, Integer> map = new HashMap<>();
        char[] charArray = str.toCharArray();
        for (Character c : charArray){
            if (Character.isWhitespace(c)){
                continue;
            }
            map.put(c,map.getOrDefault(c,0)+1);
        }
        return map;
    }
}
