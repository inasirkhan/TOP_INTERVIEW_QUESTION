package top150.deqode.intuit.day7;

public class TryCatchEx {

    public static int getValue(){
        try{
            int x = 100;
            int y = 0;
            int divide = x / y; // divide the two numbers
            return divide;
        } catch (Exception e) {
            System.out.println("error");
            return -1;
        } finally {
            System.out.println("finally");
            return 0;
        }
    }

    public static void main(String[] args) {
        System.out.println(getValue());
    }
}
