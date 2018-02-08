import java.util.ArrayList;
import java.util.HashMap;

class Animal {
	
}

//A generic class is a class that can work with other objects and you specify what type of object it can work with when you 'instantiate a class' - create objects from the class
public class App {
	public static void main(String[] args) {
		
		//Array list manages an array internally without worrying about its size etc.
		
		///////////////////// Before Java 5 /////////////////////
		ArrayList list = new ArrayList();
		
		list.add("banana");
		list.add("apple");
		list.add("orange");
		
		String fruit = (String)list.get(1); /*You have to downcast an object to  string first.*/
		
		System.out.println(fruit);
		
		
		/////////////////////  Since Java 5  /////////////////////////
		
		ArrayList<String> strings = new ArrayList<String>();
		
		strings.add("Cat");
		strings.add("Crocodile");
		strings.add("Dog");
		
		String animal = strings.get(1);
		
		System.out.println(animal);
		
		
		///////////////////// There can be more than 1 type argument ///////////////////////////
		
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		
		//Since Java 7 you can choose to not repeat the parameter.
		
		ArrayList<String> otherList = new ArrayList<>();
		ArrayList<String> yetAnotherList = new ArrayList();
		
		
		//You can also make an array of objects of your classes
		
		ArrayList<Animal> animals = new ArrayList<Animal>();
		
	}
}
