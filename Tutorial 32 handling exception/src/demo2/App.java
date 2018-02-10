//Catching
package demo2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class App {
	public static void main(String[] args) {

		File file = new File("text1.txt");

		try {
			FileReader fr = new FileReader(file);
			//first time a line throws an exception in the 'try block' program instantly goes to 'catch' block without executing the rest of the code, even if its ok
			System.out.println("This won't be excecuted if there is an exception.");
			
		} catch (FileNotFoundException e) {
			System.out.println("File not found: " + file.toString());
			//e.printStackTrace();
			System.out.println("This will excecute only if there is an exception");
		}
		System.out.println("This will continue if there is no exceoption or it is cought.");
	}
}
