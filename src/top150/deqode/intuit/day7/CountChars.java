package top150.deqode.intuit.day7;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountChars {

    public static void main(String[] args) {
        String str = "Nasser Khan ";
        Map<Character, Long> collect = str.chars().mapToObj(c -> (char) c)
                .filter(c->!Character.isWhitespace(c))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(collect);

        List<String> words = Arrays.asList(
                "tea", "tan", "ate", "nat", "bat", "eat"
        );

        Map<String, List<String>> collect1 = words.stream()
                .collect(Collectors.groupingBy(item -> {
                    char[] charArray = item.toCharArray();
                    Arrays.sort(charArray);
                    return new String(charArray);
                }));

        List<List<String>> list = collect1.entrySet().stream().map(Map.Entry::getValue)
                .toList();
        System.out.println(list);
        System.out.println(collect1);
    }
}
