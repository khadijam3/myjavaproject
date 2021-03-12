package Com.class07;

import java.util.Scanner;

public class culculationtionwithswitch {

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		System.out.println("please enter 2 number");
		double num1=scan.nextDouble();
		double num2=scan.nextDouble();
		System.out.println("please enter your oper");
		char oper=scan.next().charAt(0);
		double  result;
		switch(oper) {
		case '+':
			result=num1+num2;
			break;
		case '-':
			result=num1+num2;
			break;
		case '*':
			result=num1+num2;
			break;
		case '/':
			result=num1+num2;
			break;
			default:
				result=0;
				System.out.println(" you entrered invalid operator ");
				
		
	}System.out.println(num1+""+ oper+" "+num2+"=" +result);
	}
	
}
