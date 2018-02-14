import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

public class App {
	public static String[] vehicles = {
		"ambulance", "helicopter", "lifeboat"	
	};
	
	public static String[][] drivers = {
			{"Fred", "Sue", "Pete"},
			{"Sue", "Richard", "Bob", "Fred"},
			{"Pete", "Mary", "Bob"}
	};

	
	
	public static void main(String[] args) {
		
		//We want to look up things by the string rather than index, so we're going to use a Map, rather than a List.
		//We don't need it sorted either
		
		Map<String, Set<String>> personel = new HashMap<String, Set<String>>();
		
		for(int i=0; i < vehicles.length; i++) {
			String vehicle = vehicles[i];
			String[] driverList = drivers[i];
			for (String driver : driverList) {
				System.out.println("A "+vehicle+ " can be driven by "+driver + ".");
			}
			LinkedHashSet<String> driverSet = new LinkedHashSet<String>();
			
			for(String driver : driverList) {
				driverSet.add(driver);
			}
			System.out.println(driverSet);
			personel.put(vehicle, driverSet);
			
		}
		System.out.println(personel);
		
		//iterate through the whole thing
		
		for(String vehicle : personel.keySet()) {
			Set<String> driverList = personel.get(vehicle);
			System.out.println("-->"+vehicle);
			for(String driver : driverList) {
			//We can either declare a variable like with driverList above or encapsulate it within the 'for each' loop:
//			for(String driver : personel.get(vehicle)) {
				System.out.println(driver);
			}
			
		}
		
		
		
	}
}
