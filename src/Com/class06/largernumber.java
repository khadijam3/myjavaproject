package Com.class06;

import java.util.Scanner;

public class largernumber {
	/* print 3 number and find the largest number;
	 * 
	 */

	public static void main(String[] args) {
		int num1, num2, num3,Largest;
		 Scanner scan=new Scanner(System.in);
		 System.out.println("Please enter the 3 numbers");
		 num1=scan.nextInt();
		 num2=scan.nextInt();
		 num3=scan.nextInt();
		 if(num1==num2 && num2==num3) {
      System.out.println("all number are equal"); 
		 }
		 if(num1>num3) {
			 Largest=num1; 
			 
		 }else {
			 Largest=num3;
		 }if(num2>num3) {
			 Largest=num2;
		 }else {
			 Largest=num3;
		 }
		 
		 

		 System.out.println("the begest number amang number is "+num1+","+num2+", "+num3+" is " +Largest);

}
	{
		System.out.println("==================end of the code==============");
	}
	
}

