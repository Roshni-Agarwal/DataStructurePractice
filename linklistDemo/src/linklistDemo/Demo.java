package linklistDemo;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.SortOrder;

public class Demo {

	public static void main(String[] args) {
		
		int z = 1;
		int y = 20;
		
		
		
		 for(int i = 4;i>0;i--) {
			for(int j = 4-i; j >0; j--) {
				 System.out.print(" ");
			  }
			for(int j=i; j >0; j--) 
		  	{ System.out.print(z++ +"*"); }
		
		  for( int m = i; m >1;m--) 
		  	{ System.out.print( y -(m-1)+"*"); 
		  	} 
		  System.out.println(y);
		 
		  	y = y -i; 
		  	
		  }
		 
	}

}