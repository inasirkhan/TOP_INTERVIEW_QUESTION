package top150.arraystrings;

import java.util.Arrays;

public class LongestCommonPrefix {

    public static String longestCommonPrefix(String[] strs) {
        StringBuilder builder = new StringBuilder();
        Arrays.sort(strs);

        System.out.println(Arrays.toString(strs));
        char[] first = strs[0].toCharArray();
        char[] last = strs[strs.length - 1].toCharArray();

        for (int i=0;i<Math.min(first.length, last.length);i++){
            if (first[i]!=last[i])
                return builder.toString();
            builder.append(first[i]);
        }
        return builder.toString();
    }

    public static String longestCommanPrefix(String[] arr){
        Arrays.sort(arr);
        int n = arr.length;
        String first = arr[0];
        String last = arr[n-1];
        StringBuilder stringBuilder = new StringBuilder();

        for (int i=0;i<Math.min(first.length(), last.length());i++){
            if (first.charAt(i)!=last.charAt(i)){
                return  stringBuilder.toString();
            }
            stringBuilder.append(first.charAt(i));
        }

        return null;
    }

    public static String longestCommonPrefixNotPad(String[] elm) {
        Arrays.sort(elm);
        StringBuilder sb = new StringBuilder();
        char[] first = elm[0].toCharArray();
        char[] last = elm[elm.length - 1].toCharArray();

        for (int i = 0; i < Math.min(first.length, last.length); i++) {
            if (first[i] != last[i]) {
                sb.append(first[i]);
            }
            return sb.toString();
        }
        return null;
    }
    public static void main(String[] args) {
        String[] strs= {"flower","flow","flight"};
        System.out.println("LONGEST COMMON PREFIX IS : "+longestCommonPrefix(strs));
        String s = longestCommanPrefix(strs);
        System.out.println(s);
        String s1 = longestCommonPrefixNotPad(strs);
        System.out.println(s1);

    }
}
