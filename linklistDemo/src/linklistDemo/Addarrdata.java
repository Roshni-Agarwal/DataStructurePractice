package linklistDemo;

public class Addarrdata {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = new int[3];
		a[0]=1;
		a[1]=2;
		int n=a.length-1;
		for(int i=0;i<a.length;i++) {
		System.out.println("array : "+a[i]);

	}
	if(a[0] == 0) {
		a[0]=1;
		
	}else {
		if(a[n] == 0)
		{
			a[n]=5;
		}else {
			int[] temp = new int[n+n/2];
			for(int i = 0; i < a.length; i++) {
				temp[i] = a[i];
			}
			temp[n] = 5;
			a = temp;
		}
		
	}
	for(int i=0;i<a.length;i++) {
		System.out.println("array : "+a[i]);

	}
	

}
}