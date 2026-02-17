package top150.deqode.intuit;

import java.util.HashMap;

public class LSubstringWithoutRepeatingChars {

    public static void longestSubstring(String string){
        int n = string.length();
        int start = 0;
        HashMap<Character,Integer> visitedChars = new HashMap<>();
        int maxLength = 0;
        for (int right=0,left =0;right<n; right++){
            char current = string.charAt(right);
            if (visitedChars.containsKey(current) && visitedChars.get(current)>= left){
                left = visitedChars.get(current)+1;
            }
            visitedChars.put(current,right);
            if (right-left+1>maxLength){
                maxLength = Math.max(maxLength,right-left+1);
                start = left;
            }

        }
        System.out.println("Max Length Substring : "+maxLength);
        String longestSubstring = string.substring(start, start+maxLength);
        System.out.println(longestSubstring);
    }

    public static void main(String[] args) {
        String string = "abcabcudabcbac";
        longestSubstring(string);
    }
}
