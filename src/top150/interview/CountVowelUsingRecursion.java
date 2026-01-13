package top150.interview;

public class CountVowelUsingRecursion {

    static boolean isVowel(Character charc){
        char character = Character.toLowerCase(charc);
        return (character == 'a' || character == 'e' || character == 'i' || character == 'o' || character == 'u');
    }

    static int countVowel(String string, int index){
        if (index == string.length()){
            return 0;
        }

        int count = isVowel(string.charAt(index))?1:0;

        return count + countVowel(string, index+1);
    }

    public static int countVowel2(String str){
        int n = str.length();
        int count =0;
        for (int i=0;i<n;i++){
            if (isVowel(str.charAt(i))){
                count++;
            }
        }
        return count;
    }


    public static void main(String[] args) {
        String str = "My name is nasser oberoi khan";
        System.out.println(countVowel(str, 0));
        System.out.println(countVowel2(str));
    }
}
