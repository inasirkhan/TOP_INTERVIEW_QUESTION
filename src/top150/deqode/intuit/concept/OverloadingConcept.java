package top150.deqode.intuit.concept;

class AA{
    void doSomething(Integer a, int b){
        System.out.println("a class ");
    }
}
class BB extends AA{

    void doSomething(int b,Integer a){
        System.out.println("b class");
    }
}
public class OverloadingConcept {

    public static void main(String[] args) {
        BB b = new BB();
        b.doSomething(null,5);


        for (int i =1;i<=5;i++){

            for (int k=0;k<5-i;k++){
                System.out.print(" ");
            }

            for (int j = 0;j<i;j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}
