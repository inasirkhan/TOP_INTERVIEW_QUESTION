package top150.deqode.day7;

public class ReverseNumber {

    public static void main(String[] args) {
        int number = 256;
        int reverseNumber = reverseNumber(number);
        System.out.println(reverseNumber);
    }

    private static int reverseNumber(int number) {
        int rev = 0;
        int t;
        while (number!=0){
            t = number%10;
            rev = rev*10 + t;
            number =number/10;
        }
        return rev;
    }
}
