package Com.class10;

public class arrayIntor {

	public static void main(String[] args) {
	
      int num=10;
		num=20;
   int[] array= new int[5];
	
	array[0]=10;
	array[1]=12	;	
	array[2]=15;
    array[3]=9;	
    array[4]=13;	
    System.out.println(array[2]+array[3]);
    
   double[] numbers=new double[2];
   numbers[0]=10.99;
   numbers[1]=10.09;
   numbers[0]=11.99;
   System.out.println(numbers[0]);
   
   String[] names=new String[3];
   names[0]="janzib";
   names[1]="ozda";
   //names[2]="Alice";
   //names[3]="khaidja";
   System.out.println(names[2]);
   int[] nums=new int[4];
   System.out.println(nums[1]);
   
   boolean b[]=new boolean[3];
   b[0]=true;
   b[1]=true;
   b[2]=false;
   
   System.out.println(b[2]);
  int size=b.length;
  System.out.println("Size of any array is "+size);
}
}
		
