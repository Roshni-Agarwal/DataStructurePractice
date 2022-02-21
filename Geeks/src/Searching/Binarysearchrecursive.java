package Searching;

public class Binarysearchrecursive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//hight of binary tree is celling of logn
		int[] a= {10,20,30,40,50,60,70};
		int low=0;
		int high=a.length-1;
		int x=110;
		System.out.println(bSearchr(a,low,high,x));

	}
	
	public static int bSearchr(int[] a,int low, int high,int x) {
		int mid=(low+high)/2;
		if(low>high) {
			return -1;
		}
		if(a[mid]==x) {
			return mid;
		}
		else if(a[mid]>x) {
			return bSearchr(a, low, mid-1, x);
		}
		else {
			return bSearchr(a, mid+1, high, x);
		}
		
	}

}
