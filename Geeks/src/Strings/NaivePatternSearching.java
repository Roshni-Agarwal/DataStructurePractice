package Strings;

public class NaivePatternSearching {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String txt="ABCABCD";
		String pat="ABCD";
		patSearching(txt,pat);

	}
	
	public static void patSearching(String txt,String pat) {
		int m=pat.length();
		int n=txt.length();
		for(int i=0;i<=n-m;i++) {
			int j;
			for(j=0;j<m;j++) {
				if(pat.charAt(j)!=txt.charAt(i+j)) {
					break;
				}
				
			}
			if(j==m) {
				System.out.println(i);
			}
		}
	}

}
