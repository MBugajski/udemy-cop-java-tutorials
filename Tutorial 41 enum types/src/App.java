
public class App {
//	public static final int DOG = 0;
//	public static final int CAT = 1;
//	public static final int MOUSE = 2;
	
	
	//The above code is common while enum is better, but new and very under-used. 
	public static void main(String[] args) {
		
		//int animal = CAT;
		Animal animal = Animal.CAT;
		
		switch(animal) {
		case CAT:
			System.out.println("Cat");
			break;
		case DOG:
			System.out.println("Dog");
			break;
		case MOUSE:
			System.out.println("Mouse");
			break;
		default:
			break;
		
		}
		
		//Those are objects of the class with the same name as enum they belong to:
		System.out.println(Animal.DOG);
		System.out.println(Animal.DOG.toString());
		//If toString() is overriden .name() will still produce the name of enum constant (that is an object) as a string.
		System.out.println("Enum name as a string: " + Animal.DOG.name());
		System.out.println(Animal.CAT.getClass());
		System.out.println(Animal.MOUSE instanceof Animal);
		//Enum is the  superclass of that class
		System.out.println(Animal.MOUSE instanceof Enum);
		System.out.println(Animal.MOUSE instanceof Object);
		System.out.println(Animal.MOUSE.getName());
		
		//It actually makes my variable point at the enum constants (objects).
		Animal animal2 = Animal.valueOf("CAT");
		System.out.println(animal2);
	}
}
