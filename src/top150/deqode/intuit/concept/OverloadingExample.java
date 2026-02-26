package top150.deqode.intuit.concept;

import top150.interview.Test;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class OverloadingExample {

    public static void doSomething(Object o){
        System.out.println("object");
    }

    public static void doSomething(Exception o){
        System.out.println("exception");
    }

    public static void doSomething(ArithmeticException o){
        System.out.println("arthmatic");
    }



    public static void main(String[] args) {
        doSomething(null);
        String str1 = "nasser";
        String str2 = "ressan";
        String st1 = Stream.of(str1.split("")).map(String::toUpperCase).sorted().collect(Collectors.joining());
        String st2 = Stream.of(str1.split("")).map(String::toUpperCase).sorted().collect(Collectors.joining());
        System.out.println(st1.equals(st2));
    }
}
