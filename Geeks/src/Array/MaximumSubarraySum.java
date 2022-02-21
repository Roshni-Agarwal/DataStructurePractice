package Array;

public class MaximumSubarraySum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,-2,3,-1,2};
		
		System.out.println(maxSum(arr));
		System.out.println(maxSum1(arr));

	}
	
	public static int maxSum(int[] arr) {
		int n=arr.length;
		int res=arr[0];
		for(int i=0;i<n;i++) {
			int curr=0;
			for(int j=i;j<n;j++) {
				curr=curr+arr[j];
				res=Math.max(res, curr);
			}
			
		}
		return res;
	}
	
	public static int maxSum1(int[] arr) {
		int n=arr.length;
		int res=arr[0];
		int maxSum=arr[0];
		for(int i=1;i<n;i++) {
			maxSum=Math.max(maxSum+arr[i], arr[i]);
			res=Math.max(res, maxSum);
		}
		return res;
		
	}

}
