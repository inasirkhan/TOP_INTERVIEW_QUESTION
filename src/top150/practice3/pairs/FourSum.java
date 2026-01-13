package top150.practice3.pairs;

import java.util.ArrayList;
import java.util.Arrays;

public class FourSum {

    public static void main(String[] args) {
        int arr[] = {1,0,-1,0,-2,2};
        int[][] pairs = fourSum(arr, 0);
        for(int[] pair : pairs){
            System.out.println(Arrays.toString(pair));
        }
    }

    private static int[][] fourSum(int[] arr, int key) {
        int n = arr.length;
        int left, right;
        Arrays.sort(arr);
        ArrayList<int[]> pairs = new ArrayList<>();

        for (int i=0;i<n-3;i++){

            if (i!=0 && arr[i]== arr[i-1]){
                continue;
            }

            for (int j=i+1;j<n-2;j++){

                if (j!=i+1 && arr[j]== arr[j-1]){
                    continue;
                }

                left = j+1;
                right = n-1;
                while (left<right){
                    if (arr[left]+arr[right]+arr[j]+arr[i]==key){
                        pairs.add(new int[]{arr[left], arr[right],arr[j], arr[i]});
                        left++;
                        right--;
                        while (left<right-1 && arr[left]== arr[left-1]){
                            left++;
                        }
                        while (right>0 && arr[right]== arr[right+1]){
                            right--;
                        }
                    } else if (arr[left]+arr[right]+arr[j]+arr[i]<key) {
                        left++;
                    }
                    else {
                        right--;
                    }
                }
            }
        }
        return pairs.toArray(new int[pairs.size()][]);
    }
}
