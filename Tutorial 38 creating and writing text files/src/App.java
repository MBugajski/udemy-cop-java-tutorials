import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class App {
	public static void main(String[] args) {
		File file = new File("text.txt");
		
		try(BufferedWriter bw = new BufferedWriter(new FileWriter(file))){
			bw.write("This is line one\n");
			bw.write("This is line two\n");
			bw.newLine();
			bw.write("This is line four");
		}
		catch (IOException e) {
			System.out.println("Can't read file: " + file.toString());
		}
	}
}
