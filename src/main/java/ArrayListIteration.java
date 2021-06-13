import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListIteration {

	public static void main(String[] args) {
		ArrayList<String> ar = new ArrayList<String>();
		ar.add("Game Of Thrones");
		ar.add("Tenet");
		ar.add("Big Bang Theory");
		ar.add("Lucifer");

		// first way of iteration after Java 8 using for each loop and lambda expression
		System.out.println("************Using for each loop and labda expression***********");
		ar.forEach(shows -> {
			System.out.println(shows);
		});

		// using Iterator
		System.out.println("************Using for iTERAtor***********");
		Iterator<String> it = ar.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		// using iterator and java 8 forEachRemaining Method
		System.out.println("************Iteration using iterator and foreachremaing method***********");
		it = ar.iterator();
		it.forEachRemaining(shows -> {
			System.out.println(shows);
		});
		// using for each loop
		System.out.println("************Using for each loop***********");
		for (String shows : ar) {
			System.out.println(shows);
		}

		System.out.println("************Using for each loop by using index/order***********");
		for (int i = 0; i < ar.size(); i++) {
			System.out.println(ar.get(i));
		}

		System.out.println("************Using list iterator for bidirectional traversing***********");
		ListIterator<String> lt = ar.listIterator(ar.size());
		while (lt.hasPrevious()) {
			System.out.println(lt.previous());
		}
	}

}
