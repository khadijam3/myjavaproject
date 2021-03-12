package Com.class05;

import java.util.Scanner;

public class quise {

	public static void main(String[] args) {
		Scanner input;
		int quiz;
		int midTerm;
		int finalScore;
		
		input=new Scanner(System.in);
		System.out.println("Enter your quiz score");
		
		quiz=input.nextInt();
		
		System.out.println("Enter your Mid Term score");
		
		midTerm=input.nextInt();
		
		System.out.println("Enter your Final score");
		
		finalScore=input.nextInt();
		
		
		int average=((quiz+midTerm+finalScore)/3);
		
		if (average >= 90) {
			System.out.println("Grade A");
		}else if (average >= 70 && average <90) {
			System.out.println("Grade B");
		}else if (average >= 50 && average <70) {
			System.out.println("Grade C");				
		}
		else if (average < 50) {
			System.out.println("Grade F");
		}else
			System.out.println("System Error");
	}


	}


