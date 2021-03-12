package Com.class11;

public class gropework {

	public static void main(String[] args) {
		int[][] number = { { 1, 3, 31, 7 }, { 6, 12, 44, 28 }, { 9, 13, 15, 21 } };
		int even = 0;
		int odd = 0;
		for (int row = 0; row < number.length; row++) {
			for (int col = 0; col < number[row].length; col++)
				if (col % 2 != 0) {
					odd += number[row][col];
				} else {
			even += number[row][col];
				}
			System.out.println("Sum of even numbers are =" + even);
			System.out.println("Sum of odd numbers are =" + odd);
		}
		System.out.println();
		
		
	}

}
