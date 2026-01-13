package top150.arraystrings;

import java.util.Arrays;

public class MaxProfitBuySellStock {
	
	  public static int maxProfit(int[] prices) {
		  int max = prices[prices.length-1];
	        int[] maxPro = new int[prices.length];
	        int n= prices.length-1;
	        for(int i=prices.length-1;i>=0;i--){
				max = Math.max(prices[i], max);
				maxPro[n--] = max;
			}
	        System.out.println(Arrays.toString(maxPro));
	        int maxProfilt =0;
	        for(int i=0;i<prices.length;i++) {
	        	maxProfilt = Math.max(maxProfilt, maxPro[i]-prices[i] );
	        }
	        return maxProfilt;
	    }

		static int maxProPractice(int[] arr){
		  int n = arr.length-1;
			int[] maxProfitArr = new int[arr.length];
			maxProfitArr[n] = arr[n];
		  for (int i=n-2;i>=0;i--){
			  maxProfitArr[i] = Math.max(maxProfitArr[n+1],arr[i]);
		  }

			System.out.println(Arrays.toString(maxProfitArr));
			int maxProfit =0;
		  for (int i=0;i<arr.length;i++){
			  maxProfit = Math.max(maxProfit, maxProfitArr[i]-arr[i]);
		  }
		  return maxProfit;
		}

		public static int maxProfit2(int[] profit){
		  int n = profit.length;
		  int[] maxProfitArray = new int[n];
		  maxProfitArray[n-1] = profit[n-1];
		  for (int i =n-2;i>=0;i--){
			  System.out.println(maxProfitArray[i+1]);
			  maxProfitArray[i] = Math.max(profit[i], maxProfitArray[i+1]);
		  }
			System.out.println(Arrays.toString(maxProfitArray));

		  int maxProfit = 0;
		  for (int i=0;i<n-1;i++){
			  maxProfit = Math.max(maxProfit, maxProfitArray[i]-profit[i]);
		  }
		  return maxProfit;
		}

	public static int maxProfilt(int[] profits){
		int n = profits.length;
		int max = 0;
		int[] maxProfilts = new int[n];
		maxProfilts[n-1] = profits[n-1];
		for(int i= n-2;i>=0;i--){
			maxProfilts[i] = Math.max(maxProfilts[i+1], profits[i]);
		}

		for(int i=0;i<n;i++){
			max = Math.max(max,maxProfilts[i]-profits[i]);

		}
		return max;

	}
	
	public static void main(String[] args) {
		int profits[] = {7,1,5,3,6,4};
		System.out.println(Arrays.toString(profits));
		System.out.println("MAX PROFIT : "+maxProfit(profits));

		int i = maxProfit2(profits);
		System.out.println(i);
		System.out.println(Arrays.toString(profits));
		System.out.println(maxProfilt(profits));
	}

}
