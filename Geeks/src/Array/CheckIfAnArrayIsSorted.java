package Array;

public class CheckIfAnArrayIsSorted {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {5,20,8,100};
		System.out.println(isSorted(arr));
		System.out.println(isSorted1(arr));

	}
	
	public static boolean isSorted(int[] arr) {
		int n=arr.length;
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<n;j++) {
				if(arr[j]<arr[i]) {
					return false;
				}
			}
		}
		return true;
	}
	
	public static boolean isSorted1(int[] arr) {
		int n=arr.length;
		for(int i=1;i<n;i++) {
			if(arr[i]<arr[i-1]) {
				return false;
			}
		}
		return true;
	}

}
