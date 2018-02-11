import java.io.Serializable;

public class Person implements Serializable {

	private static final long serialVersionUID = 4801633306273802062L;
	
	//When serializing an object with the transient fields they will serialize as a default value for the specific type. 
	private transient int id;
	private String name;
	//count being static only exists once per class. All the objects of Person class will share the same static value. IT IS TRANSIENT BY DEFAULT
	private static int count;
	

	public static int getCount() {
		return count;
	}

	public static void setCount(int count) {
		Person.count = count;
	}
	public Person() {
		System.out.println("Default condstructor");
	}
	public Person(int id, String name) {
		super();
		this.id = id;
		this.name = name;
		System.out.println("Two-argument condstructor");
	}

	public String toString() {
		return "Person [id=" + id + ", name=" + name + "] Count is: "+ count;
	}

}
