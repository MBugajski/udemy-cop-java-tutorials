import java.util.ArrayList;
import java.util.List;

public class App {
	public static void main(String[] args) {
		// int - primitive type
		// Integer - non-primitive type
		ArrayList<Integer> numberList = new ArrayList<Integer>();

		// Adding
		numberList.add(10);
		numberList.add(100);
		numberList.add(500);

		// Retrieving
		System.out.println(numberList.get(0));

		// Indexed for loop iteration
		for (int i = 0; i < numberList.size(); i++) {
			System.out.println(numberList.get(i));
		}

		for (int number : numberList) {
			System.out.println(numberList.get(number));
		}
		
		//Removing//
		
		//removing items from the end
		numberList.remove(numberList.size() -1);
		//removing items from beginning. It will copy all the items one step back to fill the initial addresses (so item in address 1 moves to 0). It's VERY SLOW
		numberList.remove(0);
		
		
		//List interface...
		List<String> values = new ArrayList<String>();
		
	}
}
