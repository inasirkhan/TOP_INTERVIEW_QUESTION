package top150.deqode.intuit;

public class BinarySearch {

    public static int findElement(int[] arr, int key){
        int n = arr.length;
        int start = 0;
        int end = n-1;
        while (start<=end){
            int mid = start+(end-start)/2;
            if (arr[mid] == key){
                return mid;
            }
            else if (key > arr[mid]){
                start = mid+1;
            }
            else {
                end = mid-1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {4,6,0,2,3,7};
        System.out.println(findElement(arr,3));
    }
}
