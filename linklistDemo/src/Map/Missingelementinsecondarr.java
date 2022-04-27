package Map;

import java.util.HashSet;

public class Missingelementinsecondarr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1= {1,26,3,4,5};
		int[] arr2= {2,4,3,1,0};
		int l1=arr1.length;
		int l2=arr2.length;
		findmissingelement(arr1,arr2,l1,l2);

	}
	
	public static void findmissingelement(int[] arr1,int[] arr2,int l1,int l2) {
		HashSet<Integer> hset=new HashSet<>();
		
		//Store 2nd array element
		for(int i=0;i<l2;i++) {
			if(!hset.contains(arr2[i])) {
				hset.add(arr2[i]);
			}
		}
		
		//find missing element
		for(int j=0;j<l2;j++) {
			if(!hset.contains(arr1[j])) {
				System.out.println(arr1[j]);
			}
		}
	}

}
