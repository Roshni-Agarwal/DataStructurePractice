package Map;

import java.util.HashSet;

public class SubsetUsingHash {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1= {11,2,3,7,0,5,8,9};
		int[] arr2= {11,2,0,5,89};
		
		int l1=arr1.length;
		int l2=arr2.length;
		
		if(isSubset(arr1,arr2,l1,l2)) {
			System.out.println("array two is subset of array one");
		}
		else {
			System.out.println("array two is not subset of array one");
		}

	}
	public static boolean isSubset(int[] arr1,int[] arr2,int l1,int l2) {
		
		HashSet<Integer> hset=new HashSet<>();
		
		//store
		for(int i=0;i<l1;i++) {
			if(!hset.contains(arr1[i])) {
				hset.add(arr1[i]);
			}
		}
		
		//check subset
		for(int j=0;j<l2;j++) {
			if(!hset.contains(arr2[j])) {
				return false;
			}
		}
		return true;
	}

}
