package tech.chairforce.app;
import java.util.Scanner;

public class ForLoop {
	
	public static void main(String[] args) {
		
		nestLoop();		
		/*
		 * for(int i = 10; i >= 0; i--) { System.out.println(i); }
		 * 
		 * System.out.println("Happy New Year!");
		 */
		
	}
	
	public static void nestLoop () {
		Scanner scanner = new Scanner(System.in);
		int rows;
		int columns;
		String symbol;
		
		System.out.println("Enter # of rows: ");
		rows = scanner.nextInt();
		System.out.println("Enter # of columns: ");
		columns = scanner.nextInt();
		System.out.println("Enter sysmbol ");
		symbol = scanner.next();
		
		for(int i = 1; i < rows; i++) {
			
			System.out.println();
			
			for(int j = 1; j < columns; j++) {
				
				System.out.print(symbol);
				
			}
			
		}
		
	}
	
}
