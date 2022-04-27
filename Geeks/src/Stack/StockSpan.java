package Stack;

import java.util.Stack;

public class StockSpan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int[] arr=new int[]{18,12,13,14,11,16};
	        
	        printSpan(arr,arr.length); 
	        System.out.println();
	        printSpan1(arr,arr.length); 

	}
	
	public static void printSpan(int arr[],int n){
        for(int i=0;i<n;i++){
            int span=1;
            for(int j=i-1;j>=0 && arr[j]<=arr[i];j--)
                span++;
            System.out.print(span+" ");
        }    
    }
	
	public static void printSpan1(int arr[],int n) {
		 Stack<Integer> s=new Stack<>() ;
		 s.add(0);
		 System.out.print(1+" ");
		 for(int i=1;i<n;i++) {
			 while(s.isEmpty()==false && arr[s.peek()]<=arr[i]) {
				 s.pop();
			 }
			 int span=s.isEmpty() ? i+1 :i-s.peek();
			 System.out.print(span+" ");
			 s.push(i);
		 }
	}

}
