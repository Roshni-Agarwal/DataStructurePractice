package Stack;

import java.util.Stack;

public class PreviousGreaterElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int[] arr=new int[]{20,30,10,5,15};
	        
	        printPrevGreater(arr,arr.length);
	        System.out.println();
	        printPrevGreater1(arr,arr.length);

	}
	
	public static void printPrevGreater(int arr[],int n) {
		for(int i=0;i<n;i++){
            int j;
            for(j=i-1;j>=0;j--){
                if(arr[j]>arr[i]){
                    System.out.print(arr[j]+" ");
                    break;
                }
            }
            if(j==-1)
                System.out.print(-1+" ");
        }
	}
	public static void printPrevGreater1(int arr[],int n) {
		Stack <Integer> s=new Stack<>();
        s.add(arr[0]);
        System.out.print(-1+" ");
        for(int i=1;i<n;i++) {
        	while(s.isEmpty()==false && s.peek()<=arr[i]) {
        		s.pop();
        	}
        	int pg=s.isEmpty() ? -1:s.peek();
        	System.out.print(pg+" ");
        	s.push(arr[i]);
        }
	}

}
