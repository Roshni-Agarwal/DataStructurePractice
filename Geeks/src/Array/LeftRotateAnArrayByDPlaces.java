package Array;

public class LeftRotateAnArrayByDPlaces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr= {1,2,3,4,5};
		int d=2;
		int n=arr.length;
		
		leftRotate(arr,d);
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		
		System.out.println();
		
		leftRotate1(arr,d);
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		
		leftRotate2(arr,n,d);
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}

	}
	
	public static void leftRotate(int[] arr,int d) {
		int n=arr.length;
		for(int i=0;i<d;i++) {
			leftRotateOne(arr);
		}
	}
	
	public static void leftRotateOne(int[] arr) {
		int n=arr.length;
		int temp=arr[0];
		for(int i=1;i<n;i++) {
			arr[i-1] =arr[i];
		}
		arr[n-1]=temp;
	}
	
	public static void leftRotate1(int[] arr,int d) {
		int n=arr.length;
		int temp[]=new int[d];
		
		for(int i=0;i<d;i++) {
			temp[i]=arr[i];
		}
		
		for(int i=d;i<n;i++) {
			arr[i-d]=arr[i];
		}
		
		for(int i=0;i<d;i++) {
			arr[n-d+i]=temp[i];
		}
			
	}
	
	public static void leftRotate2(int arr[],int n,int d) {
		
		
		reverse(arr,0,d-1);
		reverse(arr,d,n-1);
		reverse(arr,0,n-1);
	}
	
	public static void reverse(int arr[],int low,int high) {
		while(low<high) {
			int temp = arr[low];
    		arr[low] = arr[high];
    		arr[high] = temp;
			low++;
			high--;
		}
	}
	
	

}
