package SeleniumTestProject.SeleniumTestProject;

public class ConstructorWithThisKeyword {
	
	String name;
	String address;
	
	public ConstructorWithThisKeyword(String name, String address) {
		this.name= name;
		this.address= address;
		System.out.println("Name is: " +name);
		System.out.println("Address is: "+address);
	}

	public static void main(String[] args) {
		
		ConstructorWithThisKeyword obj= new ConstructorWithThisKeyword("Nancy","Sector 50, Gurgaon");
	}

}
