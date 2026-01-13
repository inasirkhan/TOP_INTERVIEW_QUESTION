package top150.twopointer;

public class isSubsequence {

    public static boolean isSubsequence(String s, String t) {
        int idx = 0;
        for (int i=0;i<s.length();i++){
            idx = t.indexOf(s.charAt(i), idx);
            if (idx==-1) return false;
            idx++;
        }
        return true;
    }

    static boolean isSub(String string , String sequence){
        int n = string.length();
        int idx =0;
        for (int i=0;i<n;i++){
           idx =  string.indexOf(sequence.charAt(i), idx);
           if (idx == -1) return false;
           idx++;
        }
        return false;
    }
    public static void main(String[] args) {
        String t = "ahbgdc";
        String s = "acb";
        String s1 = "aaaaaa";
        String t1 = "bbaaaa";
        System.out.println(isSubsequence(s,t));
        System.out.println(isSubsequence(s1,t1));
        System.out.println(isSub(t, s));
    }
}
