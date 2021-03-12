package Com.class10;

import java.util.Scanner;

public class allyscanner {

	public static void main(String[] args) {
	Scanner scan;

	String[] array;
	scan=new Scanner(System.in);
	
	 
	 System.out.println(" how many String elements would yo ike to store"); 
	 int size =scan.nextInt();
	 array =new String[size];
	 
	 for (int i=0; i <size; i++){
		 System.out.println(" please enter a string");
		 array [i]=scan.next();
	 }
				 
	 
	 System.out.println("  --------------lets see what have we stord----------------"); 
	 for (String str:array) {
		
		 System.out.println(str+"");
		 
	 }
	}

}
;