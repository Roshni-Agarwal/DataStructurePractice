package Map;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class WeirdSum {
	static int arr[]= {2,3,4,5};

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> al = new ArrayList<Integer>();
		int sum=arraySum();
	for(int i=0;i<arr.length;i++) {
		int a=sum-arr[i];
		System.out.println(arr[i]);
		System.out.println(a);
		
	}
	
	}
	public static int arraySum()
	{
		int sum=0;
		
		for(int i=0;i<arr.length;i++) {
			sum=sum+arr[i];
		}
		
		return sum;
	}
	

}
