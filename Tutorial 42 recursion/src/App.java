
public class App {
	public static void main(String[] args) {
		int number = 4;
		calculate(number);
		//still 4 after being 3 within calculate();
		System.out.println(number);

	}
	
	private static void calculate(int number) {
		
		//changing a 'number' value within this method will not affect the value of it anywhere else. just within those brackets
		number = number -1;
		System.out.println(number);
	}
	

}
