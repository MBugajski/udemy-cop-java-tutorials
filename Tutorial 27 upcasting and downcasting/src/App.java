class Machine {
	public void start() {
		System.out.println("Machine starting.");
	}
}
class Camera extends Machine{
	public void start() {
		System.out.println("Camera started.");
	}
	public void snap() {
		System.out.println("Photo taken.");
	}
}
public class App {
	public static void main(String[] args) {
		Machine machine1 = new Machine();
		Camera camera1 = new Camera();
		
		machine1.start();
		camera1.start();
		camera1.snap();
		
		//CASTING
		//Once you create an object it will always be of its own class (so atm we have 1 Machine object, and 1 Camera object), 
		//but you can change the reference variables from one class(type?) to another:
		
		
		//UPCASTING - safe
		Machine machine2 = new Camera(); /*Creating a new object of a subclass with a superclass reference variable pointing at it.*/
		Machine machine3 = camera1; /*creating a reference variable of class Machine that will be pointing at the same object as 'camera1' (atm of class Camera)*/
		
		// Machine is a 'label' on my Camera. It's Camera itself, not the label  that does stuff, so the methods called will be Camera, not the Machine ones. 
		machine2.start(); 	/*prints 'Camera started' since the object this variable refers to is of Camera class.*/
		
		//It is, however, the class of the variable that decides what methods you can call, so I can't call 'snap()'.
		//machine2.snap();
		
		
		//DOWNCASTING - unsafe
		Machine machine4 = new Camera();
		Camera camera2 = (Camera)machine4;	 
		//When downcasting (assigning a subclass reference variable to a more generic superclass one) Java requires confirmation. Add the go-to Class in the brackets.
		camera2.snap(); /*Now we can access subclass methods since we have a subclass reference variable.*/
		camera2.start(); /*It will still print camera. Obviously*/
		
		
		//This will NOT work and will produce an exception. We can't change an object from one class to another. 
		Machine machine5 = new Machine();
		Camera camera3 = (Camera)machine5;
		camera3.start();
		camera3.snap();
		
	}	
	
	
}
