class Thing {
	public int JUST_A_NUMBER;
	public static int UNLUCKY_NUMBER = 6;
	// final=constant in java, means you can't reasign it, just like PI below. Has
	// to have an assigned value from the get go.
	public final static int LUCKY_NUMBER = 7;
	public String name;
	public static String description = "Description stub";

	public static int count = 0;
	// instance variables are initialized in java so 'id' will also be 0.
	public int id;

	// Every time you create a new instance of thing count will increment. Since
	// it's static it belongs to class and there is only 1 count.
	public Thing() {
		// It assigns an 'id' value to every created object equal to the count value at
		// the time.
		id = count;
		count++;
	}

	public void showName() {
		System.out.println("Object id: " + id + " name: " + name);

	}

	// Static method
	public static void showInfo() {
		System.out.println("Hello");
	}

	public static void showInfo1() {
		// Static methods can access static data (since they both belong to the class)
		System.out.println(description);

		// But can's access non-static variables (example below returns an error) since
		// they are created outside the class
		// System.out.println(name);

	}

	// Instance methods can access static data, since by the time you call them they
	// are already created within the class
	public void showName1() {
		System.out.println(name);
	}

	public static void printNumbers() {
		// constant values are by convention represented by upper case letters. Bold
		// represents final numbers.
		System.out.println(Math.PI);
		System.out.println(Thing.LUCKY_NUMBER);
		System.out.println(Thing.UNLUCKY_NUMBER);
		// Can't make a static reference to a non-static field
		// System.out.println(Thing.JUST_A_NUMBER);
	}

	public static void changeNumbers() {
		// Can't re-assign final numbers
		// Math.PO = 3;
		// LUCKY_NUMBER = 3;
		UNLUCKY_NUMBER = 8;
		// JUST_A_NUMBER = 1;
	}

}

public class App {
	public static void main(String[] args) {

		System.out.println("Initial count: " + Thing.count);

		Thing thing1 = new Thing();
		Thing thing2 = new Thing();

		thing1.name = "Bob";
		thing2.name = "Joe";

		System.out.println(thing1.name);
		System.out.println(thing2.name);
		System.out.println(thing1.description); /* says it should be accessed by the class, but still works? */

		// Static variable is accessed by calling for a class
		Thing.description = "This is a thing.";

		System.out.println(thing1.description); /* says it should be accessed by the class, but still works? */

		// Replacing sysout calls for name with getter functions
		thing1.showName();
		thing2.showName();
		thing2.showName1();

		// Static method is also being accessed by the class
		Thing.showInfo();
		Thing.showInfo1();

		Thing.printNumbers();

		Thing.changeNumbers();

		Thing.printNumbers();

		// Can't re-assign final numbers
		// Math.PO = 3;
		// LUCKY_NUMBER = 3;
		Thing.UNLUCKY_NUMBER = 9;
		thing1.JUST_A_NUMBER = 2;

		Thing.printNumbers();
		System.out.println(thing1.JUST_A_NUMBER);

		System.out.println("Final count: " + Thing.count);
	}
}
