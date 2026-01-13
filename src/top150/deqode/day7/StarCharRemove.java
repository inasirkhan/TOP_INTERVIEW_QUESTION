package top150.deqode.day7;

import java.util.ArrayDeque;
import java.util.Stack;
import java.util.stream.Collectors;

public class StarCharRemove {

    public static String removeStars(String str){
        Stack<Character> stack = new Stack<>();
        for(int i=0;i<str.length();i++){
            char current = str.charAt(i);
            if (current=='*'){
                stack.pop();
            }
            else {
                stack.add(current);
            }
        }
        return stack.stream().map(String::valueOf).collect(Collectors.joining());
    }

    public static void main(String[] args) {
        String str = "abcdh**fg*h";
        System.out.println(removeStars(str));
    }
}
