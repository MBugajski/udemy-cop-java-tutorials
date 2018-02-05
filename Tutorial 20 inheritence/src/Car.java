//The 'extend' keyword makes this class inherit all the methods of parent class ('Machine' here)
public class Car extends Machine {
	//you can also add methods specific to this class
	public void wipe() {
		System.out.println("Wiping windshield");
	}
	
	//You can override methods from the parent class
	public void start() {
		System.out.println("Car started.");
	}

	//.r-click --> Source --> Override/Implement method:
	//you can remove @Override annotation

	
	@Override
	public void stop() {
		// TODO Auto-generated method stub
		
		//'super' calls the parent class version of the method. you can change it like the one above.
		super.stop();
	}
	
	public void showInfo() {
		System.out.println("Car name: " + name2);
	}
	
}


//not all the classes can be extended. 'string' class is a final class and can't be.

//DO NOT try to override variables. D.O. N.O.T. 