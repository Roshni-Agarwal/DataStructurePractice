package Array;

public class SlidingWindowTechnique {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,8,30,-5,20,7};
		int k=3;
		
		System.out.println(maxSum(arr,k));
		System.out.println(maxSum1(arr,k));
		int arr1[] = {15, 2, 4, 8, 9, 5, 10, 23}; 
		int sum = 23; 
		System.out.println(maxSum2(arr1,sum));
	}
	
	public static int maxSum(int[] arr,int k) {
		int max_sum=0;
		int n=arr.length;
		for(int i=0;i+k-1<n;i++) {
			int sum=0;
			for(int j=0;j<k;j++) {
				sum+=arr[i+j];
			}
			max_sum=Math.max(max_sum, sum);
			
		}
		return max_sum;
	}
	
	public static int maxSum1(int[] arr,int k) {
		int n=arr.length;
		int curr_sum=0;
		for(int i=0;i<k;i++) {
			curr_sum+=arr[i];
		}
			int max_sum=curr_sum;
			for(int j=k;j<n;j++) {
				curr_sum+=(arr[j]-arr[j-k]);
				max_sum=Math.max(max_sum, curr_sum);
			}
		return max_sum;
		
	}
	public static int maxSum2(int[] arr,int sum) {
		int n=arr.length;
		int curr_sum=arr[0];
		int start=0;
		for(int i=1;i<n;i++) {
			//clear the previous window
			while(curr_sum>sum && start<i-1) {
				curr_sum-=arr[start];
				start++;
				
			}
			if(curr_sum==sum) {
				return sum;
			}
			if(i<n) {
				curr_sum+=arr[i];
				
			}
			
		}
		return 0;
	}

}
