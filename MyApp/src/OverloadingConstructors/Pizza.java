package OverloadingConstructors;

public class Pizza {

	String cheese;
	String sauce;
	String toppings;
	String crust;
	
	Pizza(String cheese, String sauce, String toppings, String crust) {
		
		this.cheese = cheese;
		this.sauce = sauce;
		this.toppings = toppings;
		this.crust = crust;
		
	}
	
	Pizza(String cheese, String sauce, String crust) {
		
		this.cheese = cheese;
		this.sauce = sauce;
		this.crust = crust;
		
	}
	
	Pizza(String sauce, String crust) {
		
		this.sauce = sauce;
		this.crust = crust;
		
	}
	
	void prepPizza() {
		
		if(this.cheese != null && this.toppings != null) {
			System.out.println("Prepping the following ingredients: " + this.cheese + ", " + this.sauce + ", " + this.toppings + ", and " + this.crust + ".");
		} else if (this.cheese != null && this.toppings == null) {
			System.out.println("Prepping the following ingredients: " + this.cheese + ", " + this.sauce + ", and " + this.crust + ".");
		} else {
			System.out.println("Prepping the following ingredients: " + this.sauce + " and " + this.crust + ".");
		}
		
		
	}
	
	void cookPizza() {
		if(this.cheese != null && this.toppings != null) {
			System.out.println("Cooking up the " + this.cheese + " and " + this.toppings + " pizza with a " + this.sauce + " sauce and a " + this.crust + ".");
		} else if (this.cheese != null && this.toppings == null) {
			System.out.println("Cooking up the " + this.cheese + " pizza with " + this.sauce + " sauce and a " + this.crust + ".");
		} else {
			System.out.println("Cooking up the vegan pizza with " + this.sauce + " sauce and a " + this.crust + ".");
		}
	}
	
	void isReady() {
		
		if(this.cheese != null && this.toppings != null) {
			System.out.println("The " + this.cheese + " and " + this.toppings + " pizza is ready!");
		} else if (this.cheese != null && this.toppings == null) {
			System.out.println("The " + this.cheese + " cheese pizza is ready!");
		} else {
			System.out.println("The vegan pizza is ready!");
		}
		
	}
	
}
