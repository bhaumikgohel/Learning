package javaconcepts;

import java.util.*;

public class HashTable {

	public static void main(String[] args) {
		
		//HashTable is from Table interface
		//Hashtable not allow key & value null
		//Hashtable is in the form of key and value pair
		//Hashtable as compare to slow as Hashmap
		//
		
		String st = "bhaumikaa";
		
		
		
		Hashtable ht = new Hashtable();
		
		ht.put("Aarav","Dash");
		ht.put(1, "Test");
		ht.put("jalay", 0.8);
		ht.put(1,"Test2");
		
		System.out.println(ht);
		
		System.out.println(ht.size());
		
		System.out.println(ht.get(1));
		
		Hashtable<Integer, String> kk = new Hashtable<Integer, String>();
		
		kk.put(1,"Jalay");
		
		System.out.println(kk.get(1));
		
		

		
	}
	

}
