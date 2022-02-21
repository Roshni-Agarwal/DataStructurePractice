package Strings;

public class CheckIfAStringIsSubsequenceOfOther {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//2to power n maximum number of subsequence we will get
		
		String s1="ABCDEF";
		String s2="ADE";
		int n=s1.length();
		int m=s2.length();
		System.out.println(isSubSeq(s1,s2));
		System.out.println(isSubSeq(s1,s2,n,m));

	}
	
	//Iterative 
	public static boolean isSubSeq(String s1,String s2) {
		int n=s1.length();
		int m=s2.length();
		int j=0;
		for(int i=0; i<n && j<m; i++) {
			if(s1.charAt(i)==s2.charAt(j)) {
				j++;
			}
			
		}
		return j==m;
	}
	
	//Recursive
	public static boolean isSubSeq(String s1,String s2,int n,int m) {
		if(m==0) {
			return true;
		}
		
		if(n==0) {
			return false;
		}
		
		if(s1.charAt(n-1)== s2.charAt(m-1)) {
			return isSubSeq(s1,s2,n-1,m-1);
		}
		else {
			return isSubSeq(s1,s2,n-1,m);
		}
		
	}

}
