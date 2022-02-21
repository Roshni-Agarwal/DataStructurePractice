package Array;

public class ReverseAnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr= {10,5,7,30};
		
		reverse(arr);
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}

	}
	
	public static void reverse(int arr[]) {
		int n=arr.length;
		int low=0;
		int high=n-1;
		while(low<high) {
			int temp=arr[low];
			arr[low]=arr[high];
			arr[high]=temp;
			low++;
			high--;
		}
		
	}

}
