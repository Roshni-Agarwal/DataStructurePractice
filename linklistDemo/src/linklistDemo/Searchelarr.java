package linklistDemo;

public class Searchelarr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a;
		int sa=2;
		int index = -1;
		a = new int[3];
		a[0]=1;
		a[1]=2;
		a[2]=67;
		for(int i=0;i<a.length;i++) {
			if(a[i]==sa) {
				index = i;
				break;
			}
		}
		if(index == -1) {
			System.out.println("Not Found");
		}else {
			System.out.println(index);
		}
	}

}
