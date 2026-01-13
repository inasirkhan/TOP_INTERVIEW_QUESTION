package top150.arraystrings;

import java.util.Arrays;

public class RotateArray {

	 public static void rotate(int[] nums, int k) {
		 int len = nums.length-1;
		 reverse(nums, 0, len);
		 reverse(nums, 0, k-1);
		 reverse(nums, k, len);
		}
	 
	 public static void reverse(int nums[], int start, int end) {
		 int temp =0;
		 while(start<end) {
			 temp = nums[start];
			 nums[start] = nums[end];
			 nums[end] = temp;
			 start++;
			 end--;
			 
		 }
	 }

	 
	 public static void main(String[] args) {
		int nums[] = {1,2,3,4,5,6,7};
		 System.out.println(Arrays.toString(nums));
//		reverse(nums, 0, nums.length-1);
		System.out.println(Arrays.toString(nums));
//		7, 6, 5,4,3,2,1

		int k = 3;
//		System.out.println("BEFORE REVERSE : "+Arrays.toString(nums));
//		reverse(nums, 0, nums.length-1);
//		System.out.println("AFTER REVERSE : "+Arrays.toString(nums));
//		System.out.println("BEFORE ROTATE : "+Arrays.toString(nums));
//		rotate(nums, k);
//		System.out.println("AFTER ROTATE : "+Arrays.toString(nums));
//		System.out.println(k%=2);

		 rotate(nums, k);
		 System.out.println(Arrays.toString(nums));
		
	}
}
