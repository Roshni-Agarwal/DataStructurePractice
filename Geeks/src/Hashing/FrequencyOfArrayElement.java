package Hashing;

import java.util.HashMap;
import java.util.Map;

public class FrequencyOfArrayElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {10,20,20,30,10};
		printFeq(arr);
		printFrequency(arr);
		

	}
	public static void printFeq(int arr[]) {
		int n=arr.length;
		for(int i=0;i<n;i++) {
			boolean flag=false;
			for(int j=0;j<i;j++) {
				if(arr[i]==arr[j]) {
					flag=true;
					break;
				}
			}
				if(flag==true) {
					continue;
				}
				int freq=1;
				for(int j=i+1;j<n;j++) {
					if(arr[i]==arr[j]) {
						freq++;
					}
				}
			System.out.println(arr[i]+" "+freq);
		}
	}
	
	public static void printFrequency(int[] arr) {
		//int n=arr.length;
		HashMap<Integer,Integer> h=new HashMap<>();
		for(int i:arr) {
			h.put(i,h.getOrDefault(i, 0)+1);
		}
		for(Map.Entry<Integer, Integer> e:h.entrySet()) {
			System.out.println(e.getKey()+ " "+e.getValue());
		}
	}

}
