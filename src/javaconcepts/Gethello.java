package javaconcepts;

import java.util.List;

public class Gethello {

	public static void main(String[] args) {
		
		String[] word = {"Hello Word"};
		
		String l1 = word[0];
		
		String[] l2 = l1.split("\\s+");
	
		for (String value : l2) {
            System.out.println(value);
        }
		
	}

}
