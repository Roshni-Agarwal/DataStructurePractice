package Hashing;

import java.util.*;

public class HashSetImp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashSet<String> h=new HashSet<String>();
		h.add("gfg");
		h.add("couses");
		h.add("ide");
		
		System.out.println(h);
		System.out.println(h.contains("ide"));
		Iterator<String> i=h.iterator();
		while(i.hasNext()) {
			System.out.println(i.next()+" ");
		}
		h.remove("ide");
		System.out.println(h.size());
		
		for(String s: h) {
			System.out.println(s);
		}
		System.out.println(h.isEmpty());

	}

}
