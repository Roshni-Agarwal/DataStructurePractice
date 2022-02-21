package Array;

public class Secle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {100,50,8,20};
		int n =arr.length;
		System.out.println(getsecle(arr,n));

	}
	public static int getsecle(int[] arr, int n) {
		int prev=-1;
		int next =0;
		for(int i=0;i<n;i++) {
			if(arr[i]>arr[next]) {
				prev=next;
				next=i;
			}
			else if(arr[i]!=arr[next]) {
				if(prev== -1 || arr[i]>arr[prev]) {
					prev=i;	
				}
			}
		}
		return prev;
	}

}
