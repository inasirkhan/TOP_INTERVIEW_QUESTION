package top150.deqode.intuit.day5;

import java.security.spec.RSAOtherPrimeInfo;
import java.util.Arrays;

public class LongestPalindromeSubstring {

    public static String longestPalindrome(String s) {
        int max = 0;
        int start = 0;
        int end = 0;
        for(int i=0;i<s.length();i++){
            for(int j=i;j<s.length();j++){
                if(isPalindrome(s,i, j)== true){
                    if(j-i+1> max){
                        max = j-i+1;
                        start = i;
                        end = j;
                    }
                }
            }
        }
        return s.substring(start, end+1);
    }

    public static boolean isPalindrome(String s,int start,int end){
        StringBuilder builder = new StringBuilder();
        while(start<end){
            if(s.charAt(start) != s.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    public static void printAllSubs(String str){
        for (int i = 0;i<str.length();i++){

            for (int j = i;j<str.length();j++){

                for (int k=i;k<=j;k++){
                    System.out.print(str.charAt(k));
                }
                System.out.println();
            }
        }
    }

    public static void main(String[] args) {

        printAllSubs(
                "abc"
        );

        String s = longestPalindrome("adyenmarkram");
        System.out.println(s);
        Integer a = null;
//        int b = a;
//        int c = b+a;
//        System.out.println(a.toString());
        System.out.println(a);
        System.out.println(exceptionTest());

    }

    public static int  exceptionTest(){
        try{
            int x = 100;
            int y = 10;
            int divide = x / y; // divide the two numbers
//            System.exit(-1);
            return divide;
        } catch (Exception e) {
            System.out.println("error");
            return -1;
        } finally {
            System.out.println("finally");
            return 0;
        }

    }
}

