package top150.practice2;

import java.lang.reflect.Array;
import java.util.Arrays;

public class SecondLargestFind {

    public static int secondLargest(int arr[]){
        Arrays.sort(arr);
        return arr[arr.length-2];
    }

    public static int secondLargestWithDuplicates(int arr[]){
        int temp = 0;
        for (int i=0;i<arr.length;i++){
            for (int j=i+1;j<arr.length;j++){
                if (arr[i]>arr[j]){
                    temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
        for (int i=arr.length-2;i>=0;i--){
            if (arr[arr.length-1]>arr[i]){
                return arr[i];
            }
        }
        return -1;
    }

    public static int findSecondLargest(int[] arr){
        Integer largest = Integer.MIN_VALUE;
        Integer secondLargest = Integer.MIN_VALUE;

        for(int num : arr){
            if (num>largest){
                secondLargest = largest;
                largest = num;
            }
            else if(num>secondLargest && num<largest){
                secondLargest = num;
            }
        }
        return  secondLargest;
    }

    public static void main(String[] args) {
        int arr[] = {4,5,7,3,2};
        int arr2[] = {4,6,6,7,3,2,7};
        System.out.println(secondLargest(arr));
        System.out.println(secondLargestWithDuplicates(arr2));
        System.out.println(findSecondLargest(arr2));
    }
}
