package zadaci_09_02_2017;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Zadatak03 {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		String fileName = args[0];        
		Path path = Paths.get(fileName);    //deklarisanje putanje do fajla
		int countWords = 0;
		int countLines = 0;
		int countChars = 0;
		try (BufferedReader reader = Files.newBufferedReader(path)){   //buffered reader koristimo za citanje iz fajla
			String line;
			while((line=reader.readLine())!=null){    //citanje iz fajla dok ne naidjemo na praznu liniju u fajlu
				countLines++;                         //pri svakom citanju linije uvecavamo brojac linija
				String[] words = line.split(" ");     //procitanu liniju splitujemo po "space" i rijeci smjestamo u niz
				countWords = countWords + words.length;   //uvecavanje broja rijeci u fajlu za broj elemenata niza "words"
				countChars = countChars + line.length();  //uvecavanje brojaca karaktera za duzinu stringa "line"
			}
			System.out.println("Broj linija u fajlu je "+countLines);
			System.out.println("Ukupan broj rijeci u fajlu je "+countWords);
			System.out.println("Ukupan broj karaktera u fajlu je "+countChars);
		}catch (IOException ex){
			ex.printStackTrace();
		}
		
		
		}

}
