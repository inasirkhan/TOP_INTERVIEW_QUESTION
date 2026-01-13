package top150.practice4;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class SortMapByValue {

    public static void main(String[] args) {
        HashMap<Character, Integer> map = new HashMap<>();
        map.put('A',3);
        map.put('B',8);
        map.put('C',4);
        map.put('D',1);

       Set<Map.Entry<Character, Integer>> entrySet = map.entrySet();
        LinkedHashMap<Character, Integer> collect = entrySet.stream()
                .sorted(Map.Entry.comparingByValue())
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (a,b) -> a,
                        LinkedHashMap::new
                ));

        System.out.println(collect);
    }
}
