
public class FuzzBuzz {
	public static void main(String[] args) {
		
		for (int i=1; i<=100; i++) {
			if (i%5==0 & i%3==0) {
				System.out.println("fuzzbuzz");
			} else if (i%3==0) {
				System.out.println("fuzz");
			} else if (i%5==0) {
				System.out.println("buzz");
			} else {
				System.out.println(i);
			}
		}
	}
}
