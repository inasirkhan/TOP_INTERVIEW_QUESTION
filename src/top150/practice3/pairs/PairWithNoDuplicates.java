package top150.practice3.pairs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class PairWithNoDuplicates {

    public static void main(String[] args) {
        int[] arr = {3,5,2,2,4,1,6,-1,5};
        int[][] pairs = pairsWithNoDuplicates(arr, 6);
        for(int[] pair : pairs){
            System.out.println(Arrays.toString(pair));
        }
    }

    private static int[][] pairsWithNoDuplicates(int[] arr, int key) {
        int n = arr.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        ArrayList<int[]> pairs = new ArrayList<>();
        for (int i=0;i<n-1;i++){
            if (map.containsKey(key-arr[i])){
                pairs.add(new int[]{key-arr[i], arr[i]});
                if (map.get(key-arr[i])==1){
                    map.remove(key-arr[i]);
                }
                else {
                    map.put(key-arr[i], map.get(key-arr[i]-1));
                }
            }
            map.put(arr[i], map.getOrDefault(arr[i], 0)+1);
        }
        return pairs.toArray(new int[pairs.size()][]);
    }
}
