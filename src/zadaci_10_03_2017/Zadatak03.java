package zadaci_10_03_2017;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak03 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		ArrayList<String> list = new ArrayList<>();
		
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
			
			printTextFromFile(fileName);
			
			System.out.print("\nEnter the string to remove from file: ");
			String s = input.nextLine();
			
			//check is string contained in the file
			if(isInText(fileName, s)){

				//invoking methods 
				copyTextToList(list, fileName);
				removeSpecifiedString(list, s);
				writeTextToFile(list, fileName);
				printTextFromFile(fileName);
				
			}
			else{
				System.out.println("Entered string is not in the file.");
				printTextFromFile(fileName);
			}
			works = false;
				
		}
		
		input.close();
		
	}
	//copy text from file to list (one line from file equal one string object in list)
	public static void copyTextToList(ArrayList<String> list, String fileName){				
		Path path = Paths.get(fileName);
		String line = "";
		
		try (BufferedReader reader = Files.newBufferedReader(path)){
				while ((line = reader.readLine()) != null){
					list.add(line);
				}
		}catch (IOException ex){
			ex.printStackTrace();
			
		}
	}
	
	//remove specified string from text file
	public static void removeSpecifiedString(ArrayList<String> list, String s){
		int beginIndex = 0;
		int endIndex = 0;
		for (int i = 0; i < list.size(); i++){
			if (list.get(i).contains(s)){
				beginIndex = list.get(i).indexOf(s);
				endIndex = beginIndex + s.length();
				String newString = list.get(i).substring(0, beginIndex);
				newString = newString + list.get(i).substring(endIndex); 
				
				list.set(i, newString);
			}
		}
		
	}
	//write strings from list to file
	public static void writeTextToFile(ArrayList<String> list, String fileName){		
		
		Path path = Paths.get(fileName);
		
		try {
			BufferedWriter writer = Files.newBufferedWriter(path);
			for(int i = 0; i < list.size(); i++){
				if (i == list.size() - 1){
					writer.write(list.get(i));
					break;
				}
				writer.write(list.get(i));
				writer.newLine();
			}
				writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	//print text from file
	public static void printTextFromFile(String fileName){									
		Path path = Paths.get(fileName);
		String line = "";
		try (BufferedReader reader = Files.newBufferedReader(path)){
			while ((line = reader.readLine()) != null){
				System.out.println(line);
			}
		}catch (IOException ex){
			ex.printStackTrace();
			
		}
	}
	
	//check if the string to remove is contained in the file
	public static boolean isInText(String fileName, String s){
		Path path = Paths.get(fileName);
		String line = "";
		try (BufferedReader reader = Files.newBufferedReader(path)){
			while ((line = reader.readLine()) != null){
				if (line.contains(s)){
					return true;
				}
			}
		}catch (IOException ex){
			ex.printStackTrace();
			
		}
		return false;
	}
	
}
