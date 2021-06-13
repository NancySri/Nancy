import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapInterfaceConcept {

	public static void main(String[] args) {
		HashMap<Integer, String> hm= new HashMap<Integer, String>();
		hm.put(1,"Name");
		hm.put(2,"Nancy");
		hm.put(3,"Shashank");
		System.out.println(hm.get(1));
		
		for(Entry m: hm.entrySet()) {
			System.out.println(m.getKey()+" "+m.getValue());
		}
		
		HashMap<Integer,Employee> emp= new HashMap<Integer, Employee>();
	    Employee emp1= new Employee("Nancy",12,"QA");
	    Employee emp2= new Employee("Netrika",12,"Dev");
	    emp.put(1,emp1);
	    emp.put(2,emp2);
	    
	    for(Entry<Integer,Employee> m: emp.entrySet()) {
	    	 Employee  e = m.getValue();
	    	System.out.println(m.getKey()+" "+e.name+" "+e.age+" "+e.dep);
	    }

	}

}
