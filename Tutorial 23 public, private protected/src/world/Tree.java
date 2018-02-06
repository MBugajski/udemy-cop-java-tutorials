package world;
//Public - can be accessed from anywhere
//Private - can be only accessed from the same class (so: within the brackets)
//Protected - can be accessed from within the class, all its subclasses and within the same package. 
//No modifier - can only be accessed from within the class and the same package.

public class Tree extends Plant {
	public Tree() {
		
		//Can't access 'type' since it's a private variable of different class (even if it is a parent class).
		//type = "tree";
		
		//Can be accessed since 'size is a protected variable and this is both a sub-class of "Plant" class it is declared in and in same package.
		this.size = "large";
		size = "large";
	}
}
