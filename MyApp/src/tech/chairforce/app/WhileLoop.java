package tech.chairforce.app;
import java.util.Scanner;

public class WhileLoop {
	
	public static void main (String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		String name = "";
		
		doFirst(name, scanner);
		
	}
	
	public static void whileFirst(String name, Scanner scanner) {
		while(name.isBlank()) {
			System.out.print("Enter your name: ");
			name = scanner.nextLine();
		}
		
		System.out.println("Hello " + name);
	}
	
	public static void doFirst(String name, Scanner scanner) {
		// Will execute the lines of code before checking the while loop condition. So it run at least once no matter what.
		do {
			System.out.print("Enter your name: ");
			name = scanner.nextLine();
		} while(name.isBlank());
		
		System.out.println("Hello " + name);
		
	}
	
}
