package top150.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class removeDuplicate {

    public static void main(String[] args) {
        int arr[] = {4,5,6,3,4};

//        solution (1)
        Set<Integer> collect = Arrays.stream(arr).boxed()
                .collect(Collectors.toSet());

//        solution (2)
        List<Integer> collect1 = Arrays.stream(arr).boxed()
                .distinct().collect(Collectors.toList());
        System.out.println(collect1);
        System.out.println(collect);
    }
}
