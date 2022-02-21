package Strings;

import java.util.Arrays;

public class LeftmostRepeatingCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1="cabbad";
		System.out.println(leftMost(s1));
		System.out.println(leftMost1(s1));
		System.out.println(leftMost2(s1));

	}
	public static int leftMost(String s1) {
		for(int i=0;i<s1.length();i++) {
			for(int j=i+1;j<s1.length();j++) {
				if(s1.charAt(i)==s1.charAt(j)) {
					return i;
				}
			}
		}
		return -1;
	}
	
	static final int CHAR=256;
	public static int leftMost1(String s1) {
		int[] count=new int[CHAR];
		
		for(int i=0;i<s1.length();i++) {
			count[s1.charAt(i)]++;
		}
		
		for(int i=0;i<CHAR;i++) {
			if(count[s1.charAt(i)]>1) {
				return i;
			}
		}
		return -1;
	}
	
	public static int leftMost2(String s1) {
		int[] fIndex=new int[CHAR];
		Arrays.fill(fIndex, -1);
		int res=Integer.MAX_VALUE;
		for(int i=0;i<s1.length();i++) {
			int fi=fIndex[s1.charAt(i)];
			if(fi==-1) {
				fIndex[s1.charAt(i)]=i;
			}
			else {
				res=Math.min(res, fi);
			}
		}
		
		return (res==Integer.MAX_VALUE)?-1:res;
		
	}
	
	public static int leftMost3(String s1) {
		boolean[] visited=new boolean[CHAR];
		int res=-1;
		for(int i=s1.length()-1;i>=0;i++) {
			if(visited[s1.charAt(i)]) {
				res=i;
			}
			else {
				visited[s1.charAt(i)]=true;
			}
		}
		return res;
	}

}
