package tech.chairforce.app;
import java.util.Scanner;


public class ScannerApp {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("What is your name?");
		String name = scanner.nextLine();
		System.out.println("Hello " + name + "!");
		System.out.println("What is your age?");
		int age = scanner.nextInt();
		scanner.nextLine();
		System.out.println("You are " + age + " years of age.");
		System.out.println("What is your favorite color?");
		String color = scanner.nextLine();
		System.out.println("Your favorite color is " + color + ".");
		System.out.println("Processing...");
		System.out.println("Well hello " + name + " who is " + age + " years of age. I like the color " + color + " too!");
		

	}

}
