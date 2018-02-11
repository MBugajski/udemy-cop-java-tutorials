import java.io.Serializable;

//Serializing - turning java object files into binary data. 

//You need to implement this interface:
public class  Person implements Serializable {
	
	//This is an ID that limits you to reading the written objects with the very same class you wrote them with. 
	//You can use it to stop people from trying to read the objects written with the old version of the class if there have been significant changes, 
	//by simply changing the ID.
	
	//private static final long serialVersionUID = 4801633306273802062L;
	private int id;
	private String name;
	
	public Person(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + "]";
	}
}
