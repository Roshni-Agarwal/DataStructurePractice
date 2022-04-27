package Array;

public class LeftRotate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int[] arr= {1,2,3,4,5,6,7};
        int length=arr.length;
        int d=2;
        rotate(arr,length,d);
        for(int i=0;i<length;i++) {
        	System.out.println(arr[i]);
        }
	}
	public static void rotate(int[] arr,int length,int d) {
		if(d==0) {
			return;
		}
		int temp;
		int start=arr[0];
		int i=0;
		while(d!=0) {
			temp=arr[i];
			arr[i]=arr[length-i-1];
			arr[length-i-1]=temp;
			i++;
			d--;
		}
		
		
		
	}

}
