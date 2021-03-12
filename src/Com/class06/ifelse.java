package Com.class06;

import java.util.Scanner;

public class ifelse {

	
	public static void main(String[] args) {
		/* time
		 *  1 t-11 mornning
		 * 12-13 noon
		 * 14-17 afternoon
		 * 18-21 eveing
		 * 22-24 night
		 */
  Scanner scan;
  int time;
  String timeOftheday=null;
  
  scan=new Scanner(System.in);
  System.out.println("Please enter the time");
 time = scan.nextInt();
 
 if (time>=1 && time<=11) {
	 timeOftheday="Morning";

 }else if(time>=12 && time<=13) {
	 System.out.println("Noon");
	 
 }else if(time>=14 && time<=17) 
 {
	 timeOftheday="Afternoon";
 }else if(time>=18 && time<=21) 
 {
	 System.out.println("Eveing");
 }else if(time>=22 && time<=24)
 {
	 timeOftheday="Night";
 }else{
	 System.out.println("Invalid");
 }
 System.out.println("Based on enter time, time of the day is "+timeOftheday);
	}

}