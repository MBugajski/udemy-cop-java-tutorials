import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Arrays;

public class WriteObjects1 {
	public static void main(String[] args) {
		System.out.println("Writing objects...");

		Person[] people = { new Person(1, "Eve"), new Person(2, "Tom"), new Person(3, "Jack") };
		// Arrays.asList()method for turning an array into an arraylist
		ArrayList<Person> peopleList = new ArrayList<Person>(Arrays.asList(people));

		try (FileOutputStream fos = new FileOutputStream("transient.bin");
				ObjectOutputStream oos = new ObjectOutputStream(fos)) {

			oos.writeInt(people.length + peopleList.size());

			for (Person person : people ) {
				oos.writeObject(person);
			}
			for (Person person : peopleList) {
				oos.writeObject(person);
			}

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
