package top150.string;

import java.util.Comparator;

public class StringWithOnlyNumerics {

    public static boolean isItNumericString(String str){

        for (int i=0;i<str.length();i++){
            char character = str.charAt(i);
            if (!Character.isDigit(character)){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
//        example "12345" -> true "12c45" -> false
        System.out.println(isItNumericString("12345"));
        System.out.println(isItNumericString("12c45"));
    }
}
