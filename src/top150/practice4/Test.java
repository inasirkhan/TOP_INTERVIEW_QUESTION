package top150.practice4;

public class Test {

    public static void main(String[] args) {
        System.out.println(0.2 == 0.1*2);
        System.out.println(0.1*2);
        System.out.println(0.3 == 0.1*3);
        System.out.println(0.1*3);

        Integer n1 = 10;
        Integer n2 = 10;
        System.out.println(n1 == n2);
//        true
//        In Java, the class Integer maintains an internal cache for values:
//        -128 to 127

        Integer n3 = 2000;
        Integer n4 = 2000;
        System.out.println(n3 == n4);
    }
}
