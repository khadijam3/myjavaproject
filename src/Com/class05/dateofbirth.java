package Com.class05;

import java.util.Scanner;

public class dateofbirth {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter your birth month ");
		String month=scan.next();
		String season;
		
		if(month.equals("December ") ||  month.equals(" January ") || month.equals(" February ")){
			
			System.out.println("Winter ");
		 }else if(month.equals("March")  ||  month.equalsIgnoreCase("April") || month.equals("May")){
			 System.out.println("Spring ");
			
	     }else if(month.equals("June")  ||  month.equals("July") || month.equals("Augest")){
	    	 System.out.println("Summer ");
			
	     }else {
	    	 System.out.println("Autumn");
	
		

	}

}
}