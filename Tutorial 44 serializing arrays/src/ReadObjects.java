import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class ReadObjects {
	public static void main(String[] args) {
		System.out.println("Reading objects...");
		
		//We can put both of those in the try parentheses to autoclose them. 
		try(FileInputStream fis = new FileInputStream("test.ser"); ObjectInputStream ois = new ObjectInputStream(fis)){
			
						
			Person[] people = (Person[])ois.readObject();
			
			//type erosion - when you compile a java program the parameter in parameter classes is not longer stored. 
				//So when you serialize and then deserialize the information about that parameter is no longer there
			@SuppressWarnings("unchecked")
			ArrayList<Person> peopleList = (ArrayList<Person>)ois.readObject();

			//Reading entire array
			for(Person person: people) {
				System.out.println(person);
			}
			
			//Reading entire arraylist
			for(Person person: peopleList) {
				System.out.println(person);
			}
			
			
			//Reading objects one by one
			int num = ois.readInt();
			
			for(int i=0; i<num; i++) {
				Person person = (Person)ois.readObject();
				System.out.println(person);
			}
		
			
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
