package linklistDemo;

public class Sumofarr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = new int[4];
		a[0]=4;
		a[1]=6;
		a[2]=30;
		a[3]=10;
		int sum=0;
		for(int i=0;i<a.length;i++) {
			System.out.println("array : "+a[i]);
			sum=sum+a[i];
			System.out.println("sum : "+sum);
		}

	}

}
