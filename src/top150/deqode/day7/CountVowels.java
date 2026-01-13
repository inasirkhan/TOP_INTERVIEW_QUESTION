package top150.deqode.day7;

public class CountVowels {

    public static void main(String[] args) {
        String str = "Nasser Khan";
        int vowels = countVowels(str);
        System.out.println(vowels);
    }

    private static int countVowels(String str) {
        int count =0;
        for (int i =0;i<str.length();i++){
            char current = str.charAt(i);
            count+= checkVowel(current) ? 1 : 0;
        }
        return count;
    }

    static boolean checkVowel(char ch){
        char c = Character.toLowerCase(ch);
        return (c == 'a' || c == 'e' || c== 'i' || c == 'o' || c == 'u');
    }
}
