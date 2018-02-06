//keyword'implements' forces the class to have all the methods names in the called interface
//You can 'extend' only one class (no 2 parents!), but can 'implement' multiple interfaces 
public class Person implements Info, Basics {

	private String name = "Joe";
	private int id = 1;
	
	//r-click -> Source -> Generate constructor using fields -> pick 'name'. 
	public Person(String name) {
		//super();
		this.name = name;
	}

	public Person(int id) {
		this.id = id;
	}


	public void greet() {
		System.out.println("Hello there! I'm " + name);
	}


	//it was auto implemented and the annotation @Override was removed
	public void showInfo() {
		//the actual code of the method can be different between classes.
		System.out.println("Person's name is: " + name + "ID number: " + id);
		
	}


	public void changeId(int x) {
		this.id = x;
		
	}


	
}
