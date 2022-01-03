package tech.chairforce.app;

public class MyApp {
	
	public static void main(String[] args) {
		
		String x = "Water";
		String y = "Juice";
		
		System.out.println("variable x is: " + x);
		System.out.println("variable y is: " + y);
		
		switchVars(x,y);	
		
	}
	
	private static void switchVars(String x, String y) {
		
		System.out.println("Switching values...");
		
		// Switching variable value by creating a "temp" holder variable.
		String temp;
		temp = x;
		x = y;
		y = temp;
		
		System.out.println("Switched!");
		System.out.println("variable x is: " + x);
		System.out.println("variable y is: " + y);
		
	};
	
	
}
