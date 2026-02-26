package top150.deqode.intuit.concept;

@FunctionalInterface
interface one {

    void doSomething();
}

@FunctionalInterface
interface two extends one{

//    ✅ When CAN a functional interface extend another one?
//
//            👉 Only if the total number of abstract methods remains ONE.
}

public class FuctionalInterFaceExtendAnother {


}
