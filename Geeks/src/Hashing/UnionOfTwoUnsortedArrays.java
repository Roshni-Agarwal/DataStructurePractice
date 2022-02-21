package Hashing;

import java.util.*;

public class UnionOfTwoUnsortedArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {10,30,10,40};
		int[] b= {40,5,10,15};
		System.out.println(union(a,b));

	}
	public static int union(int[] a,int[] b) {
		Set<Integer> s=new HashSet<>();
		for(int i:a) {
			s.add(i);
		}
		for(int i:b) {
			s.add(i);
		}
		return s.size();
	}

}
