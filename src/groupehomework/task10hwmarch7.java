package groupehomework;

public class task10hwmarch7 {

	public static void main(String[] args) {
	
		int[] arrayOfNumbers = {1, 1, 2, 3, 5, 8, 13, 21, 34, 55}; // create an array with 9 elements
		int biggestNumber = 0; // just create an integer with 0
		int secondBiggestNumber = 0; // just create an integer with 0
		for (int i : arrayOfNumbers) { // in this loop we found biggest number
		if (i > biggestNumber) { //if i bigger than previous biggestNumber value
		biggestNumber = i; // make i biggestNumber
		{
			}
		}
		}
		for (int i : arrayOfNumbers) { // this loop will find a second biggest number
		if (i < biggestNumber) { // if i less tan biggest number
		secondBiggestNumber = i; // make secondBiggestNumber equals i
		}
		}
		
		System.out.println("The biggest number in array: " + biggestNumber);
		System.out.println("The second biggest number in array" + secondBiggestNumber);
		System.out.println("Smallest value of an array is: " + arrayOfNumbers[0]);
		{
	}

}}
