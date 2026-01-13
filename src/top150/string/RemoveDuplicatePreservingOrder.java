package top150.string;

import java.util.LinkedHashSet;
import java.util.stream.Collectors;

public class RemoveDuplicatePreservingOrder {

    static String removeDuplicates(String str){
        StringBuilder builder = new StringBuilder();
        LinkedHashSet<Character> set = new LinkedHashSet<>();

        for (int i=0;i<str.length();i++){
           set.add(str.charAt(i));
        }
        System.out.println(set);
        return set.stream().map(String::valueOf).collect(Collectors.joining());
    }

    static String removeDuplicates2(String str){
        int length = str.length();
        StringBuilder builder = new StringBuilder();

        for (int i=0;i<length;i++){
            char character = str.charAt(i);
            int currentIdx = str.indexOf(character);
            if (currentIdx!= -1 && currentIdx==i ){
                builder.append(character);
            }
        }
        return builder.toString();
    }

    static String removeDuplicates3(String str){
        int n = str.length();
        StringBuilder builder = new StringBuilder();
        for (int i=0;i<n;i++){
            char character = str.charAt(i);
            int index = str.indexOf(character);
            if (index!=-1 && index ==i){
                builder.append(character);
            }
        }
        return builder.toString();
    }

    public static void main(String[] args) {
//        Example: Input: "programming", Output: "progamin".
        System.out.println(removeDuplicates3("programming"));
    }
}
