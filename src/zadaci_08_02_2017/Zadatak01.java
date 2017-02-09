package zadaci_08_02_2017;

import java.util.ArrayList;

public class Zadatak01 {
	//metoda koja vraca najvecu vrijednost iz liste, ukoliko vrijednost liste nije "null".
	public static Integer max(ArrayList<Integer> list){
		if (list.size()==0||list==null){
			return null;
		}
		int max=list.get(0);
		for(int i=1; i<list.size();i++){
			if (max<list.get(i)){
				max=list.get(i);
			}
		}
		return max;
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		java.util.Scanner input = new java.util.Scanner (System.in);
		ArrayList<Integer> list = new ArrayList<>();
		System.out.print("Unesite broj da biste deklarisali duzinu liste: ");
		int n=input.nextInt();
		//inicijalizacija liste cijelobrojnih brojeva ciji su elementi odabrani 
		//nasumicno i manji od 100,a ciji je broj elemenata zadao korisnik.
		for (int i=0;i<n;i++){
			int number = (int)(Math.random()*100);
			list.add(number);
		}
		//pozivanje metode "max" koja vraca najvecu vrijednost iz proslijedjene liste,
		//i dodjeljivanje te vrijednosti promjenljivoj "maxValue".
		Integer maxValue=max(list);
		if (maxValue!=null){
			System.out.println("Maksimalna vrijednost u listi je: "+maxValue);
		}else {
			System.out.println("Lista ne sadrzi ni jedan elemenat!");
		}
		input.close();
		
	}

}
