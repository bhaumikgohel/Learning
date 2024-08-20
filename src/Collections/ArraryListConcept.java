package Collections;

import java.util.ArrayList;
import java.util.Iterator;

public class ArraryListConcept {

	public static void main(String[] args) {
		
		//it is class of List Interface
		//It is Implements from list interface
		//Dynamic Array
		//Hetrogenius data objects allow
		// Indexing are follow - Store value on index basis
		// Multiple null and duplicate value are allow
		
		ArrayList mylist  = new ArrayList();
		
		mylist.add(100);
		mylist.add("Kartik");
		mylist.add(25.5);
		mylist.add(true);
		mylist.add(null);
		mylist.add(120);
		mylist.add(100);
		mylist.add(null);
		
		System.out.println(mylist); // Print value in order (indexing)
		
		//Remove Elements from list
		
		mylist.remove(2); // its remove 25.5 value from list
		System.out.println(mylist);
		
		System.out.println(mylist.get(5)); // its retrive value of index 5
		
		//Change or modify value in arraylist
		
		mylist.set(2, "Vaibhav");
		System.out.println(mylist);
		System.out.println(mylist.get(2));
		
		// Remove multiple value from array list
		
		ArrayList mylist1 = new ArrayList(); // create new arraylist
		
		mylist1.add("Kartik"); // add value into newly creaeted array
		mylist1.add(25.5);
		
		System.out.println(mylist1);
		
		mylist.removeAll(mylist1); // remove all values which is present in arraylist
		
		System.out.println(mylist); // print the array list
		
		
		// Add inbetween value of two index
		
		mylist.add(2, 10000000);
		
		
		System.out.println(mylist);
		
		
		//itterate the value
		
		for(int i=0;i<mylist.size();i++) {
			System.out.println(mylist.get(i));
		}
		
		System.out.println("---------Advamce for loop-----------");
		
		for(Object x : mylist) {
			System.out.println(x);
		}
		
		System.out.println("---------Iterator-----------");
		
		Iterator it = mylist.iterator();
		
		while(it.hasNext()) // its check value present or not in arraylist
		{
			System.out.println(it.next());//it print the value if present 
		}
	
	}

}
