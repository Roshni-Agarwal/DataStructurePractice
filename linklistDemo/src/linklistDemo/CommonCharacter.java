package linklistDemo;

import java.util.HashSet;
import java.util.Scanner;

public class CommonCharacter {
	public static int findFirstRepeatedChar(String str) { //char str[]
	    //write your code here
	    str=str.toLowerCase();
	     HashSet<Character> h = new HashSet<Character>(); 
	  
	        // Traverse the input array from left to right 
	        for (int i=0; i<str.length(); i++) 
	        { 
	            char c = str.charAt(i); 
	  
	            // If element is already in hash set, update x 
	            // and then break 
	            if (h.contains(c)) {
	                return i; 
	            }
	            else{ // Else add element to hash set 
	                h.add(c); 
	            }
	        } 
	         
	        return -1; 
	  }
	public static void main (String[] args) {
	    Scanner sc = new Scanner(System.in);
	    String str = sc.nextLine();
	    int index = findFirstRepeatedChar(str);
	    if(index != -1){
	      System.out.println(str.charAt(index));
	    }else{
	      System.out.println("NA");
	    }
	  }
}
