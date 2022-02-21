package Sorting;

import java.util.Arrays;

public class Naivesoltosorttwosortedarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {10,15,20,20};
		int[] b= {1,12};
		
		merge(a,b);

	}
	
	public static void merge(int[] a, int[] b) {
		int m=a.length;
		int n=b.length;
		int[] c=new int[m+n];
		
		for(int i=0;i<m;i++) {
			c[i]=a[i];
		}
		for(int i=0;i<n;i++) {
			c[m+i]=b[i];
		}
		Arrays.sort(c);
		
		for(int i=0;i<m+n;i++) {
			System.out.println(c[i]);
		}
	}

}
