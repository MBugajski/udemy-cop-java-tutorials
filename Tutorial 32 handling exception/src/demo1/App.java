//Throwing
package demo1;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class App {
	public static void main(String[] args) throws FileNotFoundException {
		
		//Delete '1' to fix it.
		File file = new File("text1.txt");
		
		FileReader fr = new FileReader(file);
		
		System.out.println("This will continue if there is no exceoption or it is cought.");
	}
}
