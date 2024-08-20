package Basic.concepts;

import java.util.HashMap;
import java.util.Map;

public class Count_Charater_From_String {
	
	
	public static void charfind(String str) {
		
	Map<Character, Integer> m = new HashMap<Character, Integer>();
		
		char strr[] = str.toCharArray();
		
		for (char c : strr) {
			if(m.containsKey(c)) {
				m.put(c, m.get(c)+1);
			}else {
				m.put(c,1);
			}
		}
		System.out.println(m);
	
		
	}
	public static void main(String[] args) {
		
		charfind("Bhaumik");
 
	}

}
