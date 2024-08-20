package Collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetConcept {

	public static void main(String[] args) {
		//It is class of Set Interface
		//It is implements from set interface
		//It store Hetrogenious data 
		//Not follow insertion order or indexing
		//It is not allow duplicate values
		//It is only allow single null value not allow multiple null value
		
		
	//	Set myset = new HashSet();
		HashSet myset = new HashSet();
		
		myset.add(100);
		myset.add("Kartik");
		myset.add(null);
		myset.add(100);
		myset.add(12.5);
		myset.add(null);
		
		myset.remove(12.5);
		
		System.out.println(myset);
		
		System.out.println(myset.contains(25));

		
		System.out.println("---------Get the specific value from HashSet-----------");
		
		ArrayList mylist = new ArrayList(myset); // store the hashset value into arraylist
		
		System.out.println(mylist); // print the value of aary list
		
		System.out.println(mylist.get(1)); // get the value from array list
		
		
		System.out.println("---------HashSet Read the value using Advance for loop-----------");
		
		for(Object x : myset) {
			System.out.println(x);
		}
		
		System.out.println("---------HashSet Read the value using Iterator-----------");
		
		Iterator it=myset.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
	}

}
