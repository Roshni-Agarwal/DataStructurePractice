package Array;

public class CheckEquilibriumSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  int arr[] = {3, 4, 8, -9, 20, 6};

	       System.out.println(checkEquilibrium(arr));
	       System.out.println(checkEquilibrium1(arr));

	}
	
	
	public static boolean checkEquilibrium(int[] arr) {
		int n=arr.length;
		
		for(int i=0;i<n;i++) {
			int lsum=0;
			int rsum=0;
			for(int j=0;j<i;j++) {
				lsum+=arr[j];
			}
			for(int k=i+1;k<n;k++) {
				rsum+=arr[k];
			}
			if(lsum==rsum) {
				return true;
			}
		}
		return false;
	}
	
	public static boolean checkEquilibrium1(int[] arr) {
		int n=arr.length;
		int sum = 0;

    	for(int i = 0; i < n; i++)
    	{
    		sum += arr[i];
    	}

    	int l_sum = 0;

    	for(int i = 0; i < n; i++)
    	{
    		if(l_sum == sum - arr[i])
    			return true;

    		l_sum += arr[i];

    		sum -= arr[i];
    	}

    	return false;
	}

}
