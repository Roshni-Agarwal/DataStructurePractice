package Hashing;

import java.util.HashMap;

public class LongestSubarrayWithGivenSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {5,2,3,4};
		int sum=5;
		System.out.println(maxLen(arr,sum));
		System.out.println(maxLen1(arr,sum));

	}
	
	public static int maxLen(int[] arr,int sum) {
		int res=0;
		for(int i=0;i<arr.length;i++) {
			int curr_sum=0;
			for(int j=i;j<arr.length;j++) {
				curr_sum+=arr[j];
				if(sum==curr_sum) {
					res=Math.max(res,(j-i)+1);
				}
			}
		}
		return res;
	}
	
	public static int maxLen1(int[] arr,int sum) {
		int pre_sum=0;
		int res=0;
		HashMap<Integer,Integer> h=new HashMap<>();
		for(int i=0;i<arr.length;i++) {
			pre_sum+=arr[i];
			
			if(pre_sum==sum) {
				res=i+1;
			}
			if(h.containsKey(pre_sum)==false) {
				h.put(pre_sum,i);
			}
			if(h.containsKey(pre_sum-sum)) {
				res=Math.max(res, i-h.get(pre_sum-sum));
			}
		}
		return res;
	}

}
