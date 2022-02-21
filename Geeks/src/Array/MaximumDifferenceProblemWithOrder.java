package Array;

public class MaximumDifferenceProblemWithOrder {

	
	//maximum value of arr[j]-arr[i] such that j>i
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {2,3,10,6,4,8,1};
		
		System.out.println(maxDiff(arr));
		System.out.println(maxDiff1(arr));

	}
	
	public static int maxDiff(int[] arr) {
		int n=arr.length;
		int res=arr[1]-arr[0];
		
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<n;j++) {
				res=Math.max(res,arr[j]-arr[i]);
			}
		}
		return res;
	}
	
	public static int maxDiff1(int[] arr) {
		int n=arr.length;
		int res=arr[1]-arr[0];
		int minVal=arr[0];
		
		for(int j=1;j<n;j++) {
			res=Math.max(res, arr[j]-minVal);
			minVal=Math.min(minVal, arr[j]);
		}
		
		return res;
	}

}
