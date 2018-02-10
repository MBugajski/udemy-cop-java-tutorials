import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.ParseException;

public class Test {
	//separate possible exceptions with comas
	public void run() throws IOException, ParseException {
		//throw new IOException();
		
		throw new ParseException("Error in command list", 6);
		
	}
	
	public void input() throws IOException, FileNotFoundException {
		
	}
}
