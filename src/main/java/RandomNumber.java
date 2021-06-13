import java.util.Arrays;

public class RandomNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("First random no is " +Math.random());
		System.out.println("Second random no is " +Math.random());
		
		int min=200;
		int max=400;
		double a= Math.random()*(max-min+1)+min;
		System.out.println("Print random no in double: "+a);
		
		int b= (int) (Math.random()*(max-min+1)+min);
		System.out.println("Print random no in int "+b);
		
		int x=23;
		int y=28;
		
		x=x+y;//51
		y=x-y;//51-28=23
		x=x-y;//51-23=28;
		
		System.out.println("Value of x is "+x+"Value of y is "+y);		
		factorial();
		fibonacci();
		greatestno(100, 300,200);
		largesttwo();
		revNum();
	}
	
	public static void factorial() {
		int num =5;
		int fact=1;
		for(int i=1;i<=num;i++) {
			fact=fact*i;
		}
		System.out.println("Factorial of 5 is "+fact);
	}
	
	public static void fibonacci() {
		int firstterm=0;//0,1,1,2,3,5,8---
		int secondterm =1;
		int n=10;
		for(int i=0;i<=n;i++) {
		System.out.println(firstterm + ", ");
		int nextterm=firstterm+secondterm;//0+1=1
		firstterm=secondterm;//1
		secondterm=nextterm;
		//System.out.print(nextterm);
		}				
	}
	
	 public static void greatestno(int a, int b, int c) {
		 if(a>b & a>c) {
			 System.out.println("a is greatest "+a);
		 }
		 else if(b>c){
			 System.out.println("b is greatest "+b);	 
		 }
		 else
		System.out.println("c is greatest "+c);
				 
	 }
	 
	 public static void largesttwo() {
		int a[]= {1,3,5,6,9,8};
		Arrays.sort(a);
		for(int i=0;i<a.length;i++) {
		System.out.print(a[i]+ " ,");
		}
		System.out.println("First Largest value in an array is "+a[a.length-1]);
		System.out.println("Second Largest value in an array is "+a[a.length-2]);
	 }
	 
	 public static void revNum() {
		 int num=1234;
		 int rev=0;
		 int remainder;
		 while(num!=0) {
	     remainder=num%10;	//4 
		 rev=rev*10+remainder;	//0*10+4=4
		 num=num/10; //123
		 }
		 System.out.println(rev);
	 }

}
