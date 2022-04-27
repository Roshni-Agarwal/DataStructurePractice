package Map;

import java.util.Scanner;
import java.util.Stack;

public class levelod {
	public static void EvenNodes(int N,int coordinates[][]){
	    Stack<Integer> s=new Stack<>();
	    Stack<Integer> s1=new Stack<>();
	    s.push(coordinates[0][0]);
	    for(int i=0;i<N-1;i++) {
	        if (s.contains(coordinates[i][0])) {
	            s1.push(coordinates[i][1]);
	        }
	        if (s1.contains(coordinates[i][0])) {
	            s.push(coordinates[i][1]);
	        }
	    }
	    Stack<Integer> s2=sortstack(s);
	        while (!s2.isEmpty()) {
	            System.out.println(s2.pop());
	        }
	}
	public static Stack<Integer> sortstack(Stack<Integer>
	                                               input)
	{
	    Stack<Integer> tmpStack = new Stack<Integer>();
	    while(!input.isEmpty())
	    {
	        // pop out the first element
	        int tmp = input.pop();
	        // while temporary stack is not empty and
	        // top of stack is greater than temp
	        while(!tmpStack.isEmpty() && tmpStack.peek()
	                < tmp)
	        {
	            // pop from temporary stack and
	            // push it to the input stack
	            input.push(tmpStack.pop());
	        }
	        // push temp in tempory of stack
	        tmpStack.push(tmp);
	    }
	    return tmpStack;
	}
	 public static void main (String[] args)
	    {
	        Scanner sc=new Scanner(System.in);
	//INPUT [uncomment & modify if required]
	        int N=sc.nextInt();
	        int M=2;
	        int[][] coordinates=new int[N-1][2];
	        for(int i=0;i<N-1;i++){
	            for(int j=0;j<2;j++){
	                coordinates[i][j]=sc.nextInt();
	            }
	        }
	//OUTPUT [uncomment & modify if required]
	        // System.out.println(EvenNodes(N,coordinates));
	        EvenNodes(N,coordinates);
	        sc.close();
	    }
}
