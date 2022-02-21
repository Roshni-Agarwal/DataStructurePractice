package Hashing;

import java.util.Arrays;
import java.util.HashSet;

public class CountDistinctElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {10,20,10,20,30};
		System.out.println(countDist(arr));
		System.out.println(countDistinct(arr));
		Integer[] arr1= {10,10,10};
		int n=countDistinct1(arr1);
		System.out.println(n);

	}
	
	public static int countDist(int arr[]) {
		int res=0;
		int n=arr.length;
		
		for(int i=0;i<n;i++) {
			boolean flag=false;
			for(int j=0;j<i;j++) {
				if(arr[i]==arr[j]) {
					flag=true;
					break;
				}
			}
			
			if(flag==false) {
				res++;
			}
		}
		return res;
	}
	
	public static int countDistinct(int[] arr) {
		HashSet<Integer> s=new HashSet<Integer>();
		for(int i=0;i<arr.length;i++) {
			s.add(arr[i]);
			
		}
		return s.size();
	}
	
	public static int countDistinct1(Integer arr[]) {
		HashSet<Integer> s=new HashSet<>(Arrays.asList(arr));
				return s.size();
	}

}
