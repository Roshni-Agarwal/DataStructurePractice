package Map;

import java.util.Arrays;
import java.util.*;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       String a="cat";
       String b="taca";
       printAnagram(a,b);
	}
	public static void printAnagram(String a, String b) {
		HashMap<Character,Integer> map=new HashMap<>();
		char[] arr1=a.toCharArray();
		char[] arr2=b.toCharArray();
		if(arr1.length != arr2.length) {
			System.out.println("not an anagram");
			return;
		}
		for(int i=0;i<arr1.length;i++) {
			if(!map.containsKey(arr1[i])) {
				map.put(arr1[i], 1);
			}
			else {
				int value=map.get(arr1[i]);
				map.put(arr1[i], value+1);
			}
			 
		}
		
		for(int j=0;j<arr2.length;j++) {
			if(map.containsKey(arr2[j])) {
				int count=map.get(arr2[j]);
				if(count>0) {
					map.put(arr2[j], count-1);
				}
				else {
					System.out.println("not an Anagram");
					return;
				}
			}
			else {
				System.out.println("not an Anagram");
				return;
			}
		}
		System.out.println("Anagram");
		
	}

}
