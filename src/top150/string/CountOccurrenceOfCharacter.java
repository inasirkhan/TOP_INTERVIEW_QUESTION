package top150.string;

public class CountOccurrenceOfCharacter {

    static int countOccurrence(String str, char character){
        int count = 0;
        for (int i=0;i<str.length();i++){
            if (str.charAt(i)== character){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
//        Example: Input: "banana", Character: 'a', Output: 3.
        System.out.println(countOccurrence("banana",'a'));

    }
}
