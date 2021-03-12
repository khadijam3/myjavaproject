package Com.class08;

import java.util.Scanner;

public class task3 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);

		System.out.println("Please enter your start number");
		int start = input.nextInt();
		System.out.println("Please enter your end number");
		int end = input.nextInt();
		int sumOdd=0;
		int sumEven=0;
		for (int i=start; i<=end; i++) {
		if (i % 2 !=0) {
			sumOdd+=i;
		}else {
			sumEven+=i;
		}
	}
	System.out.println("Summ of add numbers from range " +start+ " to "+end+ "is= "+ sumOdd);
	System.out.println("Summ of add numbers from range " +start+ " to "+end+ "is= "+ sumEven);
}
}