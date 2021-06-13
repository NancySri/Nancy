package SeleniumTestProject.SeleniumTestProject;

public class ReverseWordInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="I am Nancy";
		//String str2="Nancy";
		//String str1= s.substring(5,s.length());
		//str1=str1+s.substring(2,4);
		String str2=s.substring(s.indexOf("N"))+" " +s.substring(s.indexOf("a"),4)+" "+s.substring(0,1);
		//CharSequence str3=s.subSequence(s.lastIndexOf(s)s.charAt()));
		
		System.out.println(s.length());
		//System.out.println(str3);
		System.out.println(str2);

	}

}
