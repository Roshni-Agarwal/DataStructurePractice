package linklistDemo;

import java.util.Scanner;

public class BinarySearchExample {
	
		public static void main(String []args){
		    Scanner s = new Scanner(System.in);
		    int size = s.nextInt();
		    int[] arr = new int[size];
		    for(int i = 0; i < size; i++) {
		      arr[i] = s.nextInt();
		    }
		    int num = s.nextInt();
		    int freq = Source.countFreq(arr, size, num);
		    if (freq != 0)
		      System.out.print(freq);
		    else
		      System.out.print("NA");
		  }
		} 
 class Source {
	static int countFreq(int arr[],int size, int num) 
	  { 
	    //Write your code here
	    int count=0;
	    int first=0;
	    int last=arr.length-1;
	    int middle=(first+last)/2;
	    while(first<=last) {
	    	if(arr[middle]<num) {
	    		first=middle+1;
	    	}
	    	else if(arr[middle]>num) {
	    		last=middle-1;
	    		
	    	}
	    	else {
	    		int start=middle;
	    		int end =middle;
	    		for(int i=start;i>=0;i--) {
	    			if(arr[middle]==arr[i]) {
	    				start=i;
	    			}
	    			else {
	    				break;
	    			}
	    		}
	    		for(int j=end;j<=last;j++) {
	    			if(arr[j]==arr[middle]) {
	    				end=j;
	    			}
	    			else {
	    				break;
	    			}
	    		}
	    		count=end-start+1;
	    		//System.out.println("Found");
	    		break;
	    	}
	    	middle = (first + last)/2;
	    }
	    
	    return count;
	  }
}
