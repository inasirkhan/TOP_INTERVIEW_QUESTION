package top150.deqode.intuit.day6;

import java.util.*;
import java.util.stream.Collectors;

public class GroupStringsOnLength {

    public static void main(String[] args) {
        String[] words = {"abc","bc","b","bcd","abcr","a"};
        String[] words2 = {"a","ab","abc","d","cd","bcd","abcd"};
        System.out.println(groupStrings(words));
        System.out.println(maxProduct(words2));
    }

    private static int groupStrings(String[] words) {
        HashMap<String,Long> map = new HashMap<>();
        Map<Integer, Long> collect = Arrays.stream(words)
                .collect(Collectors.groupingBy(String::length,Collectors.counting()));

        System.out.println(collect);
        int max = 0;
        for (Map.Entry<Integer, Long> set: collect.entrySet()){
            if (set.getValue() == 2){
                Integer key = set.getKey();
                if (key>max){
                    max = key;
                }
            }
        }
        return max*max;
    }

    public static int maxProduct(String[] words) {

            int n = words.length;
            boolean[][] seen = new boolean[n][26];

            // Step 1: Mark letters present in each word
            for(int i = 0; i < n; i++) {
                for(char c : words[i].toCharArray()) {
                    seen[i][c - 'a'] = true;
                }
            }

            int max = 0;

        for (int i = 0; i < seen.length; i++) {
            System.out.println(Arrays.toString(seen[i]));
        }

            // Step 2: Compare every pair
            for(int i = 0; i < n; i++) {
                for(int j = i + 1; j < n; j++) {

                    boolean common = false;

                    // check 26 letters
                    for(int k = 0; k < 26; k++) {
                        if(seen[i][k] && seen[j][k]) {
                            common = true;
                            break;
                        }
                    }

                    // if no common letter
                    if(!common) {
                        int product = words[i].length() * words[j].length();
                        max = Math.max(max, product);
                    }
                }
            }

            return max;
        }
    }
