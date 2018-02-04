class Machine {
	private String name;
	
	
	public Machine() {
		System.out.println("Contructor operational.");
	
	name = "Arnie";
	}
	
	public Machine (String name) {
		
		System.out.println("Constructor reconfigurating.");
		this.name = name;
	}
}

public class App {
	public static void main(String[] args) {
		
		//You create a variable and set it equal to the object.
		Machine machine1 = new Machine();
		
		
		//With constructors you can create a new object without creating a variable and it will still run a constructor:
		new Machine(); 
		
		new Machine("Joe");
	}
}
