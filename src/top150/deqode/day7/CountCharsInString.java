package top150.deqode.day7;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountCharsInString {

    public static Map<Character,Integer> CountChars(String str){
        HashMap<Character, Integer> countMap = new HashMap<>();
        char[] charArray = str.toCharArray();
        for (Character current:charArray){
            current = Character.toUpperCase(current);
            countMap.put(current,countMap.getOrDefault(current,0)+1);
        }
        return countMap;
    }

    public static void main(String[] args) {
        String str = "Nasser Khan Solution";
        Map<Character, Integer> countMap = CountChars(str);
        System.out.println(countMap);
        Set<Map.Entry<Character,Integer>> entries = countMap.entrySet();
        for (Map.Entry<Character,Integer> entry : entries){
            System.out.println(entry.getKey()+" : "+entry.getValue());
        }
//        now count with stream api
        Map<Character, Long> countMap2 = str.chars().mapToObj(c -> (char) c).map(Character::toUpperCase)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        System.out.println(countMap2);

        Map<Character, Long> collect = str.chars().mapToObj(c -> (char) c)
                .filter(c->!Character.isWhitespace(c))
                .map(Character::toUpperCase)
                .collect(Collectors.groupingBy(c -> c, Collectors.counting()));

        System.out.println(collect);
    }
}
