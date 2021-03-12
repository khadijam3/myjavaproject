package groupehomework;

public class task3hw {

	public static void main(String[] args) {
		System.out.println("______________Number 3______________________________");
		int[][] number = { { 1, 3, 31, 7 }, { 6, 12, 44, 28 }, { 9, 13, 15, 21 } };
		int sumeven = 0;
		int sumodd = 0;
		for (int row = 0; row < number.length; row++) {
			for (int col = 0; col < number[row].length; col++)
				if (col % 2 != 0) {
					sumodd += number[row][col];
				} else {
					sumeven += number[row][col];
				}
			System.out.println("Sum of even numbers are =" + sumeven);
			System.out.println("Sum of odd numbers are =" + sumodd);
		}
		System.out.println();
		System.out.println("______________________Number 4__________________________");
		String[][] countries = { { "Canada", "United States", "Mexico" }, { "Brazil", "Colombia", "Peru" },
				{ "Germany", "France", "Italy" }, { "Japan", "India", "China", }, { "Nigeria", "Ethiopia", "Egypt" } };
		System.out.println(countries.length); // 5 rows
		System.out.println(countries[0].length);// 3 columns
		for (int r = 0; r < countries.length; r++) {
			for (int c = 0; c < countries[r].length; c++)
				System.out.println(countries[r][c] + ",  ");

	}

}}
