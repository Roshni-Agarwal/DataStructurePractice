package Searching;

public class BinarysearchIterative {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a= {10,20,30,40,50,60,70};
		int n=a.length;
		int x=60;
		
		System.out.println(bSearch(a,n,x));

	}
	
	public static int bSearch(int[] a,int n,int x) {
		int low=0;
		int high=n-1;
		while(low<=high) {
			int mid=(low+high)/2;
			if(a[mid]==x) {
				return mid;
			}
			else if(a[mid]>x) {
				high=mid-1;
			}
			else if(a[mid]<x) {
				low=mid+1;
			}
		}
		return -1;
	}

}
