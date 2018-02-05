
public class Machine {
	
	public void start() {
		System.out.println("Machine started.");
	}
	public void stop() {
		System.out.println("Machine stopped");
	}
	
	//Since it's declared 'private'  you can't access it from beyond the class (so just within class brackets)
	private String name1 = "Machine type 1";
	//Not the case if there is no 'private'. Obviously.
	String name2 = "Machine type 2";
}
