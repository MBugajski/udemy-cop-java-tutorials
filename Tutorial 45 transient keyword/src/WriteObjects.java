import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriteObjects {
	public static void main(String[] args) {
		System.out.println("Writing data...");
		
		Person person1 = new Person(1,"Mark");
		Person.setCount(1905);
		
		try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("transient.bin"))){
			oos.writeObject(person1);
		
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
