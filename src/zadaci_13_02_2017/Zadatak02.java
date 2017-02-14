package zadaci_13_02_2017;

public class Zadatak02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int broj1=1+(int)(Math.random()*13);     //generisanje broja karte
		
		int broj2=1+(int)(Math.random()*4);      //generisanje znaka karte
		
		if (broj1==1){
			
			System.out.print("Karta koju ste izvukli je:\"A ");
			
		}else if (broj1==11){
			
			System.out.print("Karta koju ste izvukli je:\"J ");
			
		}else if (broj1==12){
			
			System.out.print("Karta koju ste izvukli je:\"Q ");
			
		}else if (broj1==13){
			
			System.out.print("Karta koju ste izvukli je:\"K ");
			
		}else {
			
			System.out.print("Karta koju ste izvukli je:\""+broj1+" ");
			
		}
		
		if (broj2==1){
			
			System.out.println("u znaku Kocke\"");
			
		}
		
		else if (broj2==2){
			
			System.out.println("u znaku Pik\"");
			
		}
		
		else if (broj2==3){
			
			System.out.println("u znaku Srce\"");
			
		}
		
		else if (broj2==4){
			
			System.out.println("u znaku Djetelina\"");
		}
		
	}

}
