//There are two types of exceptions:
	//Checked Exceptions  - are the ones you need to handle in order to compile a code.
	//Runtime or Unchecked Exceptions - those are serious enough exceptions that will usually break the program, so java doesn't force you to handle them in code.
public class App {
	public static void main(String[] args) {
		
//Examples:
		
		//ArithmeticException - when attempting erroneous mathematical calculations
		int value = 7;
		value = value/0;		
		
		//NullPointer exception - a variable that isn't referencing anything 
		String text = null;		
		System.out.println(text.length());
		
		//ArrayIndexOutofBounds - trying to access an array index that doesn't exist
		String[] texts = {"one", "two", "three"};
		System.out.println(texts[3]);
		
		//You can try to catch Runtime Exceptions, but it it mostly pointless. You should fix the problem.
		try {
			System.out.println(texts[3]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e.toString());
		} catch (RuntimeException e) {
			System.out.println(e.toString());
		} catch (Exception e) {
			System.out.println(e.toString());
		}
		

	}
}
