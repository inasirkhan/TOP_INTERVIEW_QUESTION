package top150.arraystrings;

public class MaxProfitBuySellStock2 {
	
	public static int maxProfit(int[] prices) {
	      int maxProfit = 0;
		      int i =0;
		      int buyIdx =-1;
		      int selldx =-1;
		      int n = prices.length;
		      while(i<n-1) {
		    	  
		    	  //buy
		    	  while(i<n-1 && prices[i]>prices[i+1]) {
		    		  i++;
		    	  }
						if(i==n-1){
							break;
						}
		    	  buyIdx = i++;
		    	  System.out.println("buyIdx : "+buyIdx);
		    	  //sell
		    	  while(i<=n-1 && prices[i]>prices[i-1]) {
		    		  i++;
		    	  }
		    	  selldx = i-1;
		    	  System.out.println("sellIdx : "+selldx);
		    	  maxProfit+=prices[selldx]-prices[buyIdx];
		      }
		      
			 return maxProfit;
	    }
	
	public static void main(String[] args) {
		int profits[] = {7,1,5,3,6,4};
		System.out.println("MAX PROFIT : "+maxProfit(profits));
	}

}
