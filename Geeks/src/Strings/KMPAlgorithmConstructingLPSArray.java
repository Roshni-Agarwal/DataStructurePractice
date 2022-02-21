package Strings;

public class KMPAlgorithmConstructingLPSArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String txt="abacabad";
		int[] lps=new int[txt.length()];
		fillLps(txt,lps);
        for(int i=0;i<txt.length();i++){
            System.out.print(lps[i]+" ");
    }
        System.out.println();
        fillLPS(txt,lps);
        for(int i=0;i<txt.length();i++){
            System.out.print(lps[i]+" ");
    }  

	}
	
	public static int longProPreSuff(String str,int n) {
		for(int len=n-1;len>0;len--){
	        boolean flag=true;
	        for(int i=0;i<len;i++)
	            if(str.charAt(i)!=str.charAt(n-len+i))
	                flag=false;
	                
	        if(flag==true)
	            return len;
	    }
	    return 0;
	}
	public static void fillLps(String str,int[] lps) {
		for(int i=0;i<str.length();i++) {
			lps[i]=longProPreSuff(str,i+1);
		}
	}
	
	
	 static void fillLPS(String str, int lps[]){
	        int n=str.length(),len=0;
	        lps[0]=0;
	        int i=1;
	        while(i<n){
	            if(str.charAt(i)==str.charAt(len))
	            {len++;lps[i]=len;i++;}
	            else
	            {if(len==0){lps[i]=0;i++;}
	                else{len=lps[len-1];}
	            }
	        }
	    }

}
