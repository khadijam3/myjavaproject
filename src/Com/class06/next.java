package Com.class06;

import java.util.Scanner;


public class next {

	

	public static void main(String[] args) {
		/*final price after discount
		 * we check there is sale
		 * if no sale we are not going for shopping
		 * if there is sale 
		 * we will ask the item
		 * we will ask price
		 * if price is less 10--- apply 5% discount
		 * if price is less 10 to 100--- apply 10% discount
		 * if price is less 100 to500--- apply 20% discount
		 * if price is less 500--- apply 30% discount
		 * 
		 * which item you purchase  what was original price and what discount applies and final price
		 
		 */
Scanner input;
double price, discount=0, finalprice=0;
String item;
input=new Scanner(System.in);
System.out.println("Is there a sale");
boolean sale =input.nextBoolean();


	if(!sale) {
		System.out.println("iam not going for shipping");
		
	}else {System.out.println("do you have the item");
		item=input.next();
		{System.out.println("what is the price of the item");
		price=input.nextDouble();
		if(price<10) {
			discount=price*0.5;
			finalprice=price-discount;
		}else if(price>=10 && price<=100) {
			discount=price*0.1;
			finalprice=price-discount;
		}else if(price>=100 && price<=500) {
			discount=price*0.20;
			finalprice=price-discount;
	}else if(price>=500) {
		discount=price*0.30;
		finalprice=price-discount;
	}
		
		System.out.println("you are buying "+item+" with oragenal price ="+ price+" after discount "+discount+" you final price is ="+finalprice);
	}if(price<10) {
		discount=price*0.5;
		
	}else if(price>=10 && price<=100) {
		discount=price*0.1;
		
	}else if(price>=100 && price<=500) {
		discount=price*0.20;
		
}else if(price>=500) {
	discount=price*0.30;
	
}
	finalprice=price-discount;
	System.out.println("you are buying "+item+" with oragenal price ="+ price+" after discount "+discount+" you final price is ="+finalprice);
if (finalprice>500) {
	System.out.println("Iam not doing crazy shoping");
}
	
}
		}
	}
	
	




	
	
		
	



