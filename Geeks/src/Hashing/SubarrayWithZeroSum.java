package Hashing;

import java.util.HashSet;

public class SubarrayWithZeroSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {0,4,2,1};
		System.out.println(isOSubarray(arr));
		System.out.println(isOSubarray1(arr));

	}
	
	public static boolean isOSubarray(int[] arr) {
		int n=arr.length;
		for(int i=0;i<n;i++) {
			int curr_sum=0;
			
			for(int j=i;j<n;j++) {
				curr_sum+=arr[j];
				if(curr_sum==0) {
					return true;
				}
			}
		}
		return false;
	}
	
	public static boolean isOSubarray1(int[] arr) {
		HashSet<Integer> s=new HashSet<>();
		int pre_sum=0;
		for(int i=0;i<arr.length;i++) {
			pre_sum+=arr[i];
			if(s.contains(pre_sum)) {
				return true;
			}
			if(pre_sum==0) {
				return true;
			}
			s.add(pre_sum);
		}
		return false;
	}

}
