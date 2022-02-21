package Hashing;

import java.util.HashSet;
import java.util.Set;

public class SubarrayWithGivenSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {5,8,6,13};
		int sum=14;
		System.out.println(isSubArrSum(arr,sum));

	}
	
	public static boolean isSubArrSum(int[] arr,int sum) {
		for(int i=0;i<arr.length;i++) {
			int curr_sum=0;
			for(int j=i;j<arr.length;j++) {
				curr_sum+=arr[j];
				if(curr_sum==sum) {
					return true;
				}
			}
		}
		return false;
	}
	public static boolean isSubArrSum1(int[] arr,int sum) {
		  Set<Integer> h=new HashSet<>();
		  int pre_sum=0;
		  for(int i:arr) {
			  pre_sum+=i;
			  if(pre_sum==sum) {
				  return true;
			  }
			  h.add(pre_sum);
		  }
		  return false;
	}

}
