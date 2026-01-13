package top150.arraystrings;

public class JumpGame2 {

	 public int jump(int[] nums) {
	        int n = nums.length;
	        int farthest =0;
	        int counter =0;
	        int end=0;//end of every jump
	        for(int idx=0;idx<n-1;idx++){
	           
	        	farthest = Math.max(farthest, idx+nums[idx]);
	        	
	        	
	        	if(idx==end) {
	        		end=farthest;
	        		counter++;
	        	}
	        }
	        return counter;
	    }
}
