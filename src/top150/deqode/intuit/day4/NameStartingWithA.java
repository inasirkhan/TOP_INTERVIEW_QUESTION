package top150.deqode.intuit.day4;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class NameStartingWithA {

    public static void main(String[] args) {
        List<String> list = Arrays.asList("Amit","Mohit","Rohit","Kartik","Aayush","Arman","Sunil");
        list.stream().filter(name->name.startsWith("A"))
                .forEach(System.out::println);


        IntStream.rangeClosed(1,100)
                .filter(n ->n>1 && IntStream.rangeClosed(2,(int)Math.sqrt(n)).noneMatch(div-> n%div==0))
                .forEach(n-> System.out.print(n+" "));

    }
}
