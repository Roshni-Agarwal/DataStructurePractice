package Array;

public class PrefixSumTechnique1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {2,8,3,9,6,5,4};
		
		System.out.println(prefixSum(arr,0,2));
		System.out.println(prefixSum1(arr,0,2));

	}
	
	public static int prefixSum(int[] arr,int l,int r) {
		int sum=0;
		for(int i=l;i<=r;i++) {
			sum=sum+arr[i];
		}
		return sum;
	}
	
	public static int prefixSum1(int[] arr,int l,int r) {
		int n=arr.length;
		int sum;
		int[] prefixSum=new int[n];
		prefixSum[0]=arr[0];
		
		for(int i=1;i<n;i++) {
			prefixSum[i]=prefixSum[i-1]+arr[i];
		}
		
		
		if(l!=0) {
			sum=prefixSum[r]-prefixSum[l-1];
		}
		else {
			sum=prefixSum[r];
		}
		return sum;
		
	}
	
	

}
