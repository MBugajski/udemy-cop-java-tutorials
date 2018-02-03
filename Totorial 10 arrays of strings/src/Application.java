
public class Application {
	public static void main(String[] args) {
		
		String[] words = new String[3];
		
		words[0] = "hello";
		words[1] = "to";
		words[2] = "you";
		
		System.out.println(words[2]);
		
		String[] fruits = {"apple", "banana", "kiwi", "pear"};
		
		for (String oneFruit: fruits) {	/*Java will set a value of each element of 'fruits' array to the declared strings "oneFruit' in turn*/
			System.out.println(oneFruit);
		}
		
		int value = 0; /*int is a primitive value*/
		
		String text = null; /*String is not a primitive value, but a class, hence the capital letter at the start. 'text' here is  */
					/* just an "address" and a default value of text is null*/	
	
		String[] texts = new String[2]; /*java assigns those 2 elements default values of null and they are just references as above */
		System.out.println(texts[0]);
		
		texts[0] = "one";
		System.out.println(texts[0]);
		
	}
}

