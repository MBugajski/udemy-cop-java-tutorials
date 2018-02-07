class Plant {
	
	private String name;
	private boolean alive = true;
	private static int count = 7;
	//finals can be public, as there no danger of cross-linkage/spagetti code 
	public static final int ID = 7;
	
	
	//Only public methods should be one the end user is supposed to use. Everything else should be private (always if possible!), protected or package-access, depending on needs. 
	public String getData() {
		String data = "sone stuff" + calculatedGrowthForecast();
		return data;
	}
	
	//example of private method feeding some data internally within the class
	private int calculatedGrowthForecast() {
		return ID + 7;
	}
	
	//r-click -> Source -> Generate Setters and Getters

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isAlive() {
		return alive;
	}

	public void setAlive(boolean alive) {
		this.alive = alive;
	}

	//variable ID is final so only a getter is generated
	public static int getId() {
		return ID;
	}

	//Idea is to hide the inner workings of the app within classes and only provide a public API - Application Programming Interface
	//You don't want tightly coupled classes - classes calling eachother stuff all the time (creates tangled mess)
	
	
}


public class App {
	public static void main(String[] args) {
		System.out.println(Plant.getId());
	}
}
