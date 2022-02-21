package Hashing;

import java.util.HashSet;
import java.util.Set;

public class PairWithGivenSumInUnsortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {8,4,3,9};
		int sum=13;
		System.out.println(isPair(arr,sum));
		System.out.println(isPair1(arr,sum));

	}
	
	public static boolean isPair(int[] arr, int sum) {
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]+arr[j]==sum) {
					return true;
				}
			}
			
		}
		return false;
	}
	
	public static boolean isPair1(int[] arr,int sum) {
		Set<Integer> s=new HashSet<>();
		for(int i:arr) {
			if(s.contains(sum-i)) {
				return true;
			}
			else {
				s.add(i);
			}
			
		}
		return false;
	}

}
