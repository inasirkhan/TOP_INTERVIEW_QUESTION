package top150.interview;

public class IsPalindrome {

    public static void main(String[] args) {
         Boolean isPalidrome = isPalin("abcbad");
        System.out.println(isPalidrome);
    }

    private static Boolean isPalin(String str) {
        int start = 0;
        int end = str.length()-1;
        while (start<end){
             if (str.charAt(start) != str.charAt(end)){
                 return false;
             }
             start++;
             end--;
        }
        return true;
    }
}
