package top150.arraystrings;

import java.util.Arrays;

public class LengthOfTheLastWord {

    public static int lengthOfLastWord(String s) {
        int len = 0;
        String[] split = s.split("\\s");
        String lastword = split[split.length-1];

        String s2 = "Nasser Khan";
        String[] split2 = s2.split("\\s");
        System.out.println(Arrays.toString(split2));
        System.out.println(split2[split2.length-1].length());
        return lastword.length();
    }
    public static void main(String[] args) {
        String str = "Hello World";
        System.out.println("LENGTH OF THE LAST WORD IS : "+lengthOfLastWord(str));
    }
}
