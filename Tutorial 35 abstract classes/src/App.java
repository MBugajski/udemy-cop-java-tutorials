
public class App {
	public static void main(String[] args) {
		
		Camera cam1 = new Camera();
		cam1.setId(5);
		
		Car car1 = new Car();
		car1.setId(4);
		
		cam1.run();
		car1.run();
		
		//Machine is just a base class to hold common functionalities of its subclasses in our program.
		//It's abstract, so can't be instantiated
		//Machine machine1 = new Machine();
	}
}
