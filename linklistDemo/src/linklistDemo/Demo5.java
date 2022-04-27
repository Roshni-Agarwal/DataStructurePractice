package linklistDemo;

public class Demo5 {
	
	static int median(int[] arr) {
		int n = arr.length ; 
        if (n % 2 == 0)
            return (arr[n/2]+ arr[n/2-1])/2; 
        else 
            return arr[n/2]; 
	}
	
	static int helper(int[] a,int[] b,int siA,int eiA,int siB,int eiB) {
		
		if (siA==eiA){ 
			return a[siA]+b[siB]/2;
            
        }
		int m1 = median(a); 
        int m2 = median(b); 
        if(m1==m2)
        	return m1;
        if(m1>m2)
        	return helper(a,b,siA,(siA+eiA+1)/2,(siB+eiB+1)/2,siB); 
        else 
        	return helper(a,b,(siA+eiA+1)/2,eiA,siB,(siB+eiB+1)/2); 
	}
	
	public static void main(String args[] )  {
		int[] a= {1,2,3,4,5,6,7};
		int[] b= {1,2,3,4,5,6,7};
		System.out.println(helper(a,b,0,a.length-1,0,b.length-1));
	}


}
