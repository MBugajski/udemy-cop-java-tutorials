import java.util.Scanner;

public class Application1 {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		/*
		System.out.println("Enter a number: ");
		int value = scanner.nextInt();
		
		while(value != 5 ) {
			System.out.println("Enter a number: ");
			value = scanner.nextInt();
		}
		*/
		
		int value = 0; /*have to declare value outside since one declared in brackets below would only exists within them*/ 
		do {
			System.out.println("Enter a number: ");
			value = scanner.nextInt();
		}
		while(value != 5);
		
		System.out.println("Got 5!");
	}
}
