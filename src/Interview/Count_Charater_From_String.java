package Interview;

import java.util.HashMap;
import java.util.Map;

public class Count_Charater_From_String {
	
	
	public static void charfind(String str) {
		
	/*	Map<Character, Integer> m = new HashMap<Character, Integer>();
		
		char strr[] = str.toCharArray();
		
		for (char c : strr) {
			if(m.containsKey(c)) {
				m.put(c, m.get(c)+1);
			}else {
				m.put(c,1);
			}
		}
		System.out.println(m);*/
		
		
		// Reverse String in JAVA
		
		String OUTPUT = " ";
		
		for (int i=str.length()-1; i>=0;i--) {
			OUTPUT = OUTPUT + str.charAt(i);
		}
		System.out.println(OUTPUT);
		
	}
	public static void main(String[] args) {
		
		charfind("Bhaumik");
 
	}

}
