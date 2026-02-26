package top150.deqode.intuit.concept;

@FunctionalInterface
interface test{

    static void print1(){
        System.out.println("static");
    }
    default void print2(){
        System.out.println("default");
    }
    void print();
}
public class FunctionalInterfaceScenrio{

    public static void main(String[] args) {
        test.print1();
        test t = () -> System.out.println("concrete");
        t.print2();
        t.print();
    }
}
