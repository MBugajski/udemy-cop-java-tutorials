package world;
//Public - can be accessed from anywhere
//Private - can be only accessed from the same class (so: within the brackets)
//Protected - can be accessed from within the class, all its subclasses and within the same package. 
//No modifier - can only be accessed from within the class and the same package.

public class Field {
	private Plant plant = new Plant();
	
	public Field() {
		
		//size is protected and Field is in the same package as Pland class it is in.
		System.out.println(plant.size);
	}
}
