package Array;
import java.util.*;
import java.lang.*;
import java.io.*;
import java.lang.Math;
public class SumofPrime {

	
	
	public static int primeNumberSum(int N, int A[]) {
	//this is default OUTPUT. You can change it.
	//write your Logic here:
	int result=0;
	  for(int i = 0; i < N; i++) {
		  if(isPrime(A[i])) {
			  //System.out.println(A[i]);
			  result = result+A[i];
		  }
	  }
	        
	  return result;  
	}
	
	public static boolean isPrime(int n) {
		if(n==1) {
			return false;
		}
		for(int i = 2; i <= Math.sqrt(n); i++) {
			if(n%i == 0)
				return false;
		}
		return true;
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
	System.out.print(primeNumberSum(N,A));
	sc.close();
	}
	}



