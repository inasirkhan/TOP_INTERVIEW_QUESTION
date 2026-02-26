package top150.leetCode;

import java.util.Stack;

public class ValidParenthesis {

        public static boolean isValid(String s) {
            Stack<Character> stack = new Stack<>();
            for(int i=0;i<s.length();i++){
                char current = s.charAt(i);
                switch (current){
                    case '{','[','(' -> stack.push(current);
                    case '}' -> { if(stack.isEmpty() || stack.pop()!= '{') return false; }
                    case ']' -> { if(stack.isEmpty() || stack.pop()!= '[') return false;}
                    case ')' -> { if(stack.isEmpty() || stack.pop()!= '(') return false;}
                }
            }

            return stack.isEmpty();
        }

    public static void main(String[] args) {
        String str = "]";
        boolean valid = isValid(str);
        System.out.println(valid);
    }
}
