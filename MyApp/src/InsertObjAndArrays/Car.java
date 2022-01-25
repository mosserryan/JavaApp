package InsertObjAndArrays;

public class Car {

	String model;
	String make;
	String color;
	
	Car(String color, String make, String model) {
		
		this.color = color;
		this.make = make;
		this.model = model;
		
	}
	
	public String toString() {
		
		String myString = color+" "+make+" "+model;
		
		return myString;
		
	}
	
}
