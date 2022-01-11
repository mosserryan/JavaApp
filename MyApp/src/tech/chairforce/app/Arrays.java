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
	
	public static void twoDArray() {
		
		String[][] animals = new String[3][3];
		
		animals[0][0] = "Cat";
		animals[0][1] = "Dog";
		animals[0][2] = "Bird";
		animals[1][0] = "Fish";
		animals[1][1] = "Hog";
		animals[1][2] = "Bat";
		animals[2][0] = "Monkey";
		animals[2][1] = "Bear";
		animals[2][2] = "Zebra";
		
		for(int i = 0; i < animals.length; i++) {
			System.out.println();
			for(int j = 0; j < animals.length; j++) {
				System.out.print(animals[i][j] + " ");
			}

		}
		
	}
	
}
