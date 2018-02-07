
public class App {
	public static void main(String[] args) {
		
		//
		byte byteValue = 20;
		short shortValue = 55;
		int intValue = 999;
		long longValue = 1912354;
		
		//any value with decimal is automatically a 'double'. you need to write 'f' at the end to convert it into a float if you want one
		float floatValue = 695.556f;
		double doubleValue = 123211.5;
		
		System.out.println("Byte: " + Byte.MAX_VALUE);
		System.out.println("Short: " + Short.MAX_VALUE);
		System.out.println("Int: " + Integer.MAX_VALUE);
		System.out.println("Long: " + Long.MAX_VALUE);
		System.out.println("Float: " + Float.MAX_VALUE);
		System.out.println("Double: " + Double.MAX_VALUE);
		//You need to do it on the class, like above (static method, you dumbass)
		//System.out.println(doubleValue.MAX_VALUE);
		
		
		//CASTING - changing one type of the numerical value into another

		//casting "down" is mostly automatic
		longValue = intValue;
		//but to cast up (assuming it "fits") you'll need to do this:
		//intValue = longValue
		intValue = (int)longValue;
		
		//You can also use it to force a value type to accept too big of a value:
		//byteValue = 128;
		byteValue = (byte)128;
		System.out.println(byteValue); /*it will 'wrap around' to the minimum value: -128)*/
	}
}
