package Map;

import java.util.*;

public class UniqueCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a="ayusha";
		printCharacter(a);

	}
	public static void printCharacter(String a) {
		HashSet<Character> set=new HashSet<>();
		
		char[] arr1=a.toCharArray();
		
		for(int i=0;i<arr1.length;i++) {
			if(!set.contains(arr1[i])) {
				set.add(arr1[i]);
				//System.out.println(arr1[i]);
			}
			
		}
		for(char i:set) {
			System.out.println(i);
		}
	
		
	}

}
