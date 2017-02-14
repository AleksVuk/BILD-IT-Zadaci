package zadaci_13_02_2017;

public class Zadatak03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		java.util.Scanner input = new java.util.Scanner(System.in);
		
		System.out.print("Unesite prvu receicu: ");
		String line1 = input.nextLine();
		
		System.out.print("Unesite drugu recenicu: ");
		String line2 = input.nextLine();
		
		String equalSymbols = "";								//string na koji dodajemo jednake znakove poredjenih stringova
		
		int border = Math.min(line1.length(), line2.length());  //uzimamo vrijednost kraceg stringa da ogranicimo ponavljanje petlje
		
		for (int i=0; i<border; i++){
			
			char letter1 = line1.charAt(i);
			
			char letter2 = line2.charAt(i);
			
			if (letter1==letter2){
				
				equalSymbols += letter1;						//dodavanje jednakih znakova u string
				
			}else{
			
				break;											//razliciti znakovi na istim pozicijama (i) u stringovima prekidaju rad petlje
				
			}
			
		}
		
		if (equalSymbols.equals("")){
			
			System.out.println("Dvije unesene recenice nemaju zajednickog prefiksa!");
				
		}else{
			
			System.out.println("Najveci zajednicki prefiks za unesene recenice je: ");     
			System.out.println(equalSymbols);
			
		}
		
		input.close();
		
	}

}
