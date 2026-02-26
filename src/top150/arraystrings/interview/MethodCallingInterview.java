package top150.arraystrings.interview;

class A{
    public void doSomething(float a){
        System.out.println("int called");
    }

    public void doSomething(Double a){
        System.out.println("string called");
    }
}

public class MethodCallingInterview {
    public static void main(String[] args) {
        A a = new A();
        a.doSomething(null);
//        String is more specific than Object.
    }
}
