package Com.Class03;

public class ifelse2 {

	public static void main(String[] args) {
		
		 // compare 2numbers --possible condition 
		 double num1=20.40;
		 double num2=70.40; 
		 
		 if (num1>num2) {
	
		 System.out.println(" Double value" +num1+ "is larger then" +num2); 
		 }
						  
		  else if(num1<num2) {
			  System.out.println("Double value"+num2+ "is larger then" +num1); 
			 
		 }
		  else {
			  System.out.println( num1+ "is Equal to" +num2); 
			  
			
	 }
	 //2based on day number define days
		 int day=4;
		  if(day==1) {	 
		 
			  System.out.println("Today is Monday");   
		  }
		   else if(day==2){
		 System.out.println("Today is Tuseday");  
	 }

	 else if(day==3){
		 System.out.println("Today is wednseday");  
	 }
	 else if(day==4){
		 System.out.println("Today is Thurseday");  
	 }

	 else if(day==5) {
		 System.out.println("Today is Firday ");  
	 }
	 else if(day==6){
		 System.out.println("Today is Suturday");  
	 }

    else  if(day==7){
	 System.out.println("Today is Sunday");  
     }
    else
    { 	
   	 System.out.println("invalid day");  
   
	}
		  }}

	


