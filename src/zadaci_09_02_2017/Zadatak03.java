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
		Path path = Paths.get(fileName); 
		int countWords = 0;
		int countLines = 0;
		int countChars = 0;
		try (BufferedReader reader = Files.newBufferedReader(path)){
			String line;
			while((line=reader.readLine())!=null){
				countLines++;
				String[] words = line.split(" ");
				countWords = countWords + words.length;
				countChars = countChars + line.length();
			}
			System.out.println("Broj linija u fajlu je "+countLines);
			System.out.println("Ukupan broj rijeci u fajlu je "+countWords);
			System.out.println("Ukupan broj karaktera u fajlu je "+countChars);
		}catch (IOException ex){
			ex.printStackTrace();
		}
		
		
		}

}
