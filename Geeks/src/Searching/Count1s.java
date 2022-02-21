package Searching;

public class Count1s {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {0,0};
		int n=arr.length;
		System.out.println(countOnes(arr,n));

	}
	public static int countOnes(int[] arr,int n) {
		int low=0;
		int high=n-1;
		while(low<=high) {
			int mid=(low+high)/2;
			if(arr[mid]==0) {
				low=mid+1;
			}
			else {
				if(mid==0 || arr[mid-1]==0) {
					return (n-mid);
				}
				else {
					high=mid-1;
				}
			}
		}
		return 0;
	}

}
