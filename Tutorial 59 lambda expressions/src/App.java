
//functional interface - an interface that has just a single method
interface Executable{
	int execute();
}

class Runner {
	public void run(Executable e) {
		System.out.println(">->Executing code block...");
		int value = e.execute();
		System.out.println("Return value is: " + value);
	}
}
public class App {
	public static void main(String[] args) {
		
		Runner runner = new Runner();
		
/////////////////////OLD WAY OF DOING IT//////////////////////
		//we're using anonymous class syntax. we're basically taking an interface and automagically turn it into a class having to define the methods it has.
		runner.run(new Executable() {
			public int execute() {
				System.out.println("Hello, flesh monkey.");
			}
		});
		System.out.println("==============================="); 
////////////////////LAMBDA EXPRESSIONS/////////////////////////////////////
		
		runner.run(() -> System.out.println("Hello, flash puppet!"));
		
		runner.run(() -> {
			System.out.println("Hello, flash thing!");
			System.out.println("This is code passed in a lambda expression.");
		});
		
		//You can use effectively final (not changed after initial assignment) variables within both anon classes and lambda expressions
		//Lambda expressions, unlike anon classes don't have their own scope so you can't override local variables for the benefit of the expression alone
	}
}
