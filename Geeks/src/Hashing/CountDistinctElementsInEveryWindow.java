package Hashing;

import java.util.HashMap;

public class CountDistinctElementsInEveryWindow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {10,10,5,3,20,5};
		int k=4;
		int n=arr.length;
		printDistWind(arr,k);
		printDistinct(arr,n,k);

	}
	
	public static void printDistWind(int[] arr,int k) {
		int n=arr.length;
		for(int i=0;i<=n-k;i++) {
			int count=0;
			for(int j=0;j<k;j++) {
				boolean flag =false;
				for(int z=0;z<j;z++) {
					if(arr[i+j]==arr[i+z]) {
						flag=true;
						break;
					}
				}
				if(flag==false) {
					count++;
				}
			}
			System.out.println(count);
		}
	}
	
	 static void printDistinct(int arr[], int n, int k)
	    {
	        HashMap<Integer, Integer> m=new HashMap<>(); 
	       
	        for (int i = 0; i < k; i++) { 
	            m.put(arr[i], m.getOrDefault(arr[i], 0) + 1); 
	        } 
	       
	        System.out.print(m.size()+" "); 
	       
	        for (int i = k; i < n; i++) { 
	            
	            m.put(arr[i - k],  m.get(arr[i - k]) - 1);
	            
	            if (m.get(arr[i - k]) == 0) { 
	                m.remove(arr[i-k]); 
	            }   
	            m.put(arr[i], m.getOrDefault(arr[i], 0) + 1);
	            
	            System.out.print(m.size()+" "); 
	        } 
	    }

}
