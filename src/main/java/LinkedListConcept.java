import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListConcept {

	public static void main(String[] args) {
	LinkedList<String> l1= new LinkedList<String>();
	l1.add("Java");
	l1.add("Testing");
	l1.add("JavaC");
	l1.add("Python");
	System.out.println(l1);
	l1.addFirst("Nancy");
	l1.addLast("Srivastava");
	System.out.println(l1.get(0));
	System.out.println(l1);
	
	for(int i=0;i<l1.size();i++) {
		System.out.println(l1.get(i));
	}
	
	//using iterator
	System.out.println("***********");
	Iterator<String> it=l1.iterator();
	while(it.hasNext()) {
	  System.out.println(it.next());
	}
	}

}
