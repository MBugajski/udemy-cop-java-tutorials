
//All objects in Java have an 'object' class as its 'parent'.

class Frog{
	
	private int id;
	private String name;
	
	public Frog(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	//Concatenating strings with StringBuilder is much more efficient. 
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(id) .append(": ") .append(name);
		//return id + ": " + name;
		return sb.toString();
	}	
		
	//You can also output this by formatting the return instead of appending it. Only one toString() per class tho
	/*
	public String toString() {
		return String.format(""%4d: %s", id, name);
		
	}
	*/
}

class Cat {
	
}

public class App {
	public static void main(String[] args) {
		
		Frog frog1 = new Frog(7, "Freddy");
		Frog frog2 = new Frog(5, "Monique");
		
		//Despite being an empty class Frog has a number of prebuild methods available, including toSting()
		//frog1.
		
		//sysout tries to automatically invoke toString() method of the object 
		System.out.println(frog1);
		System.out.println(frog2);
		
		Cat cat1 = new Cat();
		
		//If there is no specified return for toString() within the class it will return ClassName@HashCode
		System.out.println(cat1);
	}
}
