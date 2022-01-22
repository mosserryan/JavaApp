package oop.constructors;

public class Main {

	public static void main(String[] args) {
		
		Human humanOne = new Human("Ryan", 28, 145.00);
		Human humanTwo = new Human("Alie", 29, 100.00);
		
		humanTwo.greeting();
		humanOne.greeting();
		
		humanOne.eat();
		humanOne.sleep();
		
		System.out.println(humanOne.name);
		
	}
	
}
