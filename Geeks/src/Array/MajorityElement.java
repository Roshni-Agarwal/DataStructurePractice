package Array;

public class MajorityElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {8,7,6,8,6,6,6,6};
		
		System.out.println(findMajority(arr));
		System.out.println(findMajority1(arr));

	}
	
	public static int findMajority(int[] arr) {
		int n=arr.length;
		for(int i=0;i<n;i++) {
			int count=1;
			for(int j=i+1;j<n;j++) {
				if(arr[i]==arr[j]) {
					count++;
				}
				
			}
			if(count>(n/2)) {
				return i;
			}
		}
		return -1;
			
	}
	
	public static int findMajority1(int[] arr) {
		int n=arr.length;
		int count=1;
		int res=0;
		for(int i=1;i<n;i++) {
			if(arr[res]==arr[i]) {
				count++;
			}
			else {
				count--;
			}
			if(count==0) {
				res=i;
				count=1;
			}
		}
		count=0;
		for(int i=0;i<n;i++) {
			if(arr[res]==arr[i]) {
				count++;
			}
			
		}
		if(count>(n/2)) {
			return res;
		}
		return -1;
	}

}
