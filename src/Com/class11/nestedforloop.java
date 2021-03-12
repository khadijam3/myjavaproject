package Com.class11;

public class nestedforloop {

	public static void main(String[] args) {
		int[][] numbers={
			{10,20,30,40,},
			{90,80,},
			{1,2,3,4,5,6,7}
			};
			 System.out.println(numbers.length); 
			 System.out.println(numbers[0].length); 
			for(int row=0;row<numbers[row].length;row++) {
				for(int col=0; col<numbers[row].length; col++){
					
					 System.out.println(numbers[row][col]+"   "); 	
				}
				
			}
			System.out.println(); 	
				 System.out.println("========================================");
				 for (int[] array:numbers) {
					 for( int arr:array)
					 System.out.println(arr+" "); 
					 
				 }
				 
				 
			}

	
}

