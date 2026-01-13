package top150.arraystrings;

public class FirstOccuranceInString {

    public static int strStr(String haystack, String needle) {
        return haystack.indexOf(needle);
    }

    public static void main(String[] args) {
       String haystack = "sadbutsad", needle = "sad";
       String haystack2 = "leetcode", needle2 = "leeto";
        System.out.println("FIRST INDEX OF NEEDLE "+needle+" IN STRING "+haystack+ " IS AT IDX : "+strStr(haystack, needle));
        System.out.println("FIRST INDEX OF NEEDLE "+needle2+" IN STRING "+haystack2+ " IS AT IDX : "+strStr(haystack2,needle2));
    }
}
