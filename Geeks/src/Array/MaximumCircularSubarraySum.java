package Array;

public class MaximumCircularSubarraySum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {5,-2,3,4};
		
		System.out.println(maxCircularSum(arr));
		System.out.println(overallMaxSum(arr));

	}
	
	public static int maxCircularSum(int[] arr) {
		int n=arr.length;
		int res=arr[0];
		
		for(int i=0;i<n;i++) {
			int curr_max=arr[i];
			int curr_sum=arr[i];
			
			for(int j=1;j<n;j++) {
				int index=(i+j)%n;
				curr_sum+=arr[index];
				curr_max=Math.max(curr_max, curr_sum);
			}
			res=Math.max(res, curr_max);
		}
		return res;
	}
	
	static int normalMaxSum(int[] arr) {
		int n=arr.length;
		int res=arr[0];
		int maxEnding=arr[0];
		
		for(int i=1;i<n;i++) {
			maxEnding=Math.max(arr[i], maxEnding+arr[i]);
			res=Math.max(res, maxEnding);
		}
		
		return res;
		
	}
	
	 static int overallMaxSum(int arr[])
	    {
		 int n=arr.length;
	    	int max_normal = normalMaxSum(arr);

	    	if(max_normal < 0)
	    		return max_normal;

	    	int arr_sum = 0;

	    	for(int i = 0; i < n; i++)
	    	{
	    		arr_sum += arr[i];

	    		arr[i] = -arr[i];
	    	}

	    	int max_circular = arr_sum + normalMaxSum(arr);

	    	return Math.max(max_circular, max_normal);
	    }

}
