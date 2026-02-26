package top150.leetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class PlusOneSolution {
    public static int[] plusOne(int[] digits) {
        int n = digits.length;
       for(int i = n-1;i>=0;i--){
           if (digits[i]== 9){
               digits[i] = 0;
           }
           else {
               digits[i]++;
               return digits;
           }
       }
       digits = new int[n+1];
       digits[0] = 1;
       return digits;
    }


    public static void main(String[] args) {
        int[] arr = {9,8,7,6,5,4,3,2,1,0};
        System.out.println(Arrays.toString(plusOne(arr)));
    }
}