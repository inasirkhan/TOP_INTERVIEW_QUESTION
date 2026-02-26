package top150.deqode.intuit.day4;

import java.util.Arrays;
import java.util.Comparator;

public class SecondMaxNumber {

    public static void main(String[] args) {
        int[] arr = {4,6,2,1,9,3,9};
        Integer i = Arrays.stream(arr)
                .boxed()
                        .sorted(Comparator.reverseOrder())
                                .skip(1)
                                        .findFirst().get();

        System.out.println(i);

        int secondlargest = findSecondlargest(arr);
        System.out.println(secondlargest);
    }

    private static int findSecondlargest(int[] arr) {
        int n = arr.length;
        int temp;
        for (int i=0;i<n-1;i++){
            for (int j=0;j<n-i-1;j++){
                if (arr[j]>arr[j+1]){
                    temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        for (int k = n-1;k>0;k--){
            if (arr[k]!=arr[k-1]){
                return arr[k-1];
            }
        }

        return -1;
    }
}
