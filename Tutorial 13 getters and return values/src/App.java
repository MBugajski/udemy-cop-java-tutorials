class Person {
	String name;
	int age;
	
	void speak() {
		System.out.println("My name is: " + name);
	}
	
	int  calculateYearsToRetirement() {
		int yearsLeft = 65 - age;
		
		return yearsLeft;
	}
	
	
	//Get methods
	int getAge() {
		return age;
	}
	String getName() {
		return name;
	}
}



public class App {
	public static void main(String[] args) {
		Person person1 = new Person();
		
		person1.name = "Joe";
		person1.age	= 23;
		
		person1.speak();
		
		int years = person1.calculateYearsToRetirement(); /*setting int to the RETURN VALUE of the method, not the method itself */
		
		System.out.println("Years till retirement " + years);
		
		String name = person1.getName();
		int age = person1.getAge();

		
		System.out.println("Name is " + name);
		System.out.println("Age is " + age);
	}
	
}
