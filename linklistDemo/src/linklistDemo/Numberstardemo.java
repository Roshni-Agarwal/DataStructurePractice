package linklistDemo;

public class Numberstardemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int z=1;
		for(int i=1;i<=4;i++) {
			for(int j=1;j<=i;j++) {
				
                    if(z==5 || z==8) {
                    	System.out.print("*");
                    	z++;
                    	continue;
                    	
					}
                   
                    System.out.print(z++);	
				
			}
			System.out.println();
			
		}

	}

}
