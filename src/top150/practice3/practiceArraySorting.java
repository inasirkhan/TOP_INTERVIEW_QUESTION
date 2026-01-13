package top150.practice3;

import java.util.Arrays;

public class practiceArraySorting {

    public static void bubbleSort(int[] arr){
        int n = arr.length;
        for(int i=0;i<n-1;i++){
            for (int j=0;j<n-i-1;j++){
                if (arr[j]>arr[j+1]){
                    swapElement(arr, j, j+1);
                }
            }
        }
    }

    public static void selectionSort(int[] arr){
        int n = arr.length;
        int smallest;
        for(int i=0;i<n-1;i++){
            smallest = i;
            for (int j=i+1;j<n;j++){
                if (arr[smallest]>arr[j]){
                    smallest=j;
                }
            }
            swapElement(arr, i,smallest);
        }
    }


    public static void insertionSort(int[] arr){
        int n = arr.length;
        int current= 0;
        for(int i=1;i<n;i++){
            current= arr[i];
            int j = i-1;
            while(j>=0 && current<arr[j]){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = current;
        }
    }

    private static void swapElement(int[] arr, int i, int j) {
        int temp;
        temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        int[] arr = {5, 3, 8, 1, 2};
        System.out.println(Arrays.toString(arr));
//        bubbleSort(arr);
//        selectionSort(arr);
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
