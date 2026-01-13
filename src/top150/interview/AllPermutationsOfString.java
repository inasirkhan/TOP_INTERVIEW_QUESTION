package top150.interview;

public class AllPermutationsOfString {

    public static void printAllPermutations(String str, String permutation){
        if (str.isEmpty()){
            System.out.println(permutation);
            return;
        }
        for (int i=0;i<str.length();i++){
            char character = str.charAt(i);
            String remaining = str.substring(0, i) + str.substring(i + 1);
            printAllPermutations(remaining, permutation+character );
        }
    }

    public static void main(String[] args) {
        printAllPermutations("ABC","");
    }
}
