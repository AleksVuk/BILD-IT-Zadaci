package zadaci_10_03_2017;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class Zadatak05 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		boolean works = true;
		while (works) {
			System.out.print("Enter the file name (zadatak05.txt): ");
			String fileName = input.next();
			input.nextLine();
			Path path = Paths.get(fileName);

			// check does file exists
			if (!Files.exists(path)) {
				System.out.println("File doesn't exists");
				continue;
			}

			works = false;

			try (BufferedReader reader = Files.newBufferedReader(path)) {
				
				String line = "";
				double sum = 0;
				int count = 0;
				
				while ((line = reader.readLine()) != null) {
					String[] list = line.split(" ");

					for (int i = 0; i < list.length; i++) {
						//convert values from string to double and add to sum
						double number = Double.parseDouble(list[i]);
						sum += number;
						count++;
					}
				}

				System.out.println("Total is: " + sum);
				System.out.println("Average is : " + sum / count);
				
			} catch (IOException e) {
				e.printStackTrace();
			}

		}
		
		input.close();
	}

}
