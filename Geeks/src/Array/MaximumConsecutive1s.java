package Array;

public class MaximumConsecutive1s {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {0,1,1,1,0,1,1};
		System.out.println(maxConsecutiveOnes(arr));
		System.out.println(maxConsecutiveOnes1(arr));

	}
	
	public static int maxConsecutiveOnes(int[] arr) {
		int n=arr.length;
		int res = 0;

    	for(int i = 0; i < n; i++)
    	{
    		int curr = 0;

    		for(int j = i; j < n; j++)
    		{
    			if(arr[j] == 1) curr++;
    			else break;
    		}

    		res = Math.max(res, curr);
    	}
    	
    	return res;
	}
	
	
	public static int maxConsecutiveOnes1(int[] arr) {
		int n=arr.length;
		int res=0;
		int curr=0;
		
		for(int i=0;i<n;i++) {
			if(arr[i]==0) {
				curr=0;
			}
			else {
				curr++;
				res=Math.max(res, curr);
			}
		}
		return res;
	}

}
