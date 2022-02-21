package Array;

public class StockBuyAndSellProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,5,3,8,12};
		int start=0;
		int end=arr.length-1;
		
		System.out.println(maxProfit(arr,start,end));
		System.out.println(maxProfit1(arr));

	}
	
	public static int maxProfit(int[] arr,int start,int end) {
		if(end<=start) {
			return 0;
		}
		int profit=0;
		for(int i=start;i<=end;i++) {
			for(int j=i+1;j<=end;j++) {
				if(arr[j]>arr[i]) {
					int curr_profit=arr[j]-arr[i]+maxProfit(arr,start,i-1)+maxProfit(arr,j+1,end);
					
					profit=Math.max(profit, curr_profit);
				}
			}
		}
		
		return profit;
	}
	
	
	public static int maxProfit1(int[] arr) {
		int n=arr.length;
		int profit =0;
		for(int i=1;i<n;i++) {
			if(arr[i]>arr[i-1]) {
				profit+=(arr[i]-arr[i-1]);
			}
		}
		return profit;
	}
	

}
