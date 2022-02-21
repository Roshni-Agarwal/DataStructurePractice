package Array;

public class Largestele {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {9,10,20,20,8,90};
		int n=arr.length;
		System.out.println(getl(arr,n));
		

	}
	public static int getl(int arr[],int n) {
		int l=0;
		for(int i=0;i<n;i++) {
			if(arr[i]>arr[l]) {
				l=i;
			}
		}
		return l;
			
	}

}
