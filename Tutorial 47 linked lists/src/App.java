import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class App {
	public static void main(String[] args) {
		/*
		 * ArrayLists manage arrays internally 
		 * [0][1][2][3][4][5][6][7]....
		 */

		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		List<Integer> arrayList1 = new ArrayList<Integer>();

		/*
		 * Linked list consists of elements where each element has a reference to the
		 * previous and next element. 
		 * [0]<->[1]<->[2]<->[3]....
		 */
		LinkedList<Integer> linkedList = new LinkedList<Integer>();
		List<Integer> linkedList1 = new LinkedList<Integer>();

		// If you only want to add or remove items at the end of your list use ArrayList
		// If you want to add or remove items from anywhere else (beginning, middle
		// etc.) in the list use LinkedList

		doTimings("LinkedList", linkedList);
		doTimings("ArrayList", arrayList);
	}

	// You can use common List methods with any type of list.
	private static void doTimings(String type, List<Integer> list) {

		// Populating the list for testing.
		for (int i = 0; i < 1E5; i++) {
			list.add(1);
		}

		long start = System.currentTimeMillis();

		// Add items at the end of list
		for (int i = 0; i < 1E5; i++) {
			list.add(1);
		}

		// Add items at the beginning of the list
		for (int i = 0; i < 1E5; i++)
			list.add(0, i);

		long end = System.currentTimeMillis();

		System.out.println("Time taken: " + (end - start) + " ms for " + type);
	}
}
