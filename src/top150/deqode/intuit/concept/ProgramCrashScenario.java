package top150.deqode.intuit;

class A{

    public void m1(){
        System.out.println(10/0);
        try{
            System.out.println(10/0);
        }
        catch (ArithmeticException ex){
            System.out.println("catch handled");
        }
        finally {
            System.out.println("finally called");
        }
    }
}

public class ProgramCrashScenario {

    public static void main(String[] args) {
        A a = new A();
        a.m1();
    }
}
