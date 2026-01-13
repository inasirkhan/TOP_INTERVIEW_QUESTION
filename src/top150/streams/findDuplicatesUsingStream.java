package top150.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class findDuplicatesUsingStream {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 2, 5, 3, 6);
        Map<Integer, Long> duplicatesMap = list.stream().collect(Collectors.groupingBy(n -> n, Collectors.counting()));
        System.out.println(duplicatesMap);
        Set<Integer> duplicates = duplicatesMap.entrySet().stream().filter(map -> map.getValue() > 1)
                .map(Map.Entry::getKey)
                .collect(Collectors.toSet());
        System.out.println(duplicates);

    }
}
