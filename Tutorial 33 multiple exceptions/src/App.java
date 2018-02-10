import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.ParseException;

public class App {
	public static void main(String[] args) 	{
		Test test = new Test();
		
		try {
			test.run();
		} catch (IOException e) {
			System.out.println("IO error");
		} catch (ParseException e) {
			System.out.println("Couldn't parse");
		}
		
		try {
			test.run();
		} catch (IOException | ParseException e) {
			e.printStackTrace();
		}
		
		try {
			test.run();
			//you can use polymorphism to catch all exceptions using just "Exception" as a parent class to all exceptions
		} catch (Exception e) {
			e.printStackTrace();
		} 
		
		try {
			test.input();
			//you need to handle exceptions starting from most child-like to the most parent-like. otherwise the parent exception block would catch them all
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
