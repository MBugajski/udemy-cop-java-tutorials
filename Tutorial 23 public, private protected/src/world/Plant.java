package world;
//Public - can be accessed from anywhere
//Private - can be only accessed from the same class (so: within the brackets)
//Protected - can be accessed from within the class, all its subclasses and within the same package. 
//No modifier - can only be accessed from within the class and the same package.

public class Plant {
	//Bad practice - you don't want to make instance variables public, you want to encapsulate them and make people access them by methods.
	public String name;
	
	//Acceptable practice - nothing wrong with declaring public constants as long as they're final
	public final static int ID = 8;
	
	private String type;
	
	protected String size;
	
	//without public, protected or private it can be only accessed from the same package
	int hight;
	
	public Plant() {
		this.name = "Jimmy";
		type = "plant";
		this.size = "medium";
		height = "high";
		//use of this. makes no difference here.
		
		
		
		
		
	}
}
