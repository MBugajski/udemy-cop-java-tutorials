import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ReadObjects1 {
	public static void main(String[] args) {
		System.out.println("Reading objects...");
		
		try(FileInputStream fis = new FileInputStream("transient.bin");ObjectInputStream ois = new ObjectInputStream(fis)){
			
			
			int length = ois.readInt();
			
			for (int i=0; i<length; i++) {
				Person person = (Person)ois.readObject();
				System.out.println(person);
			}
			
		} catch (IOException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
