package linklistDemo;

import java.util.Scanner;

public class SelectionDemo {
	 public static void selectionSortAfterNIterations(int[] arr , int n) {
		    //write your code here
		    for(int i=0;i<n;i++){
		        int minIndex=i, minValue=arr[i];
		        for(int j=i+1;j<arr.length;j++){
		            if(arr[j]<minValue){
		                minValue=arr[j];
		                minIndex=j;
		            }
		        }
		        int temp=arr[i];
		        arr[i]=arr[minIndex];
		        arr[minIndex]=temp;
		    }
		    for(int i=0;i<arr.length;i++){
		        System.out.print(arr[i]+" ");
		    }
		  }
		public static void main(String[] args) {
		    Scanner scanner = new Scanner(System.in);
		    int size = scanner.nextInt();
		    int array[] = new int[size];
		    for (int j = 0; j < size; j++) {
		      array[j] = scanner.nextInt();
		    }
		    int i = scanner.nextInt();
		    selectionSortAfterNIterations(array, i);
		  }

}
