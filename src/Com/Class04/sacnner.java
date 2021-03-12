package Com.Class04;

import java.util.Scanner;

public class sacnner {

	public static void main(String[] args) {
		/* to donate: * you must be 18 and older, otherwise you cannot * your weight must be more than 110 lbs, otherwise you cannot donate */
		Scanner scan;
		int age=30;int weight=140;
		scan =new Scanner(System.in);
		
		
		
		System.out.println("please enter your age");
		scan.nextInt();
		System.out.println("please enter your weithe");
		
		if (age>=18) {
		scan.nextInt();
		if (weight==140) {
				System.out.println("you can donate based on your age and weight");
				
		} else {System.out.println("you weight is too small, you can not donate");
		
		}	
		} else {System.out.println("you age is not eligible");
		}

	}}


