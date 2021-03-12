package Com.class06;

import java.util.Scanner;

public class recap {

	public static void main(String[] args) {
		
Scanner scan= new Scanner(System.in);

		String str="hello";
		String str1="Hello";
		 str=scan.nextLine();
	
		boolean yesOrNo=str.equals("Hello");
		System.out.println(yesOrNo);
		boolean yesOrNo1=str1.equalsIgnoreCase(str);
		System.out.println(yesOrNo1);
	}

}