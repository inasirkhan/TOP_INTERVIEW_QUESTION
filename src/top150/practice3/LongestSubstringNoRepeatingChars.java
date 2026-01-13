package top150.practice3;

import java.util.HashMap;

public class LongestSubstringNoRepeatingChars {

    public static int longestSubstring(String str){
        int n= str.length();
        int maxLength=0;
        StringBuilder builder = new StringBuilder();
        HashMap<Character, Integer> visitedChars = new HashMap<>();

        for (int right = 0 , left = 0; right <n; right++){
            char currentChar = str.charAt(right);
            if (visitedChars.containsKey(currentChar) && visitedChars.get(currentChar)>=left){
                left = visitedChars.get(currentChar)+1;
            }
            maxLength = Math.max(maxLength, right-left+1);
            visitedChars.put(currentChar,right);
            String substring = str.substring(left, right);
            System.out.println(substring);
        }

        return  maxLength;
    }

    public static void main(String[] args) {
        String str = "ABDABCD";
        System.out.println(longestSubstring(str));
    }
}
