
public class App {
	public static void main(String[] args) {
		
		//Creating objects using classes from different file
		Machine mach1 = new Machine();
		
		mach1.start();
		mach1.stop();
		
		Car car1 = new Car();
		
		//Using 'extends' in the Car class we made it inherit all the methods of Machine class
		car1.start();
		car1.stop();
		//We can also add methods that aren't included in the 'parent' class
		car1.wipe();
		//
		car1.showInfo();
	}
}
