package Map;

import java.util.HashMap;

public class FindnumberKrt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,7,3,4,9};
		int n =arr.length;
		int k=2;
		System.out.println(findElement(arr,n,k));

	}
	public static int findElement(int[] arr,int n,int k) {
		
		HashMap<Integer,Integer> map=new HashMap<>();
		
		int count=0;
		for(int i=0;i<n;i++) {
			if(map.get(arr[i])!=null) {
				count=map.get(arr[i]);
			}
			map.put(arr[i], count+1);
		}
		for(int j=0;j<n;j++) {
			if(map.get(arr[j])==k) {
				return arr[j];
			}
		}
		return -1;
	}

}
