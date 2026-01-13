package top150.arraystrings;

import java.util.Arrays;

public class ReverseWordsInString {

    public static String reverseWords(String s) {
        StringBuilder builder = new StringBuilder();
//        String[] split = s.split("\\s");
//         \s+ which matches one or more whitespace characters.
//         This will ensure that consecutive whitespace characters are treated as a single delimiter
        String[] split = s.split("\\s+");
        System.out.println(Arrays.toString(split));
        for (int i=split.length-1;i>=0;i--){

            String trim = split[i].trim();
            builder.append(trim);
            builder.append(" ");
        }
        return builder.toString().trim();
    }

    public static String revereString(String str){
        int n = str.length();
        StringBuilder sb = new StringBuilder();
        for(int i=n-1;i>=0;i--){
            sb.append(str.charAt(i));
        }
        return sb.toString();
    }

    public static String revereWords(String str){
        int n = str.length();
        StringBuffer sb = new StringBuffer();
        String[] split = str.split("\\s");
        for(int i=split.length-1;i>=0;i--){
            sb.append(split[i]);
            if (i!=0){
                sb.append(" ");
            }
        }
        return sb.toString();
    }



    public static void main(String[] args) {
        String str =  "the sky is blue";
        String str2 = "a good   example";
//        System.out.println(reverseWords(str));
//        System.out.println(reverseWords(str2));
        StringBuffer reverse = new StringBuffer("Hello").reverse();
        System.out.println(reverse);
//        System.out.println(revereString(str));
        System.out.println(revereWords(str));

        int number = 12345;
        int reversed = 0;

        while (number != 0) {
            int digit = number % 10;      // get last digit
            reversed = reversed * 10 + digit; // append digit
            number = number / 10;         // remove last digit
        }

        System.out.println("Reversed number: " + reversed);
    }
}
