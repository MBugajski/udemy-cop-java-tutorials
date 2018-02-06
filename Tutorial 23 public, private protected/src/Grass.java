import world.Plant;

//Public - can be accessed from anywhere
//Private - can be only accessed from the same class (so: within the brackets)
//Protected - can be accessed from within the class, all its subclasses and within the same package. 
//No modifier - can only be accessed from within the class and the same package.

public class Grass extends Plant {
	public Grass() {
		
		//Won't work even with this being a sub-class of Plant; Grass isn't in the same package as Plant and 'height' has a package-level visibility
		System.out.println(this.height);
	}
}
