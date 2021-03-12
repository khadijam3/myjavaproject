package Com.Class04;

public class NESTEDIF {

	public static void main(String[] args) {
		int temperture=76;
		boolean sunny=true;
		 // is the tem is 76 condition is ture and if it is sanny
		if (temperture==95) {
			System.out.println("it is hot day today");
			if (sunny==true) {System.out.println("i will go shopping"); 
			}else {
				System.out.println("i will go rusturunt with my friend"); 
			}
		}else {
			System.out.println(" is  not hot today");
			
			if (sunny==false) {System.out.println(" i will stay home"); 
			}else {
				System.out.println("  i will do java practice "); 
		}
	}
	}
}
