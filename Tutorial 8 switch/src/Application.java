import java.util.Scanner;

public class Application {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int num = 0;
		do {
			System.out.println("Please enter a command: ");
			String text = input.nextLine();
			
			
				switch (text) {
				case "start":
					System.out.println("Machine starting!");
					break;
				case "stop":
					System.out.println("Machine stopping.");
					break;
				case "help":
					System.out.println("Commands: start, stop, quit");
					break;
				case "quit":
					System.out.println("Program shutting down.");
					num = 1;
					break;
				default:
					System.out.println("Command not recognized. Input 'help' to see available commands.");
			}
		}
		while(num == 0);
	}
}
