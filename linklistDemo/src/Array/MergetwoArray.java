package Array;

public class MergetwoArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1= {1,2,3,4,5};
		String[] arr2= {"a","b","c"};
		int length1=arr1.length;
		int length2=arr2.length;
		String[] arr3=new String[length1+length2];
		int i=0;
		int j=0;
		int k=0;
		
		while(i<length1 && j<length2) {
			arr3[k]=Integer.toString(arr1[i]);
			k++;
			i++;
			arr3[k]=arr2[j];
			k++;
			j++;
		}
		
		while(i<length1) {
			arr3[k]=Integer.toString(arr1[i]);
			k++;
			i++;
		}
		while(j<length2) {
			arr3[k]=arr2[j];
			k++;
			j++;
		}
		
		for(int l=0;l<arr3.length;l++) {
			System.out.println(arr3[l]);
		}

	}
	

}
