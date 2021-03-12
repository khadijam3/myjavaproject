package Com.Class04;

import java.util.Scanner;

public class task06nstedif {

		public static void main(String[] args) {
				
	 int balance;
	 Scanner scan;
	 scan=new Scanner(System.in);
	 System.out.println(" Do you have credit card");
	 balance=scan.nextInt();
	
		     if (balance==1000){
			  System.out.println(" How much is the balance" );
			  System.out.println("Your credit larger then "+'$' +balance);
			
			  if(balance<1100) {
			System.out.println(" you should pay off immediately ");
				
			  }if(balance<900) {
				  System.out.println("Spend more");
			  } }else {
					
				  System.out.println(" Please fillout application for creditcard");	
			  }
			  {
			  System.out.println(" ======Task2 Example 2===========");
			 
				  }
		     int  years=5;
		     int salary=60000;
		     if (years>=5) {
		    	  System.out.println(" your eligible for bonus");
		    	  if(salary>60000 ) {
		    		  System.out.println(" your eligible for 5000 bonus");
		    		  
		    	  }else {
		    		  System.out.println(" your eligible for 3000 bonus"); 
		    	  }
		     }else {
		    	 System.out.println(" your not eligible for bonus");
		 
		  
		      
		    	  
		      }
		  
		}
			  
		  }

	


