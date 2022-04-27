package GreedyAlgorithm;

public class Item implements Comparable<Item>{
	int wt;
	int val;
	Item(int w,int v){
		wt=w;
		val=v;
	}
	public int compareTo(Item i)
	{
		return wt * i.val - val * i.wt;
	}

}
