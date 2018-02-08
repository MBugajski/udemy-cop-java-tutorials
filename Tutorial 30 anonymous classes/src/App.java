class Machine{
	public void start() {
		System.out.println("Machine starting");
	}
}

interface Plant{
	public void grow();
}

public class App {
	public static void main(String[] args) {

		//What we are creating here is an object belonging to an anonymous subclass of Machine with no name. There is no way to create a 2nd object of this class.
		Machine machine1 = new Machine() {
			@Override public void start() {
				System.out.println("Car starting");
			}
		};
		
		machine1.start();
		
		//We can create an anonymous class object using interface. We'll have to add all the methods included in it (can be done via error on the left)
		Plant plant1 = new Plant() {
			//nothing to override, so the '@Override' annotation is not needed.
			public void grow() {
				System.out.println("Plant growing.");
			}
			
		};
	}
}
