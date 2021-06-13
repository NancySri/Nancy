package SeleniumTestProject.SeleniumTestProject;

public class ConstructorConcept {
	
	public  ConstructorConcept() {
		System.out.println("Default Constructor");
	}
	
	public  ConstructorConcept(int i) {
		System.out.println("Single param Constructor");
		System.out.println(i);
	}
	
	public  ConstructorConcept(int i, int j) {
		System.out.println("two param Constructor");
		System.out.println(i);
		System.out.println(j);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConstructorConcept obj= new ConstructorConcept();
		ConstructorConcept obj1= new ConstructorConcept(12);
		ConstructorConcept obj2= new ConstructorConcept(12,45);
		
	}
	

	
		

}
