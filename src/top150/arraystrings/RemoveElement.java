package top150.arraystrings;

import java.util.Arrays;

public class RemoveElement {
	

	 public static int removeElement(int[] nums, int val) {
			int j=0;
			for(int i=0;i<nums.length;i++) {
				if(nums[i]!=val) {
					nums[j++] = nums[i];
				}
			}
			return j;
	}

	static int removeElementP(int[] arr, int val){
		 int n = arr.length;
		 int j=0;
		 for (int i=0;i<n;i++){
			 if (arr[i]!=val){
				 arr[j++] = arr[i];
			 }
		 }
		 return j;
	}
	
	public static void main(String[] args) {
		int[] arr = {3,2,2,1};
		System.out.println(removeElementP(arr, 3));
		System.out.println(Arrays.toString(arr));
	}

}
