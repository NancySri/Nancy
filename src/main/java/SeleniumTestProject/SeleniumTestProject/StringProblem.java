package SeleniumTestProject.SeleniumTestProject;

public class StringProblem {

	public static void main(java.lang.String[] args) {
		// TODO Auto-generated method stub
         String s="My name is Nancy Srivastava";
         //First Method to reverse word in a string
         String word[] =s.split(" ");
         String rev=" ";
         for(int i=word.length-1;i>=0;i--) {
        	 rev=rev+" "+word[i];       	
         }
         System.out.println(rev);
         
         //Second method
         String s1="My name is Nancy Srivastava";
         StringBuffer sf= new StringBuffer(s1);
         System.out.println(sf.reverse());
	}

}
