
public enum Animal {
	//CAT, DOG, MOUSE;
	
	//you need to end it with semicolon if you want other code but this list
	//If you have a constructor with a parameter you need to instantiate those objects with the name
	CAT("Fergus"), DOG("Fido"), MOUSE("Jerry");

	Animal(){
		
	}
	private String name;
	//you can give enum a constructor or even other methods, but they can't be public
	Animal(String name) {
		this.name= name;
	}
	public String getName() {
		return name;
	}
	
	//This overrides basic toString()
	public String toString() {
		return "This animal is called " + name;
	}
	
}
