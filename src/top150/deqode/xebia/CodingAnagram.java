package top150.deqode.xebia;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CodingAnagram {

    public static void main(String[] args) {
       String[] arr = {"abcd", "java", "dcba", "ajav", "xyz", "epam", "pame", "aepm"};
//        output = abcd, java, xyz, epam
        Map<String, List<String>> collect = Arrays.stream(arr)
                .collect(Collectors.groupingBy(key -> {
                    char[] charArray = key.toCharArray();
                    Arrays.sort(charArray);
                    return new String(charArray);
                }));
        System.out.println(collect);
        List<String> list = collect.values().stream().map(l->l.get(0))
                .toList();
        System.out.println(list);
    }
}
