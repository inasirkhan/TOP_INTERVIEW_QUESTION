package top150.deqode.day7;

import java.util.stream.IntStream;

public class StringPalindrome {

    public static void main(String[] args) {
        String str = "markram";
        boolean isPalindrome = isPalindrome(str);
        System.out.println(isPalindrome);

//        string palindrome using stream api
        int n = str.length();
        isPalindrome = IntStream.rangeClosed(0, n / 2)
                .allMatch(i -> str.charAt(i) == str.charAt(n - 1 - i));
        System.out.println(isPalindrome);
    }

    private static boolean isPalindrome(String str) {
        int start  = 0;
        int end = str.length()-1;
        while (start<=end){
            if (Character.toLowerCase(str.charAt(start)) != Character.toLowerCase(str.charAt(end))){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

}
