package Hashing;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class MoreThannbykOccurences {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {10,10,20,30,20,10,10};
		int k=2;
		printNbyK(arr,k);
		printNbyK1(arr,k);
		printNByK(arr, k);

	}
	
	public static void printNbyK(int[] arr,int k) {
		int n=arr.length;
		Arrays.sort(arr);
		int i=1,count=1;
		
		while(i<n) {
			while(i<n && arr[i]==arr[i-1]) {
				count++;
				i++;
			}
			if(count>n/k) {
				System.out.println(arr[i-1]+" ");
				
			}
			count=1;
			i++;
		}
	}
	
	public static void printNbyK1(int[] arr,int k) {
		int n=arr.length;
		HashMap<Integer,Integer> m=new HashMap<Integer,Integer>();
		for(int i:arr) {
			m.put(i, m.getOrDefault(i, 0)+1);
		}
		for(Map.Entry<Integer, Integer> e:m.entrySet()) {
			if(e.getValue()>n/k) {
				System.out.println(e.getKey()+" ");
			}
		}
		
	}
	
	static void printNByK(int arr[], int k)
    {
		int n=arr.length;
        HashMap<Integer,Integer> m=new HashMap<Integer,Integer>();
            
            for(int i=0;i<n;i++){
            if(m.containsKey(arr[i])){
                int count=m.get(arr[i]);
                m.put(arr[i],count+1);
            }
            else if(m.size()<k-1)
                m.put(arr[i],1);
            else
                for(Map.Entry x:m.entrySet()){
                    Integer c=(Integer)x.getValue();
                    m.put((Integer)x.getKey(),c-1);
                    if((Integer)x.getKey()==0)
                        m.remove(x.getKey());}
        }
        for(Map.Entry x:m.entrySet()){
            int count=0;
            for(int i=0;i<n;i++){
                if((Integer)x.getKey()==arr[i])
                    count++;
            
           }
            if(count>n/k)
                System.out.print(x.getKey()+" ");
        }
    }

}
