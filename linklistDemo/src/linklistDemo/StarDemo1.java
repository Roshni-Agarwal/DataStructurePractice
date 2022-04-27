package linklistDemo;

public class StarDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int z=1;
		int y=20;
		// this loop only for no.s of row which we have to print
		for(int i=4;i>0;i--) {
			// this loop is for space
			/*we will add space to the code 
    			1st line space is 0, 2nd line 1, 3rd line 2 , 4th line 3 
    			So we have 4 row and after every iteration I will decerease by 1 so we can write this as 4-I */
			for(int s=4-i;s>0;s--) {
				System.out.print(" ");
			}
			// this code is 1st have of star and 1to 10 number
			/*
			 1*2*3*4* 
			 5*6*7* 
			 8*9* 
             10* 
			 */
			for(int j=i;j>0;j--) {
				System.out.print(z++ +"*");
			}
			//this loop is for 2nd half of the star and number
			/*
			 17*18*19*20
			 14*15*16
			 12*13
			 11
			 */
			for(int k=i-1;k>0;k--) {
				/*if we want to print 20 19 18 17 we can do directly y-1 but here we are printing opposite 
					17    18    19    20 
					|-3   |-2   -1     |-0 
					20    20    20     20 
					This we will achive by y-k ie 20-3*/
				System.out.print(y-k +"*");
			}
			/*
			  we wrote as y 
			  as we don't require * at end so we have printed y here
				1st line at last y=20 
				2nd line at last y=y-I=20-4=16 
				3rd line at last y=y-I=16-3=13 
				4th line at last y=y-I=13-2=11 
			 */
			System.out.println(y);
			/*
			 in second line we will start y value from 16 not from 20
				
				How we can get 16 I.e 20-4 what is 4 I.e value of I 
				20-4=16 we will achive this by y=y-i; 
				Now after this I value is 3 and so on 
			 */
			y=y-i;
			
		}
        }

	}


