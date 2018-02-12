import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

class Person implements Comparable<Person>{
	private String name;

	public Person(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String toString() {
		return name;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	@Override
	//Implementing this will allow us to add the object to a TreeSet as well as the use of .sort method for lists. 
//	public int compareTo(Person person) {
//		return -name.compareTo(person.name);
//	}

	
	//We can also compare other things such as length of the strings, but that requires a few more steps. 
	//Using this, and other complex ways of comparison will cause TreeSet to act funny getting into conflict with .equals method results. And not good funny.
	//In this case all 3-letter words were considered duplicates and only 1 of them remains
	public int compareTo(Person person) {
		int len1 = name.length();
		int len2 = person.name.length();
		
		if (len1 > len2) {
			return 1;
		}
		else if (len1 < len2 ) {
			return -1;
		}
		else {
		//we can fix it, but replacing 0 with comparing actual name variables. this way 0 result will be returned only if they are indeed the same
			//return 0;
			return name.compareTo(person.name);
		}
		
	}

}

public class App {
	public static void main(String[] args) {
		List<Person> list = new ArrayList<Person>();
		Set<Person> set = new TreeSet<Person>();
		populateCollection(list);
		//You cannot add elements to a TreeSet unless they have a natural order
		populateCollection(set);

		System.out.println(list);
		System.out.println(set);
		
		Collections.sort(list);
			
		showCollection(list);
		System.out.println();
		showCollection(set);
	}

	private static void populateCollection(Collection<Person> col) {
		col.add(new Person("dog"));
		col.add(new Person("cat"));
		col.add(new Person("pig"));
		col.add(new Person("horse"));
		col.add(new Person("raven"));
		col.add(new Person("lion"));
	}

	private static void showCollection(Collection<Person> col) {
		for (Person element : col) {
			System.out.println(element);
		}
	}
}
