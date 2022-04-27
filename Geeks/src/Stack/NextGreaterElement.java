package Stack;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Stack;

public class NextGreaterElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int[] arr=new int[]{5,15,10,8,6,12,9,18};
			        
			printnextGreater(arr,arr.length); 
			
			System.out.println();
			for(int x: nextGreater(arr,arr.length)){
	            System.out.print(x + " "); 
			}
	}
	
	public static void printnextGreater(int arr[],int n) {
		for(int i=0;i<n;i++) {
			int j;
			for(j=i+1;j<n;j++) {
				if(arr[j]>arr[i]) {
					System.out.print(arr[j]+" ");
					break;
				}
			}
			if(j==n) {
				System.out.print(-1+" ");
			}
		}
	}
	
	public static ArrayList<Integer> nextGreater(int arr[],int n){
        ArrayList<Integer> v=new ArrayList<>();
        Stack <Integer> s=new Stack<>();
        s.add(arr[n-1]);v.add(-1);
        for(int i=n-2;i>=0;i--){
            while(s.isEmpty()==false && s.peek()<=arr[i])
                s.pop();
            int ng=s.isEmpty()?-1:s.peek();
            v.add(ng);
            s.add(arr[i]);
        }
        Collections.reverse(v);
        return v;
	}   

}
