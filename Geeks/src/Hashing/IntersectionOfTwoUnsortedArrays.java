package Hashing;

import java.util.*;

public class IntersectionOfTwoUnsortedArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {10,20,10,30,20};
		int[] b= {20,10,10,40};
		System.out.println(intersection(a,b));
		System.out.println(intersection1(a,b));

	}
	public static int intersection(int[] a,int[] b) {
		int m=a.length;
		int n=b.length;
		int res=0;
		for(int i=0;i<m;i++) {
			boolean flag= false;
			for(int j=0;j<i;j++) {
				if(a[i]==a[j]) {
					flag=true;
					break;
				}
			}
			if(flag==true) {
				continue;
			}
			for(int j=0;j<n;j++) {
				if(a[i]==b[j]) {
					res++;
					break;
				}
			}
		}
		
		return res;
	}
	
	public static int intersection1(int[] a,int[] b) {
		int res=0;
		Set<Integer> s=new HashSet<>();
		for(int i:a) {
			s.add(i);
		}
		for(int i:b) {
			if(s.contains(i)) {
				res++;
				s.remove(i);
			}
		}
		
		return res;
	}

}
