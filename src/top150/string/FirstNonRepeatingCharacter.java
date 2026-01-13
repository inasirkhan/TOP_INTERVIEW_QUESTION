package top150.string;

public class FirstNonRepeatingCharacter {

    static Character getFirstNoneRepeatingChar(String str){

        for (int i=0;i<str.length();i++){
            char character = str.charAt(i);
            if (str.indexOf(character, i+1)== -1){
                return  character;
            }
        }
        return null;
    }

    static Character getfirstNonRep(String str){
        int n = str.length();
        for (int i=0;i<n;i++){
            char character = str.charAt(i);
            if (str.indexOf(character, i+1)== -1){
                return character;
            }
        }
        return null;
    }

    public static void main(String[] args) {
//        Example: Input: "swiss", Output: "w".
        System.out.println(getFirstNoneRepeatingChar("swiss"));
        String s = "swiss";
        for (int i=0;i<s.length();i++){
            char character = s.charAt(i);
            if (s.indexOf(character,i+1)==-1){

            }
        }
    }
}
