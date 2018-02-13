import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Iterator;
import java.util.LinkedList;

public class UrlLibrary implements Iterable<String> {
	private LinkedList<String> urls = new LinkedList<String>();
	
	public UrlLibrary() {
		urls.add("https://www.reddit.com");
		urls.add("https://www.gwentdb.com");
		urls.add("https://www.stackoverflow.com");
		urls.add("http://www.metamechs.com");
		urls.add("http://www.snafets.de");
	}
	
	public LinkedList<String> getUrls() {
		return urls;
	}

	public void setUrls(LinkedList<String> urls) {
		this.urls = urls;
	}

	private class UrlIterator implements Iterator<String> {
		
		private int index;
		
		
		@Override
		public boolean hasNext() {
			return index < urls.size()	;
		}

		@Override
		public String next() {
			StringBuilder sb = new StringBuilder();
			try {
				URL url = new URL(urls.get(index));
				BufferedReader br = new BufferedReader(new InputStreamReader(url.openStream()));
				
				
				
				String line;
				
				while((line = br.readLine()) !=null) {
					sb.append(line);
					sb.append("\n");
				}
				br.close();
			} catch (MalformedURLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
					
			index++;
			return sb.toString();
		}
		
		@Override	
		public void remove() {
			urls.remove(index);
		}
	}
	
/*
	@Override
	public Iterator<String> iterator() {
		return urls.iterator();
	}
*/

	@Override
	public Iterator<String> iterator() {
		return new UrlIterator();
	}
	
}
