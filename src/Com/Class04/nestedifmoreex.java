package Com.Class04;

public class nestedifmoreex {

	public static void main(String[] args) {
		/*if it is morning === Good morning
		 * if there is a class --- hello class mate
		 * otherwise=------ Hello my family
		 */
		boolean morning=true;
		boolean classtoday=true;
		boolean  sanny=true;
		if (morning) {
			System.out.println("let me check if I have class today");
			if(classtoday) {
				System.out.println("Good marning my classmate");
				if(sanny) {
					System.out.println(" if out is sunny we will go to park and stady there");
				
			}else {
				System.out.println("Good marning my family");
			}
			
		}
		
			
			
			System.out.println("=========end of programm================");
		/*
		 * check assignment and based on the score we display a massage
		 * 
		 */
    boolean completed =true;
    int score=50;
    if (completed) {
    	if(score>90) {
    		System.out.println("great job");
    	}else if(score>80) {
    		System.out.println("Good job");
    	}else if(score<70) {
    		System.out.println("Good but let's try to do better");
    	}else {
    		System.out.println("good for trying but studay more");
    	}
    	
    }else {
    	System.out.println("pleae make sure to  complete your assignment on time");
    }
	}}

}
 	