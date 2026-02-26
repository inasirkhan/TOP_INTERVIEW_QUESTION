package top150.leetCode;

public class test {

    public static void main(String[] args) {
        int s = 5;
        printNum(s);

    }

    private static void printNum(int s) {

        System.out.println(7/0);
        try
        {
            s = s/0;
        }
        catch (ArithmeticException e){
            System.out.println("arthmatic");
        }
        finally {
            System.out.println("finally");
        }
    }
}
