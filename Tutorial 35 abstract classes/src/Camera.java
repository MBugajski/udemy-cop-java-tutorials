
public class Camera extends Machine {

//Neither of those ways of printing class name actually work.
	public void start() {
		System.out.println(this.getClass() + " starting.");
	}
	public void doThing() {
		System.out.println(this.toString() + " working.");		
	}
	
	public void shutDown() {
		System.out.println(this.toString() + " shutting down.");	
	}
}
