package Hashing;

import java.util.HashMap;
import java.util.Map;

public class HashMapImp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<String,Integer> m=new HashMap<String,Integer>();
		m.put("gfg", 10);
		m.put("ide", 15);
		m.put("courses", 20);
		
		System.out.println(m);
		System.out.println(m.size());
		for(Map.Entry<String,Integer> e:m.entrySet()) {
			System.out.println(e.getKey()+" "+e.getValue());
		}
		
		if(m.containsKey("ide")) {
			System.out.println("yes");
		}
		else {
			System.out.println("no");
		}
		
		m.remove("ide");

	}

}
