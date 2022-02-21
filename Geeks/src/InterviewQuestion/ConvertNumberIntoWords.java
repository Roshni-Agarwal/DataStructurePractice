package InterviewQuestion;

public class ConvertNumberIntoWords {

	private static final String[] unit= {"zero","one","two","three","four","five","six","seven","eight","nine"};
	private static final String[] tens= {" ","key","twenty","thirty","fourty","fifty","sixty","seventy","eighty","ninty"};
	private static final String[] ones= {"ten","eleven","twelve","thirteen","fourteen","fifteen","sixteen","seventeen","eighteen","nineteen"};
	private static final String[] position= {"hundred","thousand","lacks","cror"};
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=564326726;
		
		System.out.println(numToWords(num));

	}
	
	public static String numToWords(int num) {
		String str="";
		int temp=num;
		int count=0;
		int units=temp%10;
		temp=temp/10;
		int tenth=temp%10;
		temp=temp/10;
		int hundreds=temp%10;
		temp=temp/10;
		if(tenth==1) {
			str=unit[hundreds]+" "+position[count]+" "+ones[units];
			
		}
		else {
			str=unit[hundreds]+" "+position[count]+" "+tens[tenth]+" "+unit[units];
		}
		
		while(temp>0) {
			
			int a=temp%10;
			temp=temp/10;
			int b=temp%10;
			temp=temp/10;
			count++;
			str=tens[b]+" "+unit[a]+" "+position[count]+" "+str;
			
		}

		
		
		return str;
	}

}
