package top150.interview;
 class SuperClass {

    void doSomething(){
        System.out.println("do something");
    }

}
class SubClass extends SuperClass {

     int a = 4;

     SubClass(){
         this(4);
         System.out.println("const called");
     }

     SubClass(int num){
         System.out.println(num);
     }

     @Override
    void doSomething() {
        System.out.println("child class");
    }
}

public class MethodOverRidding{

    public static void main(String[] args) {
        SuperClass instance = new SubClass();
        instance.doSomething();
    }
}
