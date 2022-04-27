package Map;
import java.util.*;
import java.lang.*;
import java.io.*;
import java.lang.Math;


public class SumOfEvenNum {
	
	public static int sumofEvenElements(int N, int A[]) {
	//this is default OUTPUT. You can change it.
	int result=-404;
	//write your Logic here:
	int even =0;
	int odd =0;
	for(int i=0;i<N;i++){
	if(A[i]%2==0)
	even+=A[i];
	}
	return even;
	}
	public static void main(String[] args) {
	// INPUT [uncomment & modify if required]
	Scanner sc = new Scanner(System.in);
	int N = sc.nextInt();
	int A [] = new int[N];
	for(int i=0; i<N; i++) {
	A[i] = sc.nextInt();
	
	
	}
	// OUTPUT [uncomment & modify if required]
	System.out.print(sumofEvenElements(N,A));
	sc.close();
	}
	

}
