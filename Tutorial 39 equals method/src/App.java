public class App {
	public static void main(String[] args) {

		Person person1 = new Person(5, "Bob");
		Person person2 = new Person(5, "Bob");
		
		//== only tells you if the variables are pointing at the same object
		//Result is false even if the variables making up the object are the same.
		System.out.println(person1 == person2);
		//If you override equals() within the referenced object's class this will actually compare variables:
		System.out.println(person1.equals(person2));
		
		Integer number1 = 2;
		Integer number2 = 2;
		
		//true, but apparently but weirdly (?)
		System.out.println(number1 == number2);
		System.out.println(number1.equals(number2));
		
		
		Double number3= 7.2;
		Double number4= 7.2;
		
		//false, since those aren't the same objects.
		System.out.println(number3 == number4);
		//This will actually compare values
		System.out.println(number3.equals(number4));
		
		
		String text1 = "Hello";
		String text2 = "Hello";
		String text3 = "Hellooo".substring(0,5);
		
		//This will be true since text1 and text2 are simply reference variables pointing at the same object of String class. 
		//And Java sometimes optimizes to two references to objects such as Strings or Integers at the same object
		System.out.println(text1 == text2 );
		//this will produce false despite it also being a "Hello" String, since the way it was created didn't allow for that optimization. 
		System.out.println(text1 == text3);
		System.out.println(text1.equals(text2));
		//Still true when we use .equals method
		System.out.println(text1.equals(text3));
	}
}
