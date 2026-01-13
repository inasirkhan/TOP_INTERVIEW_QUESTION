package top150.deqode.day7;

import java.util.Set;
import java.util.stream.Collectors;

public class CommonCharsInStrings {

    public static void main(String[] args) {
        String str1 = "Nasser";
        String str2 = "Nass";
        Set<Character> commonChars = findCommonChars(str1, str2);
        System.out.println(commonChars);
    }

    private static Set<Character> findCommonChars(String str1, String str2) {
        return str1.chars().mapToObj(c -> (char) c)
                .filter(character -> str2.indexOf(character) != -1)
                .collect(Collectors.toSet());
    }
}
