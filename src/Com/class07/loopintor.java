package Com.class07;

public class loopintor {

	public static void main(String[] args) {
		System.out.println("Hello");
		System.out.println("Hello");
		System.out.println("Hello");
		System.out.println("Hello");
		System.out.println("Hello");
		
		
		
		System.out.println("===========================================");
		int time=6;
		if(time<12) {
			System.out.println("Hello");// code executed only one time
		}
		
		System.out.println("======================whileLOOP====================");
		
		while(time<=12) {
			System.out.println("Hello");// code runs forever  why my condition always true runs for ever 
			                              //in in order to stop the  while loop we need to change condition
			time++;
			}

		System.out.println("=====================Pirnt numbers from 1 to 10====================");
		int num=1;
		while(num<=11) {
		System.out.print(num+" ");
		num++;
		}
		
		System.out.println();
		System.out.println("====================pring from 20 to 40====================");
		num=20;
		while(num<=40) {
			System.out.print(num+" ");
			num++;
			
			}
		System.out.println();
		System.out.println("===================== from 10 to 1====================");
			
			int a=10;
			while(a>=1) {
				System.out.print(a+" ");
				a--;// if  variable is out of block it print end number of time case 
		}
		
		}
	}


