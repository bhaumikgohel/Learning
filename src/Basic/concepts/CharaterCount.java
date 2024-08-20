package Basic.concepts;

import java.util.HashMap;

public class CharaterCount {
	
	public static void Count(String input) {
		
		HashMap<Character, Integer> charmap = new HashMap<Character, Integer>();
		
		char strarry[] = input.toCharArray();
		
		for(char c : strarry) {
			if(charmap.containsKey(c)) {
				charmap.put(c, charmap.get(c)+1);
			}else {
				charmap.put(c, 1);
			}
		}
		System.out.println(charmap);
		
	}

	public static void main(String[] args) {
		
		Count("This is new Bus");
	}

}
