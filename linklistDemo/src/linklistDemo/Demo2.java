package linklistDemo;

import java.util.Scanner;

public class Demo2 {
	public static void main(String []args) {
        Scanner s = new Scanner(System.in);
        int size = s.nextInt();
        int[] arr = new int[size];
        for(int i = 0; i < size; i++) {
            arr[i] = s.nextInt();
        }
        printDuplicates(arr);
    }
  static void printDuplicates(int arr[]) { 
    // write your code here
	  boolean isPrinted =false;
     for (int i = 0; i < arr.length; i++) { 
            
            for (int j = i+1; j < arr.length; j++) {
                if( arr[i]==arr[j]){
                	if(!isPrinted && arr[j]!=Integer.MIN_VALUE) {
                    System.out.println(arr[j]);
                    isPrinted=true;
                	}else {
                		arr[j]=Integer.MIN_VALUE;
                	}
                   
                }
                
               
            }
            isPrinted=false;
     }
     

	 
	}
}


