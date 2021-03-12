package Com.class05;

import java.util.Scanner;

public class task1Ex2days {

	public static void main(String[] args) {
 Scanner input =new Scanner(System.in);
	
 int day=5;
 
		
		System.out.println("Enter a day");
		day=input.nextInt();
		
		if (day >=1 && day<=5) {
			System.out.println("it is weekday");
			
		} else if (day == 6 || day==7 ) {
			System.out.println("it is weekend");
		
		} else {
			System.out.println("Invalid 5day");
		}
		}
			
		


	}


