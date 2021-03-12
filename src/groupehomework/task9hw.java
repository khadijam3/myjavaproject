package groupehomework;

public class task9hw {

	public static void main(String[] args) {
		
		
		
				int arr[] = { 10, 20, 70, 40, 50, 60,1000,80, 90, 100 };
				int largest = arr[0];
				int secondLargest = arr[0];
				
				System.out.println("The given array is:" );
				for (int i = 0; i < arr.length; i++) {
					System.out.print(arr[i]+" ");
				}
				for (int i = 0; i < arr.length; i++) {
					if (arr[i] > largest) {
						secondLargest = largest;
						largest = arr[i];
					} else if (arr[i] > secondLargest) {
						secondLargest = arr[i];
					}
				}
				System.out.println("\nSecond largest number is:" + secondLargest);
			}
		
}
