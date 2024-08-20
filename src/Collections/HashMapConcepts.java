package Collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class HashMapConcepts {

	public static void main(String[] args) {
		//HashMap is class of the Map Interface
		//It is implements from Map interface
		//It is store value in the from of Key and Value pair
		//It is not allow duplicate keys
		//It is allow duplicate values
		
		HashMap<Integer,String> hm = new HashMap<Integer, String>();
		
		//put method to add value into HashMap
		hm.put(100, "Akshay");
		hm.put(101, "Nirali");
		hm.put(103, "Murti");
		hm.put(104, "Narayan");
		
		System.out.println(hm);
		
		//Retrive keys from HashMap
		
		System.out.println(hm.keySet());
		
		// Retrive only value from Hash Map
		
		System.out.println(hm.values());
		
		//Retrive keys and values pair
		
		System.out.println(hm.entrySet());
		
		//Retrive specific value form HashMap
		
		System.out.println(hm.get(104));
		
		
	for (int k : hm.keySet()) {
		System.out.println(k + "    " + hm.get(k));
	}

}
}
