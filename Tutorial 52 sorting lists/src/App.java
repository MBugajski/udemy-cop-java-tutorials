import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Person {
	private int id;
	private String name;

	public Person(int id, String name) {
		this.id = id;
		this.name = name;

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String toString() {
		return id + " : " + name;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
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
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

}

class StringLengthComparator implements Comparator<String> {

	public int compare(String s1, String s2) {

		int len1 = s1.length();
		int len2 = s2.length();

		if (len1 > len2) {
			return 1;
		} else if (len1 < len2) {
			return -1;
		} else {
			return 0;
		}

	}

}

class ReverseStringLengthComparator implements Comparator<String> {

	public int compare(String s1, String s2) {

		int len1 = s1.length();
		int len2 = s2.length();

		if (len1 > len2) {
			return -1;
		} else if (len1 < len2) {
			return 1;
		} else {
			return 0;
		}

	}

}

class AlphabeticalComparator implements Comparator<String> {

	public int compare(String s1, String s2) {

		// this is basically a natural order comparison
		return s1.compareTo(s2);

	}

}

class ReverseAlphabeticalComparator implements Comparator<String> {

	public int compare(String s1, String s2) {

		// reverse what compares to what
		return s2.compareTo(s1);

	}

}

class AlphabeticalComparator2 implements Comparator<String> {

	public int compare(String s1, String s2) {

		// or just add negative to the return value
		return -s1.compareTo(s2);

	}

}

public class App {
	public static void main(String[] args) {

		//////////////////////// Sorting Strings////////////////////////
		List<String> animals = new ArrayList<String>();

		animals.add("cat");
		animals.add("dog");
		animals.add("mouse");
		animals.add("bear");
		animals.add("horse");
		animals.add("elephant");
		animals.add("snake");

		System.out.println(animals);
		Collections.sort(animals);
		System.out.println(animals);
		Collections.sort(animals, new StringLengthComparator());
		System.out.println(animals);
		Collections.sort(animals, new AlphabeticalComparator());
		System.out.println(animals);
		Collections.sort(animals, new AlphabeticalComparator2());
		System.out.println(animals);
		Collections.sort(animals, new ReverseAlphabeticalComparator());
		System.out.println(animals);

		//////////////////////// Sorting Numbers ////////////////////////
		ArrayList<Integer> numbers = new ArrayList<Integer>();

		numbers.add(3);
		numbers.add(4);
		numbers.add(2);
		numbers.add(5);
		numbers.add(1);
		numbers.add(7);

		System.out.println(numbers);
		Collections.sort(numbers);
		System.out.println(numbers);
		// using abstract classes
		Collections.sort(numbers, new Comparator<Integer>() {

			public int compare(Integer i1, Integer i2) {
				return -i1.compareTo(i2);
			}
		});
		System.out.println(numbers);

		//////////////////////// Sorting Objects////////////////////////
		ArrayList<Person> people = new ArrayList<Person>();
		people.add(new Person(1, "Joe"));
		people.add(new Person(9, "Harry"));
		people.add(new Person(7, "Anne"));
		people.add(new Person(4, "Mike"));
		System.out.println(people);
		Collections.sort(people, new Comparator<Person>() {

			public int compare(Person p1, Person p2) {
				Integer id1 = p1.getId();
				Integer id2 = p2.getId();

				return id1.compareTo(id2);

			}
		});
		System.out.println(people);
		Collections.sort(people, new Comparator<Person>() {
			public int compare(Person p1, Person p2) {
				if (p1.getId() > p2.getId()) {
					return -1;
				} else if (p1.getId() < p2.getId()) {
					return 1;
				} else {
					return 0;
				}
			}
		});
		System.out.println(people);
		Collections.sort(people, new Comparator<Person>() {

			public int compare(Person p1, Person p2) {
				String id1 = p1.getName();
				String id2 = p2.getName();

				return id1.compareTo(id2);

			}
		});
		System.out.println(people);
		Collections.sort(people, new Comparator<Person>() {

			public int compare(Person p1, Person p2) {
				String id1 = p1.getName();
				String id2 = p2.getName();

				return -id1.compareTo(id2);

			}
		});
		System.out.println(people);
		
	}
}
