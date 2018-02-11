
public class Robot {
	private int id;
	
	//nested classes
	
	private class Brain{
		public void think() {
			System.out.println("Robot "+ id + " is thinking.");
		}
	}
	
	//static inner classes are just like normal classes, but for when you want the grouped together with the specific class (being the public class in that file)
	public static class Battery{
		public void charge() {
			System.out.println("Battery charging...");
		}
	}
	
	public Robot(int id) {
		this.id = id;
	}
	
	public void start() {
		System.out.println("Starting robot " + id);
		Brain brain = new Brain();
		brain.think();
		
		String name = "Robert";
		
		//You can also declare classes within methods. Mostly if you want an instance of a class to pass to another method but dont want to use anon class for w/e reason
		//you can't refer to this class from outside this method (start() method, that is). It's scope is limited to it, private/protected/etc. are irrelevant
		class Temp{
			public void doSomething() {
				System.out.println("ID is: " + id);
				System.out.println("My name is " + name);
			}
		}
		
		Temp temp = new Temp();
		temp.doSomething();
	}
}
