package Com.Class04;

public class nastedif {

	public static void main(String[] args) {
	boolean morning=false;
	boolean classToday=false;

	if (morning) {
		System.out.println("let me check if I have Class");
		if (classToday) {
			System.out.println("Goodmoring my classmate");
		}
		else {
			System.out.println("Goodmoring my family");
		}
		System.out.println("-------------End of Code----------");
	}
	System.out.println("----------scond example----------");
	
	boolean anyAllergy =true;
    String Allergy="pollen";
	
	if (anyAllergy) {
	   System.out.println("stay home");
	
	
	if (Allergy=="pollen") {
	   System.out.println(" Take Callratin");
	}
	}else {
		System.out.println("work from home");
	}

	 {
		System.out.println(" no Midication at all");
	}
	 System.out.println(" ------------ third example ----------");
	 
	boolean isFriday =false;
	int day =12;
	
	if(isFriday) {
		System.out.println(" go to movie");
		if(day==13) {
			System.out.println(" I will watch ascary movie");
		}
		else {
			System.out.println(" I will stay home and stady java");
		}
		System.out.println(" done ");
	}
	
	
	}

}
