//abstract keyword prevents a user from instantiating a Machine class.

public abstract class Machine {
	private int id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	//semicolon instead of brackets. Like in an interface
	//Forces you to implement that method into all subclasses.
	protected abstract void start();
	protected abstract void doThing();
	protected abstract void shutDown();
	
	protected void run() {
		start();
		doThing();
		shutDown();
		
	}
}
