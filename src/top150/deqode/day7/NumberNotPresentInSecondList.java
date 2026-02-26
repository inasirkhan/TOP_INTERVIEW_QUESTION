package top150.deqode.day7;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class NumberNotPresentInSecondList {

    public static void main(String[] args) {
        int[] arr = {3,5,4,1};
        int[] arr2 = {5,3,4};
        Integer missing = findMissing(arr, arr2);
        System.out.println(missing);
    }

    private static Integer findMissing(int[] arr, int[] arr2) {
        Set<Integer> list = Arrays.stream(arr).boxed().collect(Collectors.toSet());
        Set<Integer> list2 = Arrays.stream(arr2).boxed().collect(Collectors.toSet());
        for (Integer integer : list) {
            if (!list2.contains(integer)) {
                return integer;
            }
        }
        return -1;
    }
}
