package Searching;

public class Indexoffirstocceranceinsortedarraynaivesol {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a= {5,10,10,15,15};
		int x=15;
		int n=a.length;
		System.out.println(firstOccerance(a,n,x));

	}
	public static int firstOccerance(int[] a,int n,int x) {
		for(int i=0;i<n;i++) {
			if(a[i]==x) {
				return i;
			}
		}
		return -1;
	}

}
