package OverloadingConstructors;

public class Main {

	public static void main(String[] args) {
		
		Pizza pizzaOne = new Pizza("mozzarella", "tomato", "pepperoni", "thin Crust");
		Pizza pizzaTwo = new Pizza("mozzarella", "tomato", "thin Crust");
		Pizza pizzaThree = new Pizza("tomato", "thin Crust");
		
		pizzaOne.prepPizza();
		pizzaTwo.prepPizza();
		pizzaThree.prepPizza();
		
		pizzaOne.cookPizza();
		pizzaTwo.cookPizza();
		pizzaThree.cookPizza();
		
		pizzaOne.isReady();
		pizzaTwo.isReady();
		pizzaThree.isReady();
		
	}
	
}
