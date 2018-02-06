import world.Plant;

//Public - can be accessed from anywhere
//Private - can be only accessed from the same class (so: within the brackets)
//Protected - can be accessed from within the class, all its subclasses and within the same package. 

public class App {
	public static void main(String[] args) {
		
		Plant plant = new Plant();
		
		System.out.println(plant.name);
		
		System.out.println(plant.ID);
		
		//Won't work here either - 'type' private(see: comment in Tree)
		System.out.println(plant.type);
		
		//Won't work - size is protected and (being in Plant) in different package than App
		System.out.println(plant.size);
		
		//App is in a different package than height (being in Plant) and height has package-level visibility
		System.out.println(plant.height);
	}
}
