package zadaci_08_02_2017;

public class Zadatak04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//deklarisanje brojaca za svaki broj od 0 do 9
		int count0=0;
		int count1=0;
		int count2=0;
		int count3=0;
		int count4=0;
		int count5=0;
		int count6=0;
		int count7=0;
		int count8=0;
		int count9=0;
		//generisanje 100 nasumicnih brojeva izmedju 0 i 9
		for (int i=0;i<100;i++){
			int number = (int)(Math.random()*10);
			//uvecavanje brojaca za 1 za svako pojavljivanje odredjenog broja
			switch (number){
			case 0: count0++;
			break;
			case 1: count1++;
			break;
			case 2: count2++;
			break;
			case 3: count3++;
			break;
			case 4: count4++;
			break;
			case 5: count5++;
			break;
			case 6: count6++;
			break;
			case 7: count7++;
			break;
			case 8: count8++;
			break;
			case 9: count9++;
			break;
			}
		}
		//ispis broja pojavljivanja za svaki broj
		System.out.println("Broj 0 se pojavio "+count0+" puta.");
		System.out.println("Broj 1 se pojavio "+count1+" puta.");
		System.out.println("Broj 2 se pojavio "+count2+" puta.");
		System.out.println("Broj 3 se pojavio "+count3+" puta.");
		System.out.println("Broj 4 se pojavio "+count4+" puta.");
		System.out.println("Broj 5 se pojavio "+count5+" puta.");
		System.out.println("Broj 6 se pojavio "+count6+" puta.");
		System.out.println("Broj 7 se pojavio "+count7+" puta.");
		System.out.println("Broj 8 se pojavio "+count8+" puta.");
		System.out.println("Broj 9 se pojavio "+count9+" puta.");
		
	}

}
