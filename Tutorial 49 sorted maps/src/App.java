import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class App {
	public static void main(String[] args) {

		HashMap<Integer, String> hashMap = new HashMap<Integer, String>();
		// Like with linkedLists each elements stores information about a previous and a
		// next one. This makes them stay in the same order you added them to the map.
		LinkedHashMap<Integer, String> linkedHashMap = new LinkedHashMap<Integer, String>();
		// TreeMap stores values in their natural order. For example: 1, 2, 3... for
		// Integers, alphabetically for Strings.
		// You can define a natural order for your classes
		TreeMap<Integer, String> treeMap = new TreeMap<Integer, String>();

		//Stores them in the order it feels like
		testMap(hashMap);
		System.out.println();
		//Stores them in the order they've been put in.
		testMap(linkedHashMap);
		System.out.println();
		//Stores them in the natural order of keys
		testMap(treeMap);
	}

	// All of those implement a Map interface and can be accessed by their common
	// Map methods.
	public static void testMap(Map<Integer, String> map) {
		map.put(17, "Hippo");
		map.put(52, "Cat");
		map.put(87, "Dog");
		map.put(42, "Dolphin");
		map.put(71, "Deer");
		map.put(23, "Seal");
		map.put(65, "Bear");
		map.put(15, "Moneky");
		map.put(2, "Drop Bear");

		for (int key : map.keySet()) {
			String value = map.get(key);
			System.out.println(key + " : " + value);
		}
	}
}
