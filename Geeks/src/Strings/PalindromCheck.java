package Strings;

public class PalindromCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="ABBA";
		System.out.println(isPalindrom(str));
		System.out.println(isPalindrom1(str));

	}
	
	public static boolean isPalindrom(String str) {
		StringBuilder rev= new StringBuilder(str);
		rev.reverse();
		
		return str.equals(rev.toString());
	}
	
	public static boolean isPalindrom1(String str) {
		int begin=0;
		int end=str.length()-1;
		
		while(begin<end) {
			if(str.charAt(begin)!=str.charAt(end)) {
				return false;
			}
			begin++;
			end--;
		}
		return true;
		
	}

}
