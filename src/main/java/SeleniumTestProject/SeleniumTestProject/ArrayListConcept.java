package SeleniumTestProject.SeleniumTestProject;

import java.util.ArrayList;
public class ArrayListConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList ar = new ArrayList();
		ar.add(12);
		ar.add(132);
		ar.add(18);
		System.out.println(ar.size());
		ar.add(12);
		for(int i=0;i<ar.size();i++) {
			System.out.println(ar.get(i));	
		}
		

	}

}
