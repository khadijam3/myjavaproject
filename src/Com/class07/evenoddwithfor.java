package Com.class07;

public class evenoddwithfor {

	public static void main(String[] args) {
		int sumeven=0;
		int sumodd=0;
		for (int i=1;i<=50;i++) {
			if(i%2==0) {
				sumeven+=i;
			}else {
				sumodd+=1;
			}
				
			
		}
		System.out.println("sum of the even number"+sumeven);
		System.out.println("sum of the even number"+sumodd);
	}

}
