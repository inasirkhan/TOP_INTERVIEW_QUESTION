package top150.deqode.intuit.concept;

class F{

}
class B extends F{

    public void doSomething() throws Exception{
        System.out.println("B class method");
    }
}
public class CheckExpFromChild {

    public static void main(String[] args) throws Exception {
//        F b = new B();  compile time error as F does not contain that method, not present in a
        B b = new B();
        b.doSomething();
//        C.main();
        CheckExpFromChild.main(null);
//        CheckExpFromChild.main(34,null); can overload the main method
    }

}
class C extends CheckExpFromChild{

    public static void main(String ...args){
        System.out.println("override main method");
    }
}
