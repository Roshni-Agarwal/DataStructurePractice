package linklistDemo;

import java.util.Scanner;

public class Demo4 {
	public static void main(String []args) {
        Scanner s = new Scanner(System.in);
        int size1 = s.nextInt();
        int[] arr1 = new int[size1];
        for(int i = 0; i < size1; i++){
            arr1[i] = s.nextInt();
        }
        int size2 = s.nextInt();
        int[] arr2 = new int[size2];
        for(int i = 0; i < size2; i++){
            arr2[i] = s.nextInt();
        }
        mergeSortedArrays(arr1, arr2);
    }
	
	public static void mergeSortedArrays(int arr1[], int arr2[]) { 
	    // write your code here
	     int i = 0, j = 0, k = 0;
	     
	     int[] arr3=new int[arr1.length+arr2.length];
	     while (i<arr1.length && j <arr2.length) {
	          if (arr1[i] < arr2[j]) { 
	        	  if(k>0 && arr3[k-1]==arr1[i]) {
	        		  i++;
	        	  }
	        	  else {
	        		  arr3[k++] =arr1[i++]; 
	        	  }
	          }     
	            else {
	            	if(k>0 && arr3[k-1]==arr2[j]) {
	            		j++;
	            }
	            	
	            
	            else {
	            	arr3[k++] = arr2[j++];
	            }
	            }    
	               //arr2[j++];
	     }
	       while (i < arr1.length){ 
	    	   if(k>0 && arr3[k-1]==arr1[i]) {
	    		   i++;
	    	   }
	    	   else {
	    		   arr3[k++] = arr1[i++]; 
	    	   }
	            
	             //arr1[i++];
	       }
	        while (j < arr2.length) {
	        	if(k>0 && arr3[k-1]==arr1[j]) {
	        		j++;
	        	}
	        	else {
	        		arr3[k++] = arr2[j++]; 
	        	}
	            
	            //arr2[j++]; 
	        }
	        for (int a=0; a < k; a++) {
	            System.out.print(arr3[a]+" ");
	             }return;
	      } 

	    }


