package practiceJava;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Fileprocessing {

	public static void main(String[] args) throws FileNotFoundException {
		// Scanner sc = new Scanner(System.in);
		// System.out.println("Entersome text : ");
		// String EnteredText = sc.nextLine();
		// System.out.println("Entered Text is : "+ EnteredText);

		File file = new File("file.txt");
		// File file = new File("Test.xlsx"); // It is not working with Excel
		// sheet
		Scanner input = new Scanner(file);
		while (input.hasNextLine()) {
			String line = input.nextLine();
			System.out.println(line);
		}
		input.close();
	}

}
