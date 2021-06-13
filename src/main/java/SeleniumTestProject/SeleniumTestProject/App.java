package SeleniumTestProject.SeleniumTestProject;

import java.util.Arrays;

/**
 * Hello world!
 *
 */
public class App 
{
	
	
    public static void main( String[] args )
    {
       
//    	 String str1="India";
//         String str2= "diaI";
//        int l1= str1.length();
//        int l2=str2.length();
//         if(checkrotation (str1, str2)) {
//        	 System.out.println(" Yes");
//         }
//         else {
//        	 System.out.println("No"); 
//         }
//        
//    }
//    
//    
//    public  static boolean checkrotation(String str1, String str2) {
//    	String temp= str1+str1;
//        if(temp.indexOf(str2)!= -1) {
//        	return true;
//        }
//        else {
//        	return false;
//        } 
//    }
    	
     int i[] = {1,2,3,5,4}; 
     int size= i.length;
    // int temp;
     Arrays.sort(i);
     System.out.println(i[i.length-1]);//it will print largest no in an array
     System.out.println(i[i.length-2]);// it will print second largest no in an array
     
//     for(int j=0;j<=size; j++) {
//    	 for(int k=j+1;k<size;k++) {
//    		if(i[j]>i[k]) {
//    			temp= i[j];
//    			i[j]=i[k];
//    			i[k]=temp;
//    		}
//    	 }
//    	 System.out.println("largest value will be:"+i[size-1]);
     }
}
