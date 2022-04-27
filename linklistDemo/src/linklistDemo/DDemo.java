package linklistDemo;

public class DDemo {
	
	public static void main(String[] args) {
		int[] arr = {10,2,7,6,8};
		
		for(int i = 0; i < arr.length -1; i++) {
			int s = arr[i] + arr[i+1];
			if(s %2 !=0) {
				if(i == 0) {
					int s2 = arr[i]+arr[i+2];
					if(s2 % 2 == 0) {
						System.out.println(i+2);
					}else {
						System.out.println(i+1);
					}
					break;
				} 
				System.out.println(i+2);
				break;
			}
		}
	}

}
