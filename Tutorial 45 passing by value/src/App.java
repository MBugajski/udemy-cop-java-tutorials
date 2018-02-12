
public class App {
	public static void main(String[] args) {
		App app = new App();
		// ==============================
		int number = 5;
		System.out.println("1. Value is: " + number);
		app.show(number);
		System.out.println("4. Value is: " + number);

		// ==============================
		System.out.println();
		Person person = new Person("Bob");
		System.out.println("1. Person is: " + person);
		app.show(person);
		System.out.println("4. Person is: " + person);
		// ==============================

	}

	// 'number' reference variable within this method is a a copy of the one we had
	// so far, but completely independent of it. It only exists within its method
	private void show(int number) {
		System.out.println("2. Value is: " + number);

		number = 8;

		System.out.println("3. Value is: " + number);

	}

	// you can have methods of the same name as long as they have different argument
	// lists
	public void show(Person person) {
		System.out.println("2. Person is: " + person);
		//This will affect the object itself and change its 'name' field, so we'll get "Sue" instead of "Bob" outside the method.
		person.setName("Sue");
		person = new Person("Mike");
		System.out.println("3. Person is: " + person);
	}
}
