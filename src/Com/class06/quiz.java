package Com.class06;

import java.util.Scanner;

public class quiz {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int score;
		char grade;
		System.out.println("Please enter your score");
		score=scan.nextInt();
		
		if(score==90) {
			grade='A';
			
		}else if (score>=70 && score<90) {
			grade='B';
			
		}else if(score>=50 && score<70) {
			grade='C';
			
			
		}else {
			grade='F';
			
		}if(grade=='A') {
			System.out.println("Iam happy");
			
			
		}else if(score>=25 && score<=45){
		      System.out.println("Your grade is "+'E');
		    }else if(score>=45 && score<=50){
		      System.out.println("Your grade is "+'D');
		    }else if(score>=50 && score<=60){
		      System.out.println("Your grade is "+'C');
		    }else if(score>=60 && score<=80){
		      System.out.println("Your grade is "+'B');
		    }else if(score>80 && score<=100){
		      System.out.println("Your grade is "+'A'); 
		   
		
	}else{
		
		System.out.println("Your grade is "+"F");
		System.out.println(" i am happy"+"A");
	}
		}

	}


