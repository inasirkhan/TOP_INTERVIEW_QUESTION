package top150.deqode.intuit.day2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FilterNumElements {

    public static void main(String[] args) {
        String []array = {"gourav", "1234", "kumar","343"};
        List<String> collect = Arrays.stream(array)
                .filter(str -> str.chars().anyMatch(Character::isDigit))
                .collect(Collectors.toList());
        System.out.println(collect);

        IntStream.rangeClosed(1,100)
                .forEach(System.out::println);

        int[] arr = {4,6,3,5,1};
        int n= arr.length;
//        bubble
//        for (int i=0;i<n-1;i++){
//            for (int j=0;j<n-1-i;j++){
//                if (arr[j]>arr[j+1]){
//                    swapElements(arr,j,j+1);
//                }
//            }
//        }
        System.out.println(Arrays.toString(arr));
//        selection
        int smallest;
//        for (int i=0;i<n-1;i++){
//            smallest = i;
//            for (int j=i+1;j<n;j++){
//                if (arr[smallest]>arr[j]){
//                    smallest = j;
//                }
//            }
//            swapElements(arr, smallest, i);
//        }

//        insertion
        int current;
        for (int i=1;i<n;i++){
            current = arr[i];
            int j= i-1;
            while (j>0 && current<arr[j]){
                arr[j--] = arr[j];

            }
            arr[j+1] = current;
        }

        System.out.println(Arrays.toString(arr));
    }


    public static void swapElements(int[] arr, int start, int end){
        int temp = arr[end];
        arr[end] =arr[start];
        arr[start] = temp;
    }
}