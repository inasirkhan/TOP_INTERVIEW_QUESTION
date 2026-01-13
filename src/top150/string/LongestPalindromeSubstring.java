package top150.string;

public class LongestPalindromeSubstring {

    int resultStart = 0;
    int resultMaxLen = 0;

    public String longestPalindrome(String s) {


        for (int start=0;start<s.length();start++){
            expandRange(s,start, start);
            expandRange(s, start, start+1);
        }
        return s.substring(resultStart,resultStart+resultMaxLen);

    }

    private void expandRange(String s, int begin, int end) {
        while (begin >= 0 && end < s.length() && s.charAt(begin) == s.charAt(end)) {
            begin--;
            end++;
        }

        if (resultMaxLen< end-begin-1){
            resultStart = begin+1;
            resultMaxLen = end-begin-1;
        }
    }

    static boolean isPalindrome(String str, int s, int e){
        char char1 = str.charAt(s);
        char char2 = str.charAt(e);
        while (s<e){
            if (char1!=char2){
                return false;
            }
            s++;
            e--;
        }
        return true;
    }

    public static void main(String[] args) {
//        Example: Input: "babad", Output: "bab" or "aba".
        String str = "abebbebc";

        int maxLen = 0;
        int start = 0;
        int end = 0;
        int n = str.length();
//        System.out.println(isPalindrome(str));
//        System.out.println(isPalindrome("aba"));
//        System.out.println(longestPalindrome("babad"));

        for (int i=0;i<n;i++){
            for (int j=i;j<n;j++){
                if (isPalindrome(str, i, j) && j-i+1> maxLen){
                    maxLen = j-i+1;
                    start = i;
                    end = j;
                }
            }
        }
        System.out.println("Longest Palindrome Substring Is : "+str.substring(start, end+1));

        String ans = new LongestPalindromeSubstring().longestPalindrome("abebbebc");
        System.out.println("Longest Substring "+ans);
    }
}
