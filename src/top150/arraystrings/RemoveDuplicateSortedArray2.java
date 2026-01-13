package top150.arraystrings;

import java.util.Arrays;

public class RemoveDuplicateSortedArray2 {
	
//     remove duplicate but constraint is keep only two duplicates
	 public static int removeDuplicates(int[] nums) {
		   int j = 1;
		   for (int i = 1; i < nums.length; i++) {
		       if(j==1 || (nums[i]!=nums[j-2] || nums[i]!=nums[i-1])) {
		    	   nums[j++] = nums[i];
		       }
		    }		  
		   return j;
		    }

	public static int removeDuplicatesP(int[] nums) {
		int j = 1;
		for (int i = 1; i < nums.length; i++) {
			if (j==1 || nums[i]!= nums[j-2] || nums[i]!=nums[i-1]){
				nums[j++] = nums[i];
			}
		}
		return j;
	}

	public static void remove(int[] arr){
		int n = arr.length;
		int j = 1;
		for(int i=1;i<n;i++){
			if(j == 1 || arr[i]!=arr[j-2]|| (arr[i]!=arr[i-1])){
				arr[j++] = arr[i];
			}
		}
	}
	public static void main(String[] args) {
		int nums[] = {0,0,1,1,1,2,2,3,3,4};
		int arr[] = {4,6,6,7,7,7,2,3,2,2,4,3,7,8};
		System.out.println("Array with duplicates : "+Arrays.toString(arr));
//		System.out.println(removeDuplicatesP(arr));
		remove(arr);
		System.out.println(Arrays.toString(arr));
	}
}
