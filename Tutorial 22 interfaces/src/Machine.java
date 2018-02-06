//keyword'implements' forces the class to have all the methods names in the called interface
public class Machine implements Info {
	private int id = 7;
	
	
	

	public void start() {
		System.out.println("Machine starting!");
	}

	@Override
	public void showInfo() {
		System.out.println("Machine ID is: "+ id);
		// TODO Auto-generated method stub
		
	}

	@Override
	public void changeId(int y) {
		this.id = y;
		
	}

}
