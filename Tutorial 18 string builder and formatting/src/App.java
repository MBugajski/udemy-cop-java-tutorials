
public class App {
	public static void main(String[] args) {
		
		String info = "";
		
		//Strings are IMMUTABLE in Java. Below we're creating a new strings and reassigning the 'info" variable to it (rather than appending).
		// Each consecutive string created here continues to exist in the memory despite having no reference pointing to it. Very inefficent. 
		info += "I'm Bob.";
		info += " ";
		info += "I'm a builder";
		
		System.out.println(info);
		
		//More efficient
		StringBuilder sb = new StringBuilder(""); /*No need for "" there. See below*/
		
		sb.append("I'm Mike");
		sb.append(" ");
		sb.append("I'm a juggler.");
		
		
		System.out.println(sb.toString());
		
		//Since .append returns a reference to a string you can also 'method chain' it. NO SEMICOLLONS
		StringBuilder s = new StringBuilder();
		
		s.append("I'm Jane")
		.append(" ")
		.append("I'm a burglar.");
		
		System.out.println(s.toString());
		
		
		//StreamBuffer does the same as StreamBuilder but is more 'heavy' since it is 'thread-safe'
		
		
		////////Formatting //////////////////////////
		
		/// \t - Tab, \n - new line
		System.out.println("Here is some thest. \tThat was a tab.\nThat was a newline.");
		System.out.print("Print without ln will print in the same line.");
		//printf allows to include %d (d is for integers)in the string that will be replaced by values listed after.
		System.out.printf("\nTotal cost is %d. Quantity is %d", 5, 120);
		//Using d#% assigns # characters wide field. You can left align it by making it -#
		System.out.printf("\nTotal cost is %10d. Quantity is %d", 5, 120);
		System.out.printf("\nTotal cost is %-10d. Quantity is %d", 5, 120);
		
		for(int i=0; i<21; i++) {
			System.out.printf("\nI already told you that %2d bloody times!", i);
		}
		//%s is for strings, %f is for floating points. '.#' limits the number of decimal places in the float. It rounds too.
		System.out.printf("\nPrice of %s is %.2f dollars.", "apples", 3.231231);
	}
}
