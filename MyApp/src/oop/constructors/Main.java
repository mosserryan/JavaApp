package oop.constructors;

public class Main {

	public static void main(String[] args) {
		
		Human human = new Human("Ryan", 28, 145.00);
		
		human.greeting();
		
		System.out.println(human.name);
		
	}
	
}
