package tech.chairforce.app;

public class NumbersApp {
	
	public static void main(String[] args) {
		int friends = 10;
		int modulus;
		int division;
		int addition;
		int subtraction;
		double decimal;
		
		// Operators
		modulus = friends % 3; // Remainder
		division = friends / 3; // No remainder
		addition = friends++; // Or addition = friends + 1
		subtraction = friends; // Or subtraction = friends - 1
		decimal = friends - 9.2; // A decimal value (Stored in double)
		
		
		
		System.out.println(friends);
		System.out.println(modulus);
		System.out.println(division);
		System.out.println(addition);
		System.out.println(subtraction);
		System.out.println(decimal);
	}
	
}
