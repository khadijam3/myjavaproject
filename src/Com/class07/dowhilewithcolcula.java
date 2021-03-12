package Com.class07;

import java.util.Scanner;

public class dowhilewithcolcula {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int money;
		System.out.println("please pay for the soda");
		do {
		 money=scan.nextInt();
		 if(money <3) {
			 System.out.println("please give me more it is not enogh");
			 
		 }else if(money!=3) {
			 System.out.println("  here is the change ");
		 }
			 }while(money!=3);
		     System.out.println(" here is your soda");
			 System.out.println(" thanks for shopping");
	
		}

	
	}



	
	
	
	
	
	
	