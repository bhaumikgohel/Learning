package javaconcepts;

import java.util.HashMap;
import java.util.Map.Entry;


public class Concept_HashMap {

	public static void main(String[] args) {
		
		
		HashMap<Integer, String> h1 = new HashMap<Integer, String>();
		
		h1.put(1, "Kartik");
		h1.put(2,"Jalad");
		h1.put(3, "Ashirwad");
		h1.put(null, null);
		h1.put(5, "Ashirwadi");
		
		
		for(Entry m : h1.entrySet()) {
			m.getKey();
			System.out.println(m.getKey() + " "+ m.getValue());
		}
		
		System.out.println(h1.get(null)+"********************");
		
		System.out.println(h1.remove(null)+"----------------");
		
		for(Entry m : h1.entrySet()) {
			m.getKey();
			System.out.println(m.getKey() + " "+ m.getValue());
		}
		
		HashMap<Integer,employee>h2 = new HashMap<Integer, employee>();
		
		employee e1 = new employee("Bhaumik", 29, "Admin");
		employee e2 = new employee("Jagdish", 28, "QA");
		employee e3 = new employee("Aarav", 14, "Loan");
		
		h2.put(1,e1);
		h2.put(2,e2);
		h2.put(3,e3);
		
		for(Entry<Integer, employee> m : h2.entrySet()) {
			
			int key = m.getKey();
			employee e = m.getValue();
			
			System.out.println("Employee "+ key +" Info: ");
			System.out.println("Name : "+e.name + " Age: " + e.age + " Department: "+e.depart);
			
		}
				
}
	
}
