class Plant {
	
	private String name;
	private boolean alive = true;
	public static final int ID = 7;
	
	
	//Only public methods should be one the end user is supposed to use. Everything else should be private, protected or package-access, depending on needs. 
	public String gerData() {
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

	
	
	
}


public class App {
	public static void main(String[] args) {
		System.out.println(Plant.getId());
	}
}
