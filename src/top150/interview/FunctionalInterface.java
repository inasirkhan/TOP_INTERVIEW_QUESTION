package top150.interview;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class FunctionalInterface {

    public static void main(String[] args) {
        Supplier<Double> supplier = ()-> Math.random()*10;
        System.out.println(supplier.get());

        Predicate<Integer> predicate = num-> num%2==0;
        System.out.println(predicate.test(5));

        Function<Integer, Integer> function = num-> num*5;
        System.out.println(function.apply(5));

        Consumer<String> consumer =  str -> System.out.println(str.toUpperCase());
        consumer.accept("Nasser");

        Predicate<Integer> myPredicate = num-> num%2==0;

    }
}
