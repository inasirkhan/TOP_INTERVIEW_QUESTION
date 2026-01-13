package top150.practice2;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

public class RemoveDuplicatesFromArray {

    public static int[] removeDuplicates(int[] arr){
        int n = arr.length;
        Arrays.sort(arr);
        int j=0;
        for (int i=1;i<n;i++){
            if (arr[i]!=arr[i-1]){
                arr[j++]= arr[i];
            }
        }
        return Arrays.copyOf(arr, j);
    }

    public static Integer[] removeDuplicates2(int[] arr){
        Set<Integer> list = Arrays.stream(arr).boxed().collect(Collectors.toSet());
        return  list.toArray(new Integer[list.size()]);
    }


    public static void main(String[] args) {
        int arr[] = {4,6,6,7,3,2,7,8};
        System.out.println(Arrays.toString(removeDuplicates(arr)));
        System.out.println(Arrays.toString(removeDuplicates2(arr)));
    }
}
