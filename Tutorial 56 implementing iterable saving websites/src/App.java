import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class App {
	public static void main(String[] args) {
		
		
		UrlLibrary urlLibrary = new UrlLibrary();
		int index = 0;
		for(String html: urlLibrary) {
			String filename = urlLibrary.getUrls().get(index).split("\\.")[1]+".html";
			
			File file = new File(filename);
			try(BufferedWriter bw = new BufferedWriter(new FileWriter(file))){
				bw.write(html);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			index++;
			
						
		}
	}
}
