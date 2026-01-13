package top150.practice3;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

public class InterSectionUnionArray {

    public static int[] findIntersection(int[] arr1, int[] arr2){
        Set<Integer> coll1 = Arrays.stream(arr1).boxed().collect(Collectors.toSet());
        Set<Integer> coll2 = Arrays.stream(arr2).boxed().collect(Collectors.toSet());
        coll1.retainAll(coll2);

        return coll1.stream().mapToInt(Integer::intValue).toArray();
    }

    public static int[] findUnion(int[] arr1,int[] arr2){
        Set<Integer> coll1 = Arrays.stream(arr1).boxed().collect(Collectors.toSet());
        Set<Integer> coll2 = Arrays.stream(arr2).boxed().collect(Collectors.toSet());
        coll1.addAll(coll2);
        return coll1.stream().mapToInt(Integer::intValue).toArray();
    }


    public static void main(String[] args) {
        int[] arr = {3,5,2,6,1};
        int[] arr2 = {7,4,2,6};
//        intersection [2,6]
//        union [1,2,3,4,5,6,7]
        System.out.println(Arrays.toString(findIntersection(arr, arr2)));
        System.out.println(Arrays.toString(findUnion(arr,arr2)));
    }
}
