package SeleniumTestProject.SeleniumTestProject;

public class StringRotation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1= "India";
		String s2= "diai";
		System.out.println(checkrotation(s1,s2));
		

	}
	
	public static boolean checkrotation(String s1, String s2) {
		String temp=s1+s1;//IndiaIndia
		if(temp.indexOf(s2)!=-1) {
			return true;
		}
		else {
			return false;
		}
		
	}

}
