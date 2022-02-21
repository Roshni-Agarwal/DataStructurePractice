package Searching;

public class Indexoffirstocceranceinsortedarrayrecursivesol {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {5,10,10,15,20,20,20};
		int x=20;
		int n=a.length;
		int low=0;
		int high=n;
		System.out.println(firstOccerance(a,low,high,x));


	}
	
	public static int firstOccerance(int[] a,int low,int high, int x) {
    if(low>high) {
			return -1;
			
		}
		int mid=(low+high)/2;
		if(a[mid]>x) {
			return firstOccerance(a, low, mid-1, x);
		}
		else if(a[mid]<x) {
			return firstOccerance(a, mid+1, high, x);
		}
		else { if(mid==0 || a[mid-1] != a[mid]) 
				return mid;
			
			
		else return firstOccerance(a, low, mid-1, x);
		}
		
	}

}
