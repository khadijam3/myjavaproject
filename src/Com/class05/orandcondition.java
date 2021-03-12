package Com.class05;

import java.util.Scanner;

public class orandcondition {

	public static void main(String[] args) {
		
		
		Scanner input;
		String name;
		int age;
		System.out.println("Please enter your name");
		input=new Scanner(System.in);
		name=input.next();
		System.out.println("Please enter your age");
		age=input.nextInt();
		
		if(age>=1 && age<=3) {
			System.out.println(name+" your are a baby");
		}else if(age>3 && age<=5) {
			System.out.println(name+" your are a bigger baby");
		}else if(age>5 && age<=12) {
			System.out.println(name+" your are a kid");
		}else if(age>12 && age<=19) {
			System.out.println(name+" your are a teenager");
		}else  {
			System.out.println(name+" your are an adult");
		}

	}

}
