package Map;

import java.util.HashSet;

public class FindSumOfNre {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {10,45,9,10,2,12,45,10,10};
		int n=arr.length;
		System.out.println(sumOfEle(arr,n));

	}
	
	public static int sumOfEle(int[] arr,int n) {
		
		HashSet<Integer> set=new HashSet<>();
		int sum=0;
		for(int i=0;i<n;i++) {
			if(!set.contains(arr[i])) {
				sum=sum+arr[i];
				set.add(arr[i]);
			}
		}
		return sum;
	}

}
