package top150.deqode.intuit.concept;

abstract class Stu{

    void doSomething(){
        System.out.println("do something");
    }

//    can't make abstract final,
//    cause we need to override abstract methods and for that we need to extend this class

    abstract void canDoSomething();
}
public class AbstractFinalConcept {
}
