package top150.arraystrings;

import java.util.Arrays;

public class RemoveDuplicateSortedArray {
	
	 public static int removeDuplicates(int[] nums) {
		   int j = 1;
		   for (int i = 1; i < nums.length; i++) {
		       if(nums[i]!=nums[i-1]) {
		    	   nums[j++] = nums[i];
		       }
		    }		  
		   return j;
		    }

	static int  removeDuplicateP(int[] arr){
		 int n = arr.length;
		 int j=1;
		 for (int i=1;i<n;i++){
			 if(arr[i]!=arr[i-1]){
				 arr[j++] = arr[i];
			 }
		 }
		 return j;
	}
	
	public static void main(String[] args) {
		int nums[] = {0,0,1,1,1,2,2,3,3,4};
		System.out.println("Array with duplicates : "+Arrays.toString(nums));
		System.out.println(removeDuplicates(nums));
		System.out.println(Arrays.toString(nums));
		System.out.println(Arrays.toString(Arrays.stream(nums).distinct().toArray()));
	}
}
