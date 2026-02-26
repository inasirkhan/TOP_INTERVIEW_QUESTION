package top150.deqode.intuit.day5;

public class PrintNumsNoLoop {

//    print 1 to 100 numbers without loops
public static void main(String[] args) {
    int n = 1;
    printNumber(n);
}

    private static void printNumber(int n) {
         if (n>100){
             return;
         }
        System.out.print(n+" ");
        printNumber(n+1);
    }
}
