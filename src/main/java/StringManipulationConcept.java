
public class StringManipulationConcept {

	public static void main(String[] args) {
	String s1= new String("My name is nancy");
	String word[]= s1.split(" ");
	
	String rev=" ";
	for(int i=word.length-1;i>=0;i--) {
	 rev= rev+word[i];	
	}
	System.out.println(rev);
	for(int j=1;j<=rev.length()-1;j=j+2) {
	  System.out.println(rev.charAt(j));	
	}

	}
	

}
