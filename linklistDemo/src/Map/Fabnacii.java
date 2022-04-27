package Map;

public class Fabnacii {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=5;
		int a=0;
		int b=1;
		
		System.out.println(a);
		System.out.println(b);
		int c=a+b;
		for(int i=1;i<=n-2;i++) {
			System.out.println(c);
			c=c+i;
		}
		

	}

}
