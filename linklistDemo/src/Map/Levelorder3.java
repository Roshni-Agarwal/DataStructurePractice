package Map;

import java.util.Scanner;
import java.util.Stack;

public class Levelorder3 {
	public static void EvenNodes(int N,int coordinates[][]){
        Stack<Integer> s=new Stack<>();
        Stack<Integer> s1=new Stack<>();
        //s.push(coordinates[0][0]);//if using extra code use ---s.push(1)
        // 1. extra code
        Stack<Integer> s10=new Stack<>();
        for (int z=0;z<N-1;z++){
            s10.push(coordinates[z][0]);
        }
    if(s10.contains(1)) {
        // 1.endes here
        s.push(coordinates[0][0]);
        for (int i = 0; i < N - 1; i++) {
            if (s.contains(coordinates[i][0])) {
                s1.push(coordinates[i][1]);
            }
            if (s1.contains(coordinates[i][0])) {
                s.push(coordinates[i][1]);
            }
        }
        //2. starts here
    }else {
        s.push(coordinates[0][1]);
        for (int i = 0; i < N - 1; i++) {
            if (s.contains(coordinates[i][1])) {
                s1.push(coordinates[i][0]);
            }
            if (s1.contains(coordinates[i][1])) {
                s.push(coordinates[i][0]);
            }
        }
    }
    //2.ends here
        Stack<Integer> s2=sortstack(s);
        //this line added
        Stack<Integer> s3=sortstack(s1);
        if(s2.contains(1)) {
            //here it ends
            while (!s2.isEmpty()) {
                System.out.println(s2.pop());
            }
            //again it starts
        }else {
            while (!s3.isEmpty()) {
                System.out.println(s3.pop());
            }
        }
        //ends here
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
