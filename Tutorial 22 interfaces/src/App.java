
public class App {
	public static void main(String[] args) {
		
		Machine mach1 = new Machine();
		mach1.start();
		
		Person person1 = new Person("Barry");
		person1.greet();
		
		//You can use the interface name in place of class name that implements said interface like this:
		Info info1 = new Machine();
		
		//You are, however limited to methods that are a part of that interface
		//It also specifies from what class the method of that type will stem.
		Info info3 = new Person("John");
		info1.showInfo();
		info3.showInfo();
			//so this won't work:
		//info1.start();
		
		//This creates a reference pointing at the same thing 'person1' is refers to.
		Info info2 = person1;
		
		info2.showInfo();
		mach1.changeId(20);
		mach1.showInfo();
		person1.changeId(12322);
		person1.showInfo();
		//Despite only 'person1' being changed the value of 'info2' has changed with it (since it's not a value but a return). "return' not 'value'?
		info2.showInfo();
		
		//here we're using a static method from below to use method from Info on 'mach1'
		outputInfo(mach1);
		outputInfo(person1);
	}
	private static void outputInfo(Info info) {
		//such method can, once again, only access methods defined in the named interface
		info.showInfo();
	}
}
