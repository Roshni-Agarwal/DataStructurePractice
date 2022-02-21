package Sorting;

public class Efficientsoltosorttwosortedarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {10,20,50};
		int[] b= {5,50,50};
		merge(a,b);
	}
	
	public static void merge(int[] a,int[] b) {
		int n=a.length;
		int m=b.length;
		int i=0,j=0;
		
		while(i<m && j<n) {
			if(a[i]<b[j]) {
				System.out.println(a[i]);
				i++;
			}
			else {
				System.out.println(b[j]);
				j++;
			}
		}
		while(i<m) {
			System.out.println(a[i]);
			i++;
		}
		while(j<n) {
			System.out.println(b[j]);
			j++;
		}
		
	}

}
