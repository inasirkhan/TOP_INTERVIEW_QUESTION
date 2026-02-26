package top150.practice4;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class PrintNumberUsingStream {

    public static void main(String[] args) {
//        numbers from 1 to 100
        IntStream.rangeClosed(1,100).forEach(num-> System.out.print(num+" "));
        System.out.println();
//        all even numbers
        IntStream.rangeClosed(1,100).filter(n->n%2==0).forEach(num-> System.out.print(num+" "));
        System.out.println();
//        prime number from 1 to 100

        IntStream.rangeClosed(1, 100)
                .filter(n -> n > 1 && IntStream.rangeClosed(2, (int) Math.sqrt(n))
                        .allMatch(div -> n % div != 0)).forEach(num-> System.out.print(num+" "));

        System.out.println();
//        odd even number
        int[] arr = {0,4,6,-1,3,9,0,6,1,4};
        Map<Boolean, List<Integer>> collect = Arrays.stream(arr).boxed().collect(Collectors.partitioningBy(n -> n % 2 == 0));
        System.out.println(collect);

//       all zeros on right side
        List<Integer> collect1 = Stream.concat(Arrays.stream(arr).boxed().filter(n -> n != 0), Arrays.stream(arr).boxed().filter(n -> n == 0)).collect(Collectors.toList());
        System.out.println(collect1);
;

        int[] arr2 = {10, 20, 30, 40};
        int second =
                Arrays.stream(arr2).boxed().distinct().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
        System.out.println(second);

    }
}
