
public class Application {
	public static void main(String[] args) {
		
		int value = 7;
		
		int[] values;
		values = new int[3]; /*allocating memory for 3 integers. (!!!)In Java all of them get a default value(!!!) */
		
		System.out.println(values[0]);
		
		values[0] = 10;
		values[1] = 20;
		values[2] = 30;
		
		System.out.println(values[0]);
		System.out.println(values[1]);
		System.out.println(values[2]);
//		System.out.println(values[3]); there is no value no.3 so program would crush with an exception
		
		for(int i=0; i<values.length; i++){  /*iterates through the whole array using <array>.length and an integer */ 
			System.out.println(values[i]);
		}
		
		int[] numbers = {5, 9, 8}; /*initializing array when starting an array*/
		
		for(int i=0; i<numbers.length; i++) {
			System.out.println(numbers[i]);
		}
	}
}
