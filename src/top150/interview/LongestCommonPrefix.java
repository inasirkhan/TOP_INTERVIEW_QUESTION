package top150.interview;

import java.util.Arrays;

public class LongestCommonPrefix {

    static String longestCommonPrefix(String[] arr){
        Arrays.sort(arr);
        StringBuilder builder = new StringBuilder();
        int n = arr.length;
        char[] first = arr[0].toCharArray();
        int firstLength = first.length;
        char[] last = arr[n - 1].toCharArray();
        int lastLength = last.length;
        for (int i=0;i<(Math.min(firstLength,lastLength));i++){
            if (first[i]!=last[i]){
                return builder.toString();
            }
            builder.append(first[i]);
        }
        return builder.toString();
    }
    

    public static void main(String[] args) {
// input ["flower", "flow", flight"] output fl
        String[] arr = {"flower","flow", "flight"};
        System.out.println(longestCommonPrefix(arr));
    }
}
