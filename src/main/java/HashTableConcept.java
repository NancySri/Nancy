import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Set;

import org.apache.xerces.util.SynchronizedSymbolTable;

public class HashTableConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Hashtable ht = new Hashtable();
		ht.put(1, "Tom");
		ht.put(2, "Nancy");
		ht.put(3, "Shashank");
		System.out.println("ht value is " + ht);
		// cloning
		Hashtable h1 = new Hashtable();
		h1 = (Hashtable) ht.clone();
		System.out.println("h1 value is " + h1);

		//ht.remove(2);
		System.out.println("ht value is " + ht);
		if (ht.contains("Shashank"))
			System.out.println("element is found");

		// print all values from hashtable

		Enumeration e = ht.elements();
		while (e.hasMoreElements()) {
			System.out.println(e.nextElement());
		}
		
		//get all values of HashTable
		Set st= ht.entrySet();
		System.out.println(st);
		
		// to compare Two hashTables
		Hashtable h2 = new Hashtable();
		h2.put(1, "Tom");
		h2.put(2, "Nancy");
		h2.put(3, "Shashank");
		
		if(h2.equals(ht))
			System.out.println("Both HashTables are equal");
			System.out.println(ht.hashCode());
		
		
		

	}

}
