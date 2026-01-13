package top150.practice4;

public class FistNoneRepeatingChar {

    public static void main(String[] args) {
        String str = "swiss";
        for (int i=0;i<str.length();i++){
            char current = str.charAt(i);
            if (str.indexOf(current)== str.lastIndexOf(current)){
                System.out.println(current);
                break;
            }
        }

        Character character = str.chars().mapToObj(c -> (char) c).filter(c -> str.indexOf(c) == str.lastIndexOf(c)).findFirst().get();
    }
}
