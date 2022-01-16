package tech.chairforce.app;

public class OverLoadedMethods {

	public static void main(String[] args) {
		
		int three = add(1, 3, 5);
		int four = add(5, 7, 9, 3);
		double threeDouble = add(3.14, 0.978, .121);
		
		System.out.println(three);
		System.out.println(four);
		System.out.println(threeDouble);
		
	}
	
	static int add(int a, int b, int c) {		
		
		return a + b + c;
		
	}
	static int add(int a, int b, int c, int d) {		
		
		return a + b + c;
		
	}
	static double add(double a, double b, double c) {		
		
		return a + b + c;
		
	}
	
}
