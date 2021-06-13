import java.util.Scanner;

public class Problems {

	public static void main(String[] args) {
		
		reversestring();
		//printAnInt();
		addNumber(30,50);
		floatingMultiplication(2.3f, 5.6f);
		quotientAndRemainder(30,4);
		swapnos();
		checkEvenorOdd();
		factorial();
		reverseno(198);
	}
	
	public static void reversestring(){
		String s="My name is Nancy";
		String word[] = s.split(" ");
		String rev=" ";
		for(int i=word.length-1;i>=0;i--) {
			rev=rev+" "+word[i];
		}
		System.out.println("Reversed String value is: "+rev);
	}
	
	/*public static void printAnInt() {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter any no:");
		int num=sc.nextInt();
		System.out.println("You entered :"+num);
	}*/

	
	public static void addNumber(int a, int b) {
		int c= a+b;
		System.out.println("Sum of two nos are: "+c);
	}
	
	public static void floatingMultiplication( float x, float y) {
		float mul= x*y;
		System.out.println("Multiplication of two floating nos are "+mul);
	}
	
	public static void quotientAndRemainder(int dividend, int divisor) {		
		int quotient= dividend/divisor;
		int remainder= dividend%divisor;
		System.out.println("Quotient is: "+ quotient);
		System.out.println("Remainder is: "+ remainder);
	}
	
	public static void swapnos() {
		int a=50;
		int b=30;
		a=a+b;//80
		b=a-b;//80-30=50
		a=a-b;//80-50=30;
		System.out.println("Swapped value of a is: "+a);
		System.out.println("Swapped value of b is: "+b);
	}
	
	public static void checkEvenorOdd() {
		Scanner reader= new Scanner(System.in);
		System.out.println("Enter no: ");
		int num= reader.nextInt();		
		if(num%2!=0) {
		System.out.println("Entered no "+num+" is odd");	
		}
		else
		System.out.println("Entered no "+num+" is even");	
	}
	
	public static void factorial() {
		int num=10;//5*4*3*2*1
		int fact = num;
		for(int i=1;i<num;i++) {
			fact=fact*(num-i);//5*4,5*4*3			
		}
		System.out.println("Factorial of a "+ num+ " is " +fact);	
	}
	
	public static void reverseno(int num) {
		int rem=0;
		int quotient=0;
		rem =num%10;//642%10=2
		quotient=num/10;//642/10=64;
	    int rev= rem*100+(quotient%10)*10+quotient/10;//200+40+
		System.out.println("Reverse no is "+rev);
		
	}
	}

