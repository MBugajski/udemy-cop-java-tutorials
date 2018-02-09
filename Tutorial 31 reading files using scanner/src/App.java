import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class App {
	public static void main(String[] args) throws FileNotFoundException {
//		String fileName = "C:\\Users\\Emnel\\Desktop\\diwod.txt";
		String fileName = "diwod.txt"; /*Upon adding */
		
		File textFile = new File(fileName);
		
		Scanner input = new Scanner(textFile);
		
		int count = 2;
		int value = input.nextInt();
		System.out.println("Read value: " + value);
		
		input.nextLine();
		
		while (input.hasNextLine()) {
			String line = input.nextLine();
			
			System.out.println(count + ": " + line);
			count++;
		}
		
		
		
		//closing scanner
		input.close();
	}
}
