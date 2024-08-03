package javaconcepts;
import java.util.*;

public class ArryList {

	public static void main(String[] args) {
		
		ArrayList ab = new ArrayList();
		
		ab.add("Test");
		ab.add(300);
		ab.add(1.1);
		ab.add(50);
		ab.add('M');
		
		System.out.println(ab.size());
		
		for (int i=0;i<ab.size();i++) {
			
			System.out.println(ab.get(i));
	
		}
		
		ArrayList<String> jk = new  ArrayList<String>();
		
		jk.add("Arav");
		jk.add("Darshan");
		jk.add("Darsh");
		jk.add("Jalay");
		
		for (int i=0;i<jk.size();i++) {
			
			System.out.println(jk.get(i));
	
		}
		
	}

	

}
