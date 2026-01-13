package top150.interview;

public class MethodOverLoading {

    void doSomething(){
        System.out.println("do something");
    }


    public static void main(String[] args) {
        ChildClass childClass = new ChildClass();
        childClass.doSomething();
    }
}
class ChildClass extends MethodOverLoading {

    void doSomething(int a) {
        System.out.println(a);
    }
}
