package top150.practice2;

import com.sun.source.doctree.SeeTree;

import java.util.*;
import java.util.stream.Collectors;

public class Test {

    public static void bubbleSort(int[] arr){

        int n = arr.length;

        for (int i=0;i<n-1;i++){

            for (int j =0;j<n-1-i;j++){

                if (arr[j]> arr[j+1]){

                    int temp = 0;
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

     static void removeDuplicates(int[] arr){
        int n = arr.length;
         HashMap<Integer, Integer> map = new HashMap<Integer,Integer>();
         HashSet<Integer> set = new HashSet<>();

         for (int num: arr){
             map.put(num, map.getOrDefault(num, 0)+1);
         }
         System.out.println("count :"+ map);

         for (int num: arr){
             set.add(num);
         }
         System.out.println("remove duplicates : "+set);

     }

     static List<Integer> removeDuplicatesUsingStream(int[] arr){

         return Arrays.stream(arr).boxed()
                .distinct()
                .collect(Collectors.toList());
     }

    public static void main(String[] args) {
      int[] arr =   {1,3,5,6,7,8,4,3,1,8};
        bubbleSort(arr);
        System.out.println(removeDuplicatesUsingStream(arr));
        System.out.println(Arrays.toString(arr));
        removeDuplicates(arr);


    }
}
