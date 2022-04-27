package Map;

import java.util.Scanner;
import java.util.*;

public class StackArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N=sc.nextInt();
		int A[]=new int[N];
		for(int i=0;i<N;i++) {
			A[i]=sc.nextInt();
		}
		popElements(N,A);
		sc.close();

	}
	public static int popElements(int N,int A[]) {
		int result=-404;
		Stack<Integer> s=new Stack<Integer>();
		int start=0;
		int end=N-1;
		if(N>1) {
			for(;start<=end;) {
				s.push(A[start]);
				
				
				if(start!=end) {
					s.push(A[end]);
					
				}

				start++;
				end--;
			}

		}
			else {
				s.push(A[0]);
			}
			int i=N;
			while(i>0) {
				System.out.println(s.pop());
				i--;
			}
		
		return result;
		
		}


}
