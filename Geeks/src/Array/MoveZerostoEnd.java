package Array;

public class MoveZerostoEnd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {10,5,0,0,8,0,9,0};
		moveToEnd(arr);
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		moveZeros(arr);
		
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}

	}
	
	public static void moveToEnd(int[] arr) {
		int n=arr.length;
		for(int i=0;i<n;i++) {
			if(arr[i]==0) {
				for(int j=i+1;j<n;j++) {
					if(arr[j]!=0) {
						int temp=arr[i];
						arr[i]=arr[j];
						arr[j]=temp;
						break;
					}
				}
			}
		}
	}
	
	public static void moveZeros(int[] arr) {
		int count=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]!=0) {
				swap(arr[i],arr[count]);
				count++;
			}
		}
	}
	
	public static void swap(int a,int b) {
		int temp=a;
		a=b;
		b=temp;
	}

}
