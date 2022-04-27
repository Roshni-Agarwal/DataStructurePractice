package Map;

import java.util.HashMap;
import java.util.Set;

public class MapDemo {
	
	public static void main(String[] args) {
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		
		String str = "ababcbadbeeas";
		
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			
			if(map.containsKey(ch)) {
				System.out.println(ch);
				break;
			}else {
				map.put(ch,1);
			}
		}
		
	}

}
