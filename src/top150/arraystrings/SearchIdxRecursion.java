package top150.arraystrings;

public class SearchIdxRecursion {

    public static int findIdx(int[] nums, int start, int value){
        if (start>=nums.length){
            return -1;
        }
        if (nums[start]== value){
            return start;
        }
        return findIdx(nums,start+1, value);
    }
    public static void main(String[] args) {
        int[] nums = {2, 5,7,34,89,11,23};
        int value = 34;
        System.out.println("INDEX OF VALUE "+value+" IS : "+findIdx(nums,0,value));
    }
}
