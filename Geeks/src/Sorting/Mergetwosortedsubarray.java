package Sorting;

public class Mergetwosortedsubarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Merge function of Merge sort
		//This video is a complex version of the previously discussed problem on Merge Sort. 
		//Here we take a single array with three points namely, the lower, the middle and the highest point. 
		//The elements from the lower to the middle are sorted and the elements from the (middle+1) to the higher are sorted. 
		//The task is to merge these two sorted parts into one.
		
		int[] a= {10,20,40,20,30};
		int low=0;
		int mid=2;
		int high=4;
		
		merge(a,low,mid,high);
		
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}

	}
	public static void merge(int[] a, int low,int mid, int high) {
		int n1=mid-low+1;
		int n2=high-mid;
		int left[] = new int[n1];
		int right[] = new int[n2];
		
		for(int i=0;i<n1;i++) {
			left[i]=a[low+i];
		}
		for(int i=0;i<n2;i++) {
			right[i]=a[mid+i+1];
		}
		
		int i=0,j=0,k=0;
		
		while(i<n1 && j<n2) {
			if(left[i]<=right[j]) {
				a[k]=left[i];
				i++;
				k++;
			}
			else {
				a[k]=right[j];
				j++;                         
				k++;
			}
		}
		while(i<n1) {
			a[k]=left[i];
			i++;
			k++;
		}
          		while(j<n2) {
			a[k]=right[j];
			j++;
			k++;
		}
	}

}
