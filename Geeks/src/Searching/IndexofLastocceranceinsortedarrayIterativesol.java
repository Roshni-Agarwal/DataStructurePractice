package Searching;

public class IndexofLastocceranceinsortedarrayIterativesol {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {5,10,10,20,20};
		int x=10;
		int n=a.length;
		System.out.println(lastOccerance(a,n,x));

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

}
