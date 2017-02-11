package zadaci_10_02_2017;

import java.util.InputMismatchException;

public class Zadatak03 {

	public static boolean equals(int [] array1, int [] array2){		//metoda koja ispituje da li su dva niza jednaka
		int count = 0;
		
		for (int i=0; i<array1.length; i++){						//petljom pozivamo sve elemnte nizova i poredimo 
			if (array1[i]==array2[i]){								//vrijednosti na istim indeksima dva niza i ukoliko 
				count++;											//su vrijednosti iste povecavamo projac za jedan
			}
		}
		if (count==array1.length){								    //ukoliko se brojac uvecao do broja koji je jednak  
			return true;											//broju elemenata niza znaci da su svi elementi na istim 
		}															//indeksima jednaki kod oba niza, i metoda vraca "true"
		else{
			return false;                                           //u suprotnom metoda vraca "false"
		}
		
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		java.util.Scanner input = new java.util.Scanner (System.in);
		int [] array1 = new int[10];
		System.out.println("Unesite deset cjelobrojnih vrijednosti za prvi niz: ");
		
		try{
			for (int i=0;i<10;i++){										//petljom prolazimo kroz niz i preko skenera pokupimo 
				array1[i]=input.nextInt();								//unos za svih deset elemenata prvog niza
			}
		
			int [] array2 = new int[10];
			System.out.println("Unesite deset cjelobrojnih vrijednosti za drugi niz: ");
		
			for (int i=0;i<10;i++){										//petljom prolazimo kroz niz i preko skenera pokupimo 
				array2[i]=input.nextInt();							 	//unos za svih deset elemenata drugog niza
			}
		
			System.out.println("Dva unijeta niza su jednaka? "+equals(array1,array2)); //poziv metode i stampanje rezulatata 
																				   	   //koji ta metoda vraca
		}catch (InputMismatchException ex){
			System.out.println("Pogresan unos, unesite cijele brojeve!");
		}
		input.close();
	}

}
