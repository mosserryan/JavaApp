package tech.chairforce.app;

public class Arrays {
	
	public static void main (String[] args) {
		
		String[] myArray = {"one", "two", "three"};
		
		System.out.println(myArray[1]);
		
		String[] cars = new String[3]; // Means it cannot exceed the limit of three.
		
		cars[0] = "Subi";
		cars[1] = "Lambo";
		cars[2] = "Jeep";
		
		for(int i = 0; i < cars.length; i++) {
			System.out.println(cars[i]);
		}
		
	}
	
}
