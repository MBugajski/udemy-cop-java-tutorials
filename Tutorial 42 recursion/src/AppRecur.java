
public class AppRecur {
	
	public static void main(String[] args) {
		int number = 16;
		//E.d Factorial of 4 (written '4!') = 4*3*2*1.
		System.out.println("Factorial of " + number + " equals: " + calculate(number));
		
	}
	
	//Stack - area of memory that remembers method calls, local variables and relations between them
	//Heap - area of memory where objects are stored upon using a 'new' method
	
	private static int calculate(int number) {
		System.out.println(number);
		
		if (number == 1) {
			return 1;
		}
		
		return calculate(number - 1) * number;
	}
}
