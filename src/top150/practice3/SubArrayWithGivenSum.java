package top150.practice3;

import java.util.HashMap;

public class SubArrayWithGivenSum {

    public  static int SubArrayWithGivenSum(int[] arr, int sum) {
        int start = 0, end = 0, maxLength = Integer.MAX_VALUE, current = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            current += arr[i];
            if (current == sum) {
                end = i;
                System.out.println("start : "+start+"  end : "+end);
                maxLength = Math.min(maxLength, end - start + 1);
            }
            if (map.containsKey(current-sum)) {
                start = map.get(current-sum)+1;
                end = i;
                System.out.println("start : "+start+"  end : "+end);
                maxLength = Math.min(maxLength, end - start + 1);
            }
            map.put(current, i);
        }
        return maxLength;
    }

    public static void main(String[] args) {
        int[] arr = { 5, 3, 8, 3, 10 };
        System.out.println(SubArrayWithGivenSum(arr, 11));
    }
}
