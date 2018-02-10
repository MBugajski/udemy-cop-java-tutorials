//Throwing exceptions up the stack
package demo3;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class App {
	public static void main(String[] args)  {
		
		//Thrown exceptions have to be handled further up the stack. Either thrown all the way up out of the program or cought. 
		
		try {
			openFile();
		} catch (FileNotFoundException e) {
			//THis message is waaaaaay too vague. End user needs to get a better info. And never see a stack exception. 
			System.out.println("Could not open the file");		}

	}
	public static void openFile() throws FileNotFoundException {
		File file = new File("test.txt");
		
		FileReader fr = new FileReader(file);
	}
}
