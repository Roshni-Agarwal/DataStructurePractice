package linklistDemo;

public class Stardemo {

	public static void main(String arg[]) {
		int arr[]= {1,2,3};
		int a;
		int b;
		int c;
		for(int j=0;j<=arr.length-1;j++) {
		for(int i=1;i<=10;i++) {
			a=i*arr[j];
			b=i*arr[j];
			c=i*arr[j];
			if(a>20) {
				System.out.println(a);
				continue;
			}
			if(b>20) {
				System.out.println(b);
			}
			if(c>20) {
				System.out.println(c);
			}
		}
	}
	}
	}

