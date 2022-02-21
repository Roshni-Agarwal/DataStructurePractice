package Searching;

public class IndexofLastocceranceinsortedarrayrecursivesol {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {5,10,10,15,20,20,20};
		int x=10;
		int n=a.length;
		int low=0;
		int high=n;
		System.out.println(lastOccerance(a,low,high,x,n));

	}
	public static int lastOccerance(int[] a,int low,int high,int x,int n) {
		if(low>high) {
			return -1;
			
		}
		int mid=(low+high)/2;
		if(a[mid]>x) {
			return lastOccerance(a, low, mid-1, x,n);
		}
		else if(a[mid]<x) {
			return lastOccerance(a, mid+1, high, x,n);
		}
		else { if(mid==n-1 || a[mid+1] != a[mid]) 
				return mid;
			
			
		else return lastOccerance(a, mid+1, high, x,n);
		}
	}

}
