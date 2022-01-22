package oop.constructors;

public class Human {
	
	 String name;
	 int age;
	 double weight;

	Human(String name, int age, double weight) {
		
		this.name = name;
		this.age = age;
		this.weight = weight;
		
	}

	void greeting() {
		System.out.println("Hello there! My name is " + name);
	}
	
	void eat() {
		System.out.println(name + " is eating.");
	}
	
	void sleep() {
		System.out.println(name + " is sleeping now.");
	}
	
}
