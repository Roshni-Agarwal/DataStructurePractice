package linklistDemo;

public class Demo3 {
	public static void main(String arg[]) {
		fun(4,"");
	}
	
	
public static void fun(int n,String str){		
	   if(n==0) {
		   System.out.println(str);
		   return;
		  
	   }
	   fun(n-1,str+"0");
	   
	   fun(n-1,str+"1");
	   
	}

}

