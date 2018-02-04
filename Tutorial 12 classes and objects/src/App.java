class Person {
	
	//Instance variables (data or "state")
	String name;
	int age;
	
	
	
	//Classes can contain:
	
	//1. Data 
	//2. Subroutines (methods)
	
	
	//Creating 1st method
	void speak() {
		for(int i=0; i<3; i++) {
			
		System.out.println("Hello, my name is " + name + " and I am " + age + " years old.");
		}
	}
	
	//Creating second method
	void sayHello() {
		System.out.println("Hello there!");
	}
	
}

class Town {
	String name;
	int pop;
	
}


public class App {

	public static void main(String[] args) {

		
		//Create a person
		Person person1 = new Person();
		person1.name = "Joe Shmoe";
		person1.age = 37;
		person1.speak();
		//Create a 2nd person
		Person person2 = new Person();
		person2.name = "Lucy Brown";
		person2.age = 28;
		
		//Create a 3rd person
		Person person3 = new Person();
		person3.name = "Mike Smith";
		person3.age = 59;
		
		//Create a town
		Town town1 = new Town();
		town1.name = "Ratsville";
		town1.pop = 122000;
		
		
		System.out.println(person1.name);
		System.out.println(town1.name + " " + town1.pop);
		
	}

}
