package Array;

public class LeadersInAnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {7,10,4,10,6,5,2};
		
		leaders(arr);
		System.out.println();
		leaders1(arr);


	}
	
	public static void leaders(int[] arr) {
		int n=arr.length;
		
		for(int i=0;i<arr.length;i++) {
			boolean flag = false;
			for(int j=i+1;j<n;j++) {
				if(arr[i]<=arr[j]) {
					flag=true;
					break;
				}
			}
			if(flag==false) {
				System.out.print(arr[i]+" ");
				

			}
		}
	}
	
	public static void leaders1(int[] arr) {
		int n=arr.length;
		int curr_ldr=arr[n-1];
		System.out.print(curr_ldr+" ");

		for(int i=n-2;i>=0;i--) {
			if(curr_ldr<arr[i]) {
				curr_ldr=arr[i];
				System.out.print(curr_ldr+" ");
			}
		}
	}

}
