package top150.leetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class PluseOnesolution {
    public static int[] plusOne(int[] digits) {
        String res = "";
        for(int i=0;i<digits.length;i++){
            res+=digits[i];
        }
        Integer num = Integer.parseInt(res);
        System.out.println(num);
        num++;
        System.out.println(num);
        List<Integer> list = new ArrayList<Integer>();
        while(num>0){
            int last = num%10;
            list.add(last);
            num = num/10;
        }
        Collections.reverse(list);
        return list.stream().mapToInt(Integer::intValue).toArray();
    }


    public static void main(String[] args) {
        int[] arr = {9,8,7,6,5,4,3,2,1,0};
        System.out.println(Arrays.toString(plusOne(arr)));
    }
}