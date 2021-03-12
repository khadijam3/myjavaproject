







package Com.class05;

import java.util.Scanner;

public class task1ex1height {

	public static void main(String[] args) {
		
		Scanner input;
		
		int height;
		
		System.out.println("Please enter your height");
		input=new Scanner(System.in);
		height=input.nextInt();

		if(height<60 ) {
			
		}else if(height>60 && height<72) {
			System.out.println(height+" you are a mediam");
		}else if(height<70 && height==90) {
			System.out.println(height+" you are tall");
		}else {
			System.out.println("invalid input");
			}
		
		
	}
			} 
		


		
		


