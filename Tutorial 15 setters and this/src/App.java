class Frog {
	private String name;
	private int age;
	
	
	//Setter methods
	
	public void setName(String newName) {
		name = newName;
	}
	public void setAge(int newAge) {
		age = newAge;
	}
	//Using just 'name' would access the closest one, a local variable name in this case. To access 'instance variable' use this.<variable>.
	public void setThisName(String name) {
		this.name = name;
	}
	public void setThisAge(int age) {
		this.age = age;
	}

	//Getter methods
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	
	
	public void setInfo(String name, int age) {
		setName(name);
		setAge(age);
	}
	
}


public class App {
	public static void main(String[] args) {
		
		Frog frog1 = new Frog();
		
		frog1.setThisName("Arny");
			//Both variables are now set to private can can't be accessed from outside of the class they're in. Use setters and getters instead.
		//frog1.name = "Bertie";
		//frog1.age = 3;
		System.out.println(frog1.getName());
		frog1.setInfo("Arnold", 4);
		System.out.println(frog1.getName());
		System.out.println(frog1.getAge());
	}
	
}
