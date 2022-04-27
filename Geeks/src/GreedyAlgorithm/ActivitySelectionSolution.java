package GreedyAlgorithm;

import java.util.Arrays;

public class ActivitySelectionSolution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Activity arr[]= {new Activity(12,25),
						 new Activity(10,20),
						 new Activity(20,30)};
		System.out.println(maxActivity(arr));
		

	}
	
	public static int maxActivity(Activity []arr) {
		Arrays.sort(arr,new MyCmp());
		int res=1;
		int prev=0;
		for(int curr=1;curr<arr.length;curr++) {
			if(arr[curr].start>=arr[prev].finish) {
				res++;
				prev=curr;
			}
		}
		return res;
		
	}

}
