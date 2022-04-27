package GreedyAlgorithm;

import java.util.Comparator;

public class MyCmp implements Comparator<Activity>{
	public int compare(Activity a1,Activity a2) {
		return a1.finish-a2.finish;
	}

}
