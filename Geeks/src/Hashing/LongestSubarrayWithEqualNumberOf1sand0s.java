package Hashing;

import java.util.HashMap;

public class LongestSubarrayWithEqualNumberOf1sand0s {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,0,0,1,0,1,1};
		System.out.println(longestSub(arr));
		System.out.println(longestSub1(arr));

	}
	
	public static int longestSub(int[] arr) {
		int n=arr.length;
		int res=0;
		for(int i=0;i<n;i++) {
			int c0=0;
			int c1=0;
			for(int j=i;j<n;j++) {
				if(arr[j]==0) {
					c0++;
				}
				if(arr[j]==1) {
					c1++;
				}
				if(c0==c1) {
					res=Math.max(res,c0+c1);
				}
			}
		}
		return res;
	}
	
	public static int longestSub1(int[] arr) {
		HashMap<Integer,Integer> hm=new HashMap<Integer,Integer>();
		int n=arr.length;
		int sum = 0, maxLen = 0;
        for(int i = 0; i < n; i++)
         arr[i] = (arr[i] == 0) ? -1 : 1;
         
        for(int i = 0; i < n; i++)
        {
            sum += arr[i];
            if (sum == 0)
             maxLen = i+1;
             
            if(hm.containsKey(sum + n) == true)
            {
                if(maxLen < i - hm.get(sum + n))
                 maxLen = i - hm.get(sum + n);
                
            }else hm.put(sum + n, i);
        }
        return maxLen;
		
	}

}
