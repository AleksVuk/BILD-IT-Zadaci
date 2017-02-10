package zadaci_10_02_2017;

public class Zadatak04 {
	
	public static int[] locateLargest(double [][] matrix){ 
		
		int [] location = new int[2];          				//definisemo niz sa dva elementa (jedan za red, drugi za kolonu)
		 													//najvece vrijednosti 2D niza
		double maxValue = matrix[0][0];             		//promjenljivoj "maxValue" dodjeljujemo vrijednost na poziciji (0,0)
		
		for (int i=0; i<matrix.length; i++){				
			for (int j=0; j<matrix[0].length; j++){					
							
				if (maxValue<matrix[i][j]){					//poredjenje promjenljive "maxValue" sa svakim elementom2D niza
					maxValue=matrix[i][j];					//i smjestanje vece vrijednosti u "maxValue"
					
					location[0]=i;							//red u kom se nalazi najveca vrijednost "maxValue"
					location[1]=j;							//kolona u kojoj se nalazi najveca vrijednost "maxValue"
				}
				
			}
		}
		
		return location;									
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		java.util.Scanner input = new java.util.Scanner (System.in);
		
		System.out.println("Unesite broj redova 2D niza: ");
		int rows = input.nextInt();
		
		System.out.println("Unesite broj kolona 2D niza: ");
		int columns = input.nextInt();
		
		double [][] array = new double[rows][columns];			//definisanje 2D niza sa brojem redova i kolona koje je unio korisnik
		
		System.out.println("Unesite vrijednosti 2D niza: ");	//inicijalizacija 2D niza vrijednostima koje 
		for (int i=0; i<array.length; i++){						//unosi korisnik preko skenera
			for (int j=0; j<array[i].length; j++){
				array[i][j] = input.nextDouble();
			}
		}
		
		int[] location = locateLargest(array);					//pozivanje metode "locateLargest"
		System.out.println("Najveca vrijednost u "
				+ "matrici se nalazi na lokaciji: "+location[0]+", "+location[1]+"." );
		
		input.close();
	}

}
