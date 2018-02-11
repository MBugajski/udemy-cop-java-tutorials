import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriteObjects {
	public static void main(String[] args) {
		System.out.println("Writing objects...");
		
		Person mike = new Person(543, "Mike");
		Person sue = new Person(142, "Sue");
		
		System.out.println(mike);
		System.out.println(sue);
		
		//This syntax automatically calls .close.
		try(FileOutputStream fs = new FileOutputStream("people.bin")) {
			
			ObjectOutputStream os = new ObjectOutputStream(fs);
			
			
			//You need to make a class the objects are of serializable first. 
			os.writeObject(mike);
			os.writeObject(sue);
			
			os.close();
			
		} catch (FileNotFoundException e) {
			System.out.println("File not found");
		} catch (IOException e) {
			System.out.println("Can't read file.");
		}
	}
}
