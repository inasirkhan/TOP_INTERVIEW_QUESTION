package top150.deqode.intuit.day1;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CommonElementsIntegerList {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(4, 6, 2, 5, 1);
        List<Integer> list2 = Arrays.asList(7, 2, 8, 3, 1);

        Set<Integer> set1 = new HashSet<>(list);
        HashSet<Integer> set2 = new HashSet<>(list2);
        set1.retainAll(set2);
        System.out.println(set1);
    }
}
