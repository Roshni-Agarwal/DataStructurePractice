package Array;

public class RemoveDuplicatesFromASortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {10,20,20,30,30,30};
		int n=6;
		 System.out.println("Before Removal");

	       for(int i = 0; i < arr.length; i++)
	       {
	       		System.out.print(arr[i]+" ");
	       }

	       System.out.println();

		
	       n = remDups(arr, n);

	       System.out.println("After Removal");

	       for(int i = 0; i < n; i++)
	       {
	       		System.out.print(arr[i]+" ");
	       }
	       
	       System.out.println();

			
	       n = remDups1(arr, n);

	       System.out.println("After Removal");

	       for(int i = 0; i < n; i++)
	       {
	       		System.out.print(arr[i]+" ");
	       }

	}
	
	 static int remDups(int arr[], int n)
	    {
	    	int temp[] = new int[n];

	    	temp[0] = arr[0];

	    	int res = 1;

	    	for(int i = 1; i < n; i++)
	    	{
	    		if(temp[res - 1] != arr[i])
	    		{
	    			temp[res] = arr[i];
	    			res++;
	    		}
	    	}

	    	for(int i = 0; i < res; i++)
	    	{
	    		arr[i] = temp[i];
	    	}

	    	return res;
	    }
	
	public static int remDups1(int[] arr,int n) {
		int res=1;
		for(int i=1;i<n;i++) {
			if(arr[res-1]!=arr[i]) {
				arr[res]=arr[i];
				res++;
			}
		}
		return res;
		
	}
	
	
	

}
