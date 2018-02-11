import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ReadObjects {
	public static void main(String[] args) {
		System.out.println("Reading data...");
		
		try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("transient.bin"))){
			
			Person person = (Person)ois.readObject();
			System.out.println(person);
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
