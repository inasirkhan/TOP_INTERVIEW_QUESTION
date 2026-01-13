package top150.string;

public class StringReverseWithoutBuildInFunction {

    static String reverseString(String str){
        StringBuilder builder = new StringBuilder();
        for (int i=str.length()-1;i>=0;i--){
             builder.append(str.charAt(i));
        }
        return  builder.toString();
    }

    public static void main(String[] args) {
//        Example: Input: "hello", Output: "olleh".
        System.out.println(reverseString("hello"));
    }
}
