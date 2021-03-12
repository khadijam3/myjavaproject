package groupehomework;

public class task6hw {

	public static void main(String[] args) {
		System.out.println();
	    System.out.println("_____________________Number 6________________________");
	   
	    int num = 29;
		   boolean value = true;
		   for (int i = 2; i <= num / 2; ++i) {
		 
		     if (num % i == 0) {
		       value = false;
		       break;
		     }
		   }
		   if (!value)
		     System.out.println(num + " is not a prime number.");
		   else
		     System.out.println(num + " is a prime number.");
		  	
}}
