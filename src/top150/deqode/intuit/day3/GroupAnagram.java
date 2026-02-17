package top150.deqode.intuit;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupAnagram {

    public static void main(String[] args) {
        List<String> list = Arrays.asList("listen", "silent", "enlist","cat", "tac", "act");
        List<List<String>> collect = list.stream()
                .collect(Collectors.groupingBy(item -> {
                    char[] charArray = item.toCharArray();
                    Arrays.sort(charArray);
                    return new String(charArray);
                })).entrySet().stream().map(Map.Entry::getValue)
                .collect(Collectors.toList());

        System.out.println(collect);
    }
}
