import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Arrays;

public class WriteObjects {
	public static void main(String[] args) {
		System.out.println("Writing objects...");
		
		Person[] people = {new Person(1, "Sue"), new Person(2, "Joe"), new Person(3, "Johny")};
		
		ArrayList<Person> peopleList = new ArrayList<Person>(Arrays.asList(people));
		
		
		try(FileOutputStream fis = new FileOutputStream("test.ser");){
			
			ObjectOutputStream ois = new ObjectOutputStream(fis);
			
			ois.writeObject(people);
			// .length without brackets since it's a property of the array rather than a method
			
			ois.writeObject(peopleList);
			// .size() since it's a method of ArrayList class and .length since it's a property of an array rather than a method
			ois.writeInt(peopleList.size()+people.length);
			
			for(Person person: people) {
				ois.writeObject(person);
			}
			
			for(Person person: peopleList) {
				ois.writeObject(person);
			}
			
			ois.close();
				
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
