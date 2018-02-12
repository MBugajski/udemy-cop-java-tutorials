import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class App {
	public static void main(String[] args) {

		// HashSet doesn't not retain order.
		Set<String> hashedSet = new HashSet<String>();
		// LinkedHashSet retains order of adding (contains doubly linked list)
		Set<String> linkedHashSet = new LinkedHashSet<String>();
		// TreeSet stores objects in the natural order
		Set<String> treeSet = new TreeSet<String>();

		isSetEmpty(hashedSet);

		populateSet(hashedSet);
		populateSet(linkedHashSet);
		populateSet(treeSet);

		// Adding duplicate items does nothing
		hashedSet.add("Dog");
		System.out.println("hashSet: " + hashedSet);
		System.out.println("linkedHashSet: " + linkedHashSet);
		System.out.println("treeSet: " + treeSet);

		iterateOverSet(hashedSet);
		iterateOverSet(linkedHashSet);
		iterateOverSet(treeSet);

		checkForSpecificItem("Dog", hashedSet);
		// case specific
		checkForSpecificItem("dog", hashedSet);
		checkForSpecificItem("Pinguin", treeSet);

		isSetEmpty(hashedSet);
		
		//====================================
		
		Set<String> treeSet1 = new TreeSet<String>();
		
		
		//treeSet1 will have some common elements with treeSet.
		populateSet(treeSet1);
		treeSet1.remove("Dog");
		treeSet1.remove("Wolf");
		treeSet1.add("Giraffe");
		treeSet1.add("Drop Bear");
		treeSet1.add("Raven");
		
		/////////////////Intersection - finding common elements in two sets ////////////////////////
		
		//Used a reference variable of a set in a constructor in order to create its copy
		Set<String> intersection = new HashSet<String>(treeSet);
		intersection.retainAll(treeSet1);
		System.out.println("Common elements in both sets: " + intersection);
		
		/////////////////Intersection - finding common elements in two sets ////////////////////////

		Set<String> difference = new HashSet<String>(treeSet);
		difference.removeAll(treeSet1);
		System.out.println("Different elements between both sets: " + difference);
	}

	public static void populateSet(Set<String> set) {
		set.add("Dog");
		set.add("Cat");
		set.add("Boar");
		set.add("Wolf");
		set.add("Snake");
		set.add("Crow");
	}

	public static void iterateOverSet(Set<String> set) {

		for (String element : set) {
			System.out.println(element);
		}
		System.out.println();
	}

	public static void checkForSpecificItem(String element, Set<String> set) {
		if (set.contains(element)) {
			System.out.println("Set contains a " + element);
		} else {
			System.out.println("Set doesn't contain a " + element);
		}

	}

	public static void isSetEmpty(Set<String> set) {
		if (set.isEmpty()) {
			System.out.println("Set is empty");
		} else {
			System.out.println("Set is not empty");
		}
	}
}
