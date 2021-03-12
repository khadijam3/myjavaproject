package Com.class10;

public class taskchararray {

	public static void main(String[] args) {
		
		char[] grade=new char[6];
		grade[0]='A';
		grade[1]='B';
		grade[2]='C';
		grade[3]='D';
		grade[4]='E';
		grade[5]='F';
		System.out.println(grade[1]);
		
		 
		 
		 
		
		System.out.println("---------anther way to create array-----------");
		
		//char[]grades1;
		//grade1= {};
		//it dosent work
	   char[] grades={'A', 'B', 'C', 'B', 'E','F'};
	
	   System.out.println(grade[5]);
	   System.out.println("number of element s in 2 array"+grades.length);
	}

}
