package tech.chairforce.app;

public class StringMethods {
	
	//String is a reference data type that can store one or more characters.
	//Reference data types have access to useful methods.
	
	public static void main(String[] args) {
	
		String name = "Ryan";
		
		boolean result = name.equals("Ryan"); //This returns true "case sensitive"
		System.out.println(result);
		
		boolean ignoreCaseResult = name.equalsIgnoreCase("ryan");
		System.out.println(ignoreCaseResult);
		
	}
	
}
