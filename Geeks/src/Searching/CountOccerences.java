package Searching;

public class CountOccerences {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {10,20,20,20,30,30};
		int x=30;
		int n=arr.length;
		System.out.println(CountOccerence(arr,n,x));

	}
	
	public static int firstOccerance(int[] a,int n,int x) {
		int low=0;
		int high=n-1;
		while(low<=high) {
			int mid=(low+high)/2;
			if(a[mid]>x) {
				high=mid-1;
			}
			else if(a[mid]<x) {
				low=mid+1;
			}
			else {
				if(mid==0 || a[mid-1]!=a[mid]) {
					return mid;
				}
				else {
					high=mid-1;
				}
			}
		}
		return -1;
		
	}
	
	public static int lastOccerance(int[] a,int n,int x) {
		int low=0;
		int high=n-1;
		while(low<=high) {
			int mid=(low+high)/2;
			if(a[mid]>x) {
				high=mid-1;
			}
			else if(a[mid]<x) {
				low=mid+1;
			}
			else {
				if(mid==n-1 || a[mid+1]!=a[mid]) {
					return mid;
				}
				else {
					low=mid+1;
				}
			}
		}
		return -1;
		
	}
	
	
	public static int CountOccerence(int[] arr, int n, int x) {
		int first=firstOccerance(arr,n,x);
		if(first==-1) {
			return 0;
		}
		else {
			return (lastOccerance(arr,n,x)-first+1);
		}
		
		
	}

}
