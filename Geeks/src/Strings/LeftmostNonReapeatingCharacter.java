package Strings;

import java.util.Arrays;

public class LeftmostNonReapeatingCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="geeksforgeeks";
		System.out.println(nonRep(str));
		System.out.println(nonRep1(str));
		System.out.println(nonRep2(str));

	}
	
	public static int nonRep(String str) {
		for(int i=0;i<str.length();i++) {
			boolean flag=false;
			for(int j=0;j<str.length();j++) {
				if(i!=j && str.charAt(i)==str.charAt(j)) {
					flag=true;
					break;
				}
			}
			if(flag==false) {
				return i;
			}
		}
		return -1;
	}
	
	static final int CHAR=256;
	public static int nonRep1(String str) {
		int[] count=new int[CHAR];
		for(int i=0;i<str.length();i++) {
			count[str.charAt(i)]++;
		}
		for(int i=0;i<str.length();i++) {
			if(count[str.charAt(i)]==1) {
				return i;
			}
		}
		return -1;
	}
	
	public static int nonRep2(String str) {
		int[] fI=new int[CHAR];
		Arrays.fill(fI, -1);
		
		for(int i=0;i<str.length();i++) {
			if(fI[str.charAt(i)]==-1) {
				fI[str.charAt(i)]=i;
			}
			else {
				fI[str.charAt(i)]=-2;
			}
		}
		int res=Integer.MAX_VALUE;
		for(int i=0;i<CHAR;i++) {
			if(fI[i]>0) {
				res=Math.min(res, fI[i]);
			}
			
		}
		return (res==Integer.MAX_VALUE)?-1:res;
	}

}
