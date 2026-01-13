package top150.practice4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindDuplicateInList {

    public static int[] findDuplicates(int[] arr){
        int n=arr.length;
        Arrays.sort(arr);
        ArrayList<Integer> res = new ArrayList<>();
        int j=1;
        for (int i=1;i<n;i++){
            if (arr[i] == arr[i-1]) {
                res.add(arr[i]);
            }
        }
        return res.stream().mapToInt(Integer::intValue).toArray();
    }

    public static int[] removeDuplicates(int[] arr){
        int n=arr.length;
        Arrays.sort(arr);
        int j=1;
        for (int i=1;i<n;i++){
            if (arr[i] != arr[i-1]) {
                arr[j++] = arr[i];
            }
        }
        return Arrays.copyOf(arr, j);
    }

    public static void main(String[] args) {
        int[] arr = {3,4,7,2,3,1,4};
        System.out.println(Arrays.toString(findDuplicates(arr)));
        System.out.println(Arrays.toString(removeDuplicates(arr)));
        Map<Integer, Long> collect = Arrays.stream(arr).boxed().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(collect);
    }
}
