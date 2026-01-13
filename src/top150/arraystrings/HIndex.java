package top150.arraystrings;

import java.util.Arrays;

public class HIndex {

    public static int hIndex(int[] citations) {
        int n = citations.length;
        int[] bucket = new int[n+1];
        for(int i=0;i<n;i++){
            if(citations[i]> citations.length){
                bucket[citations.length]++;
            }
            else{
                bucket[citations[i]]++;
            }
        }

        int count = 0;
        for(int i=bucket.length-1;i>=0;i--){
            count+=bucket[i];
            if (count>i){
                return count;
            }
        }
        System.out.println(Arrays.toString(bucket));
        return 0;
    }

    public static void main(String[] args) {
        int[] citiations = {3,0,6,1,5};
        System.out.println(hIndex(citiations));
    }
}
