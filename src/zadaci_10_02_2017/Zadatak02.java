package zadaci_10_02_2017;

import java.util.InputMismatchException;

public class Zadatak02 {
	
	public static double min(double [] array){  //metoda koja vraca najmanju vrijednost iz liste decimalnih brojeva
		
	double min = array[0];                      //dodjeljivanje promjenljivoj "min" vrijednost prvog elementa liste
	
	for (int i=1;i<array.length;i++){           //petlja kojom prolazimo kroz listu i svaki elemenat liste sa promjenljivom "min",
		if(min>array[i]){						//i ukoliko je ta vrijednost manja od "min", ta vrijednost postaje "min".
			min=array[i];
		}
	}
	
	return min;                                 //vrijednost koju vraca metoda
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		java.util.Scanner input = new java.util.Scanner (System.in);
		System.out.println("Unesite deset decimalnih vrijednosti: ");
		double [] array = new double[10];								//definisanje niza decimalnih brojeva sa deset elemenata
		
		try{
			for (int i=0;i<10;i++){											//petljom prolazimo kroz niz i preko
				array[i]=input.nextDouble();								//skenera pokupimo unos za svih deset elemenata niza
			}
		
			double minValue = min(array);									//promjenljivoj "minValue" na osnovu poziva metode "min",  
																			//dodjeljujemo vrijednost koju vraca metoda.
			System.out.println("Minimalna vrijednost liste je: "+minValue);
			
		}catch (InputMismatchException ex){
			System.out.println("Unesite brojeve!");
		}
		
		input.close();
		
	}

}
