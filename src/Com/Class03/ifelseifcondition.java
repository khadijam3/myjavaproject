package Com.Class03;

public class ifelseifcondition {

	public static void main(String[] args) {
		double num1=10.99;
		double num2=9.99;
		if( num1>num2) {
			System.out.println(" if the price is under "+num1+" it is cheap");
		}else if (num1<num2) {
			System.out.println(" if the price is above "+ num2+" then it is expensiceve");
			
		}else {
			System.out.println(" i dont want to go out in freeing cold");
			// always in if block only one condition will be print based on your condition
			
		}

	}

}
