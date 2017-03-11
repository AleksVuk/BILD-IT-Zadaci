package zadaci_10_03_2017;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class Zadatak04 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		boolean works = true;
		
		while (works){
			System.out.print("Enter the file name (zadatak03.txt): ");
			String fileName = input.next();
			input.nextLine();
			Path path = Paths.get(fileName);
			
			//check does file exists
			if(!Files.exists(path)){
				System.out.println("File doesn't exists");
				continue;
			}
			
			works = false;
			
			int countLines=0;
			int countWords=0;
			int countChars=0;
			try (BufferedReader reader=Files.newBufferedReader(path,StandardCharsets.UTF_8)){
				String line;
				while((line=reader.readLine())!=null){
					countLines++;
					String[] words=line.split(" ");
					countWords+=words.length;
					countChars+=line.length();
				}
				System.out.println("Lines "+countLines);
				System.out.println("Words: "+countWords);
				System.out.println("Characters: "+countChars);
			}catch (IOException e){
				e.printStackTrace();
			}
			
		}
		
		input.close();
	}
}