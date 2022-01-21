package oop.app;

public class Main {

public static void main(String[] args) {
		
	String make = "The make is ";
	String model = "The model is ";
	
	Car myCar = new Car();
	
	System.out.println(make + myCar.make);
	System.out.println(model + myCar.model);
	
	myCar.drive();
	myCar.brake();
		
	}
	
	
	
}
