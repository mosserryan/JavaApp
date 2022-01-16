package tech.chairforce.app;

public class Printf {

	public static void main(String[] args) {
		
		String name = "Ryan";
		int age = 28;
		System.out.printf("Hello there my name is %s and my age is %d what is your name?", name, age);
		System.out.printf("Hello there my name is %10s and my age is %-10d what is your name?", name, age);
		
	}
	
}
