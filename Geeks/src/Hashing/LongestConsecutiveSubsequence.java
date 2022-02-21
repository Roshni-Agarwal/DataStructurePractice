package Hashing;

import java.util.Arrays;
import java.util.HashSet;

public class LongestConsecutiveSubsequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr= {2,9,4,3,10};
		System.out.println(longestSub(arr));
		System.out.println(longestSub1(arr));

	}
	
	public static int longestSub(int[] arr) {
		
		Arrays.sort(arr);
		int res=1;
		int curr=1;
		
		for(int i=1;i<arr.length;i++) {
			if(arr[i]==arr[i-1]+1) {
				curr++;
			}
				else if(arr[i]!=arr[i-1]) {
					res=Math.max(res, curr);
					curr=1;
				}
			}
		return Math.max(res, curr);
	
	}
	
	public static int longestSub1(int[] arr) {
		HashSet<Integer> s=new HashSet<>();
		int res=1;
		for(int i=0;i<arr.length;i++) {
			s.add(arr[i]);
		}
		for(int x:s) {
			if(s.contains(x-1)==false) {
				int curr=1;
				while(s.contains(x+curr)) {
					curr++;
				}
				res=Math.max(res,curr);
			}
		}
		return res;
		
	}

}
