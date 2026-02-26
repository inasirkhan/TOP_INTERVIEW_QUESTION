package top150.deqode.day7;

import java.util.HashMap;

public class Longest {

    public static int longest(String str){
        int n = str.length();
        int max = 0;
        int start =0;
        HashMap<Character, Integer> visited = new HashMap<>();
        for (int right=0,left=0;right<n;right++){
            char current = str.charAt(right);
            if (visited.containsKey(current) && visited.get(current)>=left){
                left = visited.get(current)+1;
            }
            visited.put(current,right);
            if (right-left+1>max){
                max = Math.max(max, right-left+1);
                start = left;
            }
        }
        System.out.println(str.substring(start,start+max));
        return max;
    }

    public static void main(String[] args) {
        String str = "abcededgde";
        System.out.println(longest(str));
    }
}
