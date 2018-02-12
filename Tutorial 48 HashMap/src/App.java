import java.util.HashMap;
import java.util.Map;

public class App {
	public static void main(String[] args) {

		HashMap<Integer, String> map = new HashMap<Integer, String>();

		map.put(5, "Five");
		map.put(2, "Two");
		map.put(3, "Three");
		map.put(6, "Six");
		map.put(1, "One");

		// You can override an object assigned to the key. You can have duplicate
		// objects but no duplicate keys
		map.put(3, "Changed three");

		String text = map.get(3);
		System.out.println(text);

		for (Map.Entry<Integer, String> entry : map.entrySet()) {
			int key = entry.getKey();
			String value = entry.getValue();
			// HashMap doesn't maintain an order of stored objects in any way. They may be
			// called a number of times in the same order, but they also may not. Do not
			// program anything that relies on producing those output in the same order
			// repeatedly
			System.out.println(key + ": " + value);
		}
	}
}
