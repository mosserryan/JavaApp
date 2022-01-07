package tech.chairforce.app;
import java.util.Scanner;


public class ScannerApp {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		// Ask for name.
		System.out.println("What is your name?");
		// name equals the user's input of name from console.
		String name = scanner.nextLine();
		System.out.println("Hello " + name + "!");
		
		// Asking for age.
		System.out.println("What is your age?");
		// age equals the user's input of age from console.
		int age = scanner.nextInt();
		// Because the nextInt() method does not read the next line character produced when press "enter" in the console. 
		// We have to force it to read the next line by running the nextLine() method on it's own afterwards.
		scanner.nextLine();
		System.out.println("You are " + age + " years of age.");
		
		// Asking user for favorite color.
		System.out.println("What is your favorite color?");
		// color equals the user's input of age from the console.
		String color = scanner.nextLine();
		System.out.println("Your favorite color is " + color + ".");
		
		// Now all the data that is stored in our variables is spit out.
		System.out.println("Processing...");
		System.out.println("Well hello " + name + " who is " + age + " years of age. I like the color " + color + " too!");
		

	}

}
