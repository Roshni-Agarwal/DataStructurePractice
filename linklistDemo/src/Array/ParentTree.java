package Array;
import java.util.*;
import java.lang.*;
import java.io.*;
import java.lang.Math;
public class ParentTree {

	public static int goodNodes(int N, int R, int coordinates[][]) {
        int count = 0;
        int[] alreadySeenNode = new int[N];
        int root = R;
        int index = -1;
        for (int i = 0; i < N; i++) {
            root = coordinates[i][0];
            boolean isUpright = true;
            int noOfChildren = 0;

            int k;
            for (k = 0; k <= index; k++) {
                if (alreadySeenNode[k] == root) {
                    break;
                }
            }
            if (k > index) {
                alreadySeenNode[k] = root;
                index++;
            } else
                continue;

            for (int j = 0; j < N; j++) {
                if (coordinates[j][0] == root) {
                    noOfChildren++;
                    if (coordinates[j][0] > coordinates[j][1])
                        isUpright = false;
                }
            }
            if (isUpright == true && noOfChildren > 0)
                count++;
        }
        return count;


    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);            //INPUT [uncomment & modify if required]
        int N = sc.nextInt();
        int R = sc.nextInt();
        int M = 2;
        int[][] coordinates = new int[N][2];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < 2; j++) {
                coordinates[i][j] = sc.nextInt();
            }
        }
        sc.close();            //OUTPUT [uncomment & modify if required]

        System.out.println(goodNodes(N, R, coordinates));
	}

}
