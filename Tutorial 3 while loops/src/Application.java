
public class Application {
	public static void main(String[] args) {
		
		int value = 0;
		boolean loop = value < 5;
		
		while(value < 20)
		{
			System.out.println("Ops"+ value);
			
			value = value + 1;
		}
		
		System.out.println(loop);
	}
}
