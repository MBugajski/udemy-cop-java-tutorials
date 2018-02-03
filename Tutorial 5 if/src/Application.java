
public class Application {
	public static void main(String[] args) {
		
//		if else loop
		
		int myInt = 5;
		
		if(myInt <= 4 ) {
			System.out.println("Duh!");
		}
		else if(myInt > 100) {
			System.out.println("Pff!");
		}
		else {
			System.out.println("Meh!");
		}
		
		int  loop = 0;
		
//		while if loop
		
		while(true) {
			System.out.println("Looping: " + loop);
			
			if(loop == 5) {
				break;
			}
			
			loop++;
		}
	}
}
