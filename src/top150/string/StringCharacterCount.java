package top150.string;

public class StringCharacterCount {

    public static String getStringCharCount(String input){
        StringBuilder res = new StringBuilder();
        int count =1;
        for (int i=0;i<input.length()-1;i++){

            char character = input.charAt(i);
            if(character != input.charAt(i+1)){
                res.append(character);
                res.append(count);
                count=1;
            }
            else{
                count++;
            }
        }
        res.append(input.charAt(input.length() - 1)).append(count);

        return res.toString();
    }

    static String charCount(String str){
        int n = str.length();
        StringBuilder builder = new StringBuilder();
        int count=1;
        for (int i=1;i<n;i++){
            char character = str.charAt(i);
            if (character!=str.charAt(i-1)){
                builder.append(character);
                builder.append(count);
                count=1;
            }
            else{
                count++;
            }
        }
        return builder.toString();
    }

    public static void main(String[] args) {
        String input  = "aabcccccaaa";
//        output a2b1c5a3
        System.out.println(getStringCharCount(input));
    }
}
