package top150.deqode.intuit.day2;

import java.util.stream.IntStream;

public class PrintFirst50PrimeNumbers {

    public static void main(String[] args) {
        IntStream.rangeClosed(1,100)
                .filter(n-> n>1 && IntStream.rangeClosed(2, (int)Math.sqrt(n))
                        .allMatch(div-> n%div !=0))
                .forEach(num -> System.out.print(num+" "));

    }
}
