package Com.Class04;

import java.util.Scanner;

public class morescannerexm {

	public static void main(String[] args) {
		 
         
         Scanner scan=new Scanner(System.in);
         int num1;
         int num2;
         System.out.println(" please enter your first number");  
         num1=scan.nextInt();
         System.out.println(" please enter your second number ");  
	       num2=scan.nextInt();
	       if(num1>num2) {
	    	System.out.println(num1+"is larger then"+num2);  
		      
	       }else if(num1<num2) {System.out.println(num1+"is smaller then"+num2);  
	    	   
	       }else {
	    	   System.out.println(num1+" is equal to "+num2 );  
	       }
}
	
	}


