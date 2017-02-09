package zadaci_08_02_2017;

import java.util.ArrayList;

public class Zadatak05 {
	//metoda koja vraca maksimalnu vrijednost iz liste
	public static int max(ArrayList<Integer> list){
		int max=list.get(0);
		for(int i=1;i<list.size();i++){
			if (max<list.get(i)){
				max=list.get(i);
			}
		}
		return max;
	}
	//metoda koja broji broj ponavljanja vrijednosti iz liste
	public static int count(ArrayList<Integer> list, int max){
		int count=0;
		for (int i=0;i<list.size();i++){
			if (max==list.get(i)){
				count++;
			}
		}
		return count;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		java.util.Scanner input = new java.util.Scanner (System.in);
		ArrayList<Integer> list = new ArrayList <>();
		System.out.println("Unesite brojeve (0 prekida unos): ");
		int number=1;
		//unos cijelih brojeva i inicijalizacija liste unesenim brojevima (do unosa broja 0 koji prekida unos).
		while (number!=0){
			number=input.nextInt();
			list.add(number);
		}
		//pozivanje metoda "max" i "count" da bi dobili najveci broj u listi i broj njegovih ponavljanja.
		int maxValue = max(list);
		int countMax = count(list, maxValue);
		System.out.println("Najveci uneseni broj je "+maxValue+" i pojavio se "+countMax+" puta.");
		input.close();
	}

}
