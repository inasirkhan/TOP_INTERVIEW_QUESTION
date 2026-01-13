package top150.arraystrings;

public class JumpGame {

	 public static boolean canJump(int[] nums) {
	     int n = nums.length;
	     if(n==1) return true;
	     int jump =0;
	     
	     for(int idx=0;idx<n-1 && jump>=idx ;idx++) {
	    	 
	    	 jump = Math.max(jump, idx+nums[idx]);
	    	 if(jump>=n-1) return true;
	     }
		 
		 return false;
	    }

		static boolean canJumpPrac(int[] arr){
		 int n = arr.length;
		 int jump =0;
		 if (n==1) return true;
		 for (int i = 0; i<n-1 && jump>=i; i++){
			 jump = Math.max(jump, i+arr[i]);
			 if (jump>=n-1) return true;
		 }
		 return false;
		}

	
	public static void main(String[] args) {
		int[] arr = {2,3,1,1,4};
		int[] arr2 = {2,2,0,1,4,0,1};
		int[] arr3 = {0,1};
		System.out.println(canJump(arr2));
	}
}
