package Assignment;

import java.util.HashSet;

public class FindBetweenNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {0,1,5,8,14,18,44,81,89,99,102};
		int n1=10;
		int n2=20;
		System.out.println(findcount(arr,n1,n2));

	}
	
	public static int findcount(int[] arr,int n1,int n2) {
		HashSet<Integer> h=new HashSet<>();
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>=n1 && arr[i]<=n2) {
				h.add(arr[i]);
			}
		}
		return h.size();
		
	}

}
