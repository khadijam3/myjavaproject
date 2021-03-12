package Com.class06;

import java.util.Scanner;

public class Ifclasswithnull {

	public static void main(String[] args) {
		/*check what time of the day is 
		 * by adding time ex 1=11--> Morning
		 * 12-13---> noon
		 * 14=17---> afternoon
		 * 18 to 21 ----> evening
		 * 22-24 ---->night
		 */
		Scanner scan;
		int time;
		String timeOftheDay= null;
		scan = new Scanner(System.in);
		System.out.println("Please enter time in 24 hour time format");
		time=scan.nextInt();
		if(time>=1 && time<=11) {
			timeOftheDay="Moring";
		}
		if(time>=12 && time<=13) {
			timeOftheDay="Noon";
		}
		if(time>=14 && time<=17) {
			timeOftheDay="Afternoon";
		}
		if(time>=18 && time<=21) {
			timeOftheDay="Evening";
			
		}if(time>=22 && time<=24) {
			timeOftheDay="Night";
		}
		System.out.println("Based on enter time of the day  you time is "+timeOftheDay);
	}

}
