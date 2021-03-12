package groupehomework;

public class task1hw {

	public static void main(String[] args) {
		
		System.out.println("__________________Number 1__________________________");
		int[][] numbers = { { 1, 2, 3, }, { 4, 5, 6 }, { 7, 8, 9, } };
		int sum = 0;
		for (int row = 0; row < numbers.length; row++) {
			for (int col = 0; col < numbers[row].length; col++) {
				System.out.println(numbers[row][col] + " ");
				{
					sum += numbers[row][col];
				}
			}
			System.out.println("Sum of all numbers are " + sum);
		}
		System.out.println();
	}

}
