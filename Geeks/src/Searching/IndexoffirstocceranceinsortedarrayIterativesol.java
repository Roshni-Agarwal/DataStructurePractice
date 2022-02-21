package Searching;

public class IndexoffirstocceranceinsortedarrayIterativesol {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {5,10,10,20,20};
		int x=20;
		int n=a.length;
		System.out.println(firstOccerance(a,n,x));

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

}
