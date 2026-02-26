package top150.deqode.intuit.day3;

public class CountChars {

    public static void main(String[] args) {
//        Coding - input : aabbbccdaaabb output : a2b3c2d1a3b2 - answered
        String str = "aabbbccdaaabb";
        StringBuilder builder = countCharacters(str);
        System.out.println(builder.toString());

    }

    private static StringBuilder countCharacters(String str) {
        int count = 1;
        int n = str.length();
        StringBuilder builder = new StringBuilder();
        for (int i =0;i<n-1;i++){
            char current = str.charAt(i);
            if (current == str.charAt(i+1)){
                count++;
            }
            else {
                builder.append(current);
                builder.append(count);
                count = 1;
            }
        }
        builder.append(str.charAt(n-1));
        builder.append(count);
        return builder;
    }
}
