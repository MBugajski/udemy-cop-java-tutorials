import java.util.Iterator;
import java.util.LinkedList;

public class App {
	public static void main(String[] args) {

		LinkedList<String> animals = new LinkedList<String>();

		animals.add("hippo");
		animals.add("wolf");
		animals.add("owl");
		animals.add("rabbit");

		// Old iteration

		Iterator<String> it = animals.iterator();

		while (it.hasNext()) {

			String animal = it.next();
			System.out.println(animal);
			if (animal.equals("owl")) {
				it.remove();
			}

		}
		// Modern iteration.
		System.out.println();
		for (String creature : animals) {
			System.out.println(creature);
		}
	}
}
