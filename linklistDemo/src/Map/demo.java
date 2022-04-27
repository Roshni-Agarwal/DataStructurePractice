package Map;

import java.util.*;

public class demo {

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	String str1="I am roshni Kumari";
	String str2="I am Indian";
	
	String[] arr1=str1.split(" ");
	String[] arr2=str2.split(" ");
	
	String a="I ";
	String b="I ";
	
	for(int i=1; i<arr1.length;i++) {
		char[] ch1=arr1[i].toCharArray();
		for(int j=ch1.length-1;j>=0;j--) {
			a=a+ch1[j];
		}
		a=a+" ";
		
	}
	System.out.println(a);
	
	for(int k=1; k<arr2.length;k++) {
		char[] ch2=arr2[k].toCharArray();
		for(int l=ch2.length-1;l>=0;l--) {
			b=b+ch2[l];
		}
		b=b+" ";
		
	}
	 System.out.println(b);
	
	
	}
}
