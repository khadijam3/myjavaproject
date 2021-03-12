package groupehomework;

public class task2hw {

	public static void main(String[] args) {
		System.out.println("_____________________Number 2_________________________________");
		int[][] nums = { { 2, 4, 12, 18, }, { 1, 13, 27, 89 }, { 26, 47, 10, 53 },
		};
		System.out.println(nums.length);// 3 rows
		System.out.println(nums[0].length);// columns
		System.out.println("__________________First way________________________________");
		System.out.println("Print even numbers");
		for (int r = 0; r < nums.length; r += 2) {
			for (int c = 0; c < nums[r].length; c++) {
				if (r % 2 == 0 || c % 2 == 0) {
					System.out.print(nums[r][c] + ", ");
	}

			}}}}
