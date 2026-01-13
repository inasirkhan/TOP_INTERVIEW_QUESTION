package top150.practice3;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Stream;

public class FindSecondLargest {

    public static void main(String[] args) {
        int[] arr = {5,8,3,2,8,1};
        System.out.println(findSecondLargest(arr));
        System.out.println(Arrays.stream(arr).boxed().distinct().sorted(Comparator.reverseOrder())
                .skip(1).findFirst().get());

    }

    private static int findSecondLargest(int[] arr) {
        int n = arr.length;
        int temp;
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-1-i;j++){
                if (arr[j]>arr[j+1]){
                    temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
        for (int j= n-1;j>0;j--){
            if (arr[j]!=arr[j-1]){
                return arr[j-1];
            }
        }
        return -1;
    }
}
