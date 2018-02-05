class Machine {
	private String name;
	private int code;
	
	public Machine() {
		System.out.println("Contructor operational.");
	
	name = "Arnie";
	}
	
	//You can have different methods with the same name as long as they have different parameters.
	public Machine (String name) {
		
		System.out.println("Constructor reconfigurating.");
		this.name = name;
	}
	public Machine(String name, int code) {
		System.out.println("Constructor maximizing output.");
	}
	
	//You can run constructors within constructors
	public Machine(String name, int code, int pass) {
		//Call to the constructor must be the 1st line
		this("Annie", 4);
		System.out.println("ttt");
	}
}

public class App {
	public static void main(String[] args) {
		
		//You create a variable and set it equal to the object.
		Machine machine1 = new Machine();
		
		Machine machine2 = new Machine("Tony");
		
		Machine machine3 = new Machine("Adam", 321);
		
		
		//With constructors you can create a new object without creating a variable and it will still run a constructor:
		new Machine(); 
		
		new Machine("Joe");
		
		new Machine("Judy", 2123);
		
		new Machine("Annie", 3, 4);
		
	}
}
