import java.util.ArrayList;



class Machine {

	public String toString() {
		return "I'm a machine";
	}
	public void start(){
		System.out.println("Machine starting.");
	}
}

class Car extends Machine {

	public String toString() {
		return "I'm a car";
	}
	
	public void start(){
		System.out.println("Car starting.");
	}
	
	public void brum(){
		System.out.println("BRUM BRUM");
	}
}

public class App {
	
	private static int count = 0;
	public static void main(String[] args) {
		
		
		
		ArrayList<Machine> list1 = new ArrayList<Machine>();

		list1.add(new Machine());
		list1.add(new Machine());

		
		//ArrayList of sub class isn't itself a sub class of an ArrayList of its superclass. Can't simplyuse showList() with superclass parameter.
		ArrayList<Car> list2 = new ArrayList<Car>();

		list2.add(new Car());
		list2.add(new Car());
		
		System.out.println(count);
		showList(list1);
		//showList(list2);
		
		System.out.println(count);
		showList1(list1);
		showList1(list2);
		
		System.out.println(count);
		showList2(list1);
		showList2(list2);
		
		System.out.println(count);
		showList3(list1);
		showList3(list2);
	}
	
	// Has to be static if I want to call that method in main method (that is par
	// excellance static) while not making a new app
	public static void showList(ArrayList<Machine> list) {
		for (Machine value : list) {
			System.out.println(value);
		}
		count++;
		System.out.println("00");
	}
	
	// You can use a wildcard in place of parameter in order to allow the method to use multiple classes, 
	public static void showList1(ArrayList<?> list) {
	//but when you can only treat items in the list as "Object", the ultimate superclass 
		for (Object value : list) {
			System.out.println(value);
		}
		count++;
		System.out.println("11");
	}
	
	//You can use upper bound by extending the wildcard.
	public static void showList2(ArrayList<? extends Machine> list) {
		for (Machine value : list) {
			System.out.println(value);
			//If we used a list of subclass objects it will execute subclass version of called method,
			value.start();
			//but we can't call methods specific to a subclass. Just like with class ov the ref. variable vs. class of the objects it's calling.
			//value.brum();
		}
		count++;
		System.out.println("22");
	}
	
	//You can also specify a lower bound, but that's not very useful
	public static void showList3(ArrayList<? super Car> list) {
		//You're back to only Object variables,
		for (Object value : list) {
			//and thus to only Object methods.
			System.out.println(value);
			value.toString();
			//value.start();
			//value.brum();
		}
		count++;
		System.out.println("33");
	}
}
