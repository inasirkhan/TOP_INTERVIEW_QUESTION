package top150.arraystrings;

import java.util.Arrays;

public class ProductExceptSelf {

    public static int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] products = new int[n];
        int[] leftProduct = new int[n], rightProduct = new int[n];

        leftProduct[0] = 1;
        for(int i=1;i<n;i++) {
        	leftProduct[i] = leftProduct[i-1]*nums[i-1];
        }
        System.out.println("LEFT PRODUCT : "+Arrays.toString(leftProduct));
        
        rightProduct[n-1] = 1;
        for (int i = n-2; i > -1; i--) {
			rightProduct[i] = rightProduct[i+1]*nums[i+1];
		}
        System.out.println("RIGHT PRODUCT : "+Arrays.toString(rightProduct));
        
        for (int i = 0; i < n; i++) {
			products[i] = leftProduct[i]*rightProduct[i];
		}
        
        return products;
    }

    public static int[] productExceptSelf2(int[] arr){
        int[] product =  new int[arr.length];
        int n = arr.length;
        int[] leftProduct = new int[n], rightProduct = new int[n];

        leftProduct[0] = 1;
        for (int i=1;i<n;i++){
            leftProduct[i] = leftProduct[i-1]*arr[i-1];
        }
        rightProduct[n-1] = 1;
        for (int i =n-2;i>=0;i--){
            rightProduct[i] = rightProduct[i+1]*arr[i+1];
        }
        System.out.println("left "+Arrays.toString(leftProduct));
        System.out.println("right "+Arrays.toString(rightProduct));
        for (int i=0;i<n;i++){
            product[i] = leftProduct[i]*rightProduct[i];
        }
        return product;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        System.out.println(Arrays.toString(productExceptSelf(arr)));
        System.out.println(Arrays.toString(productExceptSelf2(arr)));
    }


}
