package Com.class10;

public class allarayement {

	public static void main(String[] args) {
		
		int[] numbers= {10, 11, 14, 78, 5, 90};
		for (int i=0; i<numbers.length;i++)
		{
			if(numbers[i]%2==0)
			
		{
				System.out.print(numbers[i]+" ");
		}
			}
		System.out.println();
		System.out.println(" ----------- print in reverse   ---------------");
		for (int i=numbers.length-1; i>=0; i--)
		{System.out.print(numbers[i]+" ");
		
		}
		
		
		
		
		System.out.println();
		System.out.println(" ----------- print in reverse   ---------------");
		int[] array={45, 78, 12, 67,55, 89, 77, 23, 88};
		for (int i=0; i<array.length;i++)
			{
				if(array[i]%2<=0){
				System.out.print(array[i]+" ");
				
	      }
					}
	
	}
	

}
