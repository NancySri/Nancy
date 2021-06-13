package SeleniumTestProject.SeleniumTestProject;

import java.util.HashSet;
import java.util.Set;

public class FindDuplicateElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Comparing each element
		String a[]= {"Java","JavaScript", "C", "Python","Java","Python"};
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i].equals(a[j])) {
					System.out.println("Duplicate value is: "+a[i] );	
				}

			}

		}

		System.out.println("*******************");	
		//Second approach to use HashSet
		Set<String> store=new HashSet<String>();
		for(String name:a) {
			if(store.add(name)==false) {
				System.out.println("Duplicate value is: "+name );		
			}
		}
		
		
		
	}

}
