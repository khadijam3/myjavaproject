package groupehomework;

public class task4hw {

			
				
				public static void main(String[] args) {
					
					//Create 2D array of countries: north America countries, south America countries, 
					//Europe countries, Asian countries, African countries. 
					//Then print all values from that array using 2 different loops and 
					//calculate how many total countries have been stored.
					
					int count=0;
					String[][] countries= { {"North America","south America","Europe","Asian", "Africa"},
							               {"Jamica ", "Casta Rico","Haiti"},
					                       {"Brazil","Chily", "Colambia"},
					                       {" Germany","France", "Denmark"},
					                       {" China", "Afghanistan","India"},
					                       {" Eygpt", "South Africa", "Moracco"}
					
				         };
					
				  
					
					for(int r=0; r<countries.length; r++) {
				  for(int c=0; c<countries[r].length; c++){
					 
					 
					  System.out.println(countries[r][c]+"  ");
					  
				  }
				  System.out.println();
					}
				  System.out.println("==================Nasted Loop===============");
				  
				  for(String[] con:countries)  {
					for( String country:con) {
						System.out.println(country);
					count++;
						
					  }
					System.out.println();
				  }
				
					  
					  System.out.println("Number of elements in 6 array "+count);

					}}
				
				
				

