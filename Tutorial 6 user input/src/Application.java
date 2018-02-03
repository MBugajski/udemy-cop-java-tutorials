import java.util.Scanner;

public class Application {
	public static void main(String[] args) {
		
		//Create scanner object
		Scanner input = new Scanner(System.in);
		
		//Output the prompt
		System.out.println("Enter a line of text: ");
		
//Inputting a string
		String line = input.nextLine();
	
//Inputting an integer
		System.out.println("Enter an integer: ");
		
		//Wait for the user to enter an input
		int value = input.nextInt();
						
		// Tell the what they entered.
		System.out.println("You entered: " + line + " and " + value);
	}
}
