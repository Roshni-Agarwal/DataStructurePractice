package linklistDemo;

public class StarDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int left=10;
		int right=11;
		int j;
		for(int i=1;i<=4;i++) {
			for(int s=4-i;s>=0;s--) {
				System.out.print(" ");
			}
			for(j=1;j<=i;j++) {
				System.out.print(left++  +"*");
				
				
			}
			for(int k=0;k<i-1;k ++) {
				
				System.out.print(right++ +i-1 +"*");
			}
			System.out.println(right+i-1);
			
			left=left-i-j;
		}

	}

}
