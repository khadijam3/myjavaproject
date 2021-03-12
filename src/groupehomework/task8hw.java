package groupehomework;

public class task8hw {

	public static void main(String[] args) {
		System.out.println();
		System.out.println("_________________Number 8__________________");
		
		int arr[] = {32, 14, -24, 0, -32, 95, -33, 29, 7};		
		   int max = arr[0];
		   int min = arr[0];
		 
		   for(int b = 1; b < arr.length; b++){
		     if(max < arr[b]){
		       max = arr[b];
		     }else if(min > arr[b]){
		       min = arr[b];
		     }		   		
		   }
		   System.out.println("Maximum number = " + max);
		   System.out.println("Minimum number = " + min);
		  
	}

}
