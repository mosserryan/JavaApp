package tech.chairforce.app;
import java.util.ArrayList;

public class ListArray {
	
	// ArrayList: are a resizable array. Meaning, elements can be added and removed after the compilation phase. But only store Reference data types.
	
	public static void main(String[] args) {
		
		
		ArrayList<String> food = new ArrayList<String>();
		
//		food.add("Pizza");
//		food.add("Hotdog");
//		food.add("Hamburger");
		
		// food.set(0, "Salad");
		
		String[] array = {"Pizza", "Hotdog", "Hamburger"};
		
		addFood(array, food);
		getFood(food);
		System.out.println("Now we set and remove.");
		setFood(food);
		removeFood(food);
		getFood(food);
		food.clear();
		System.out.println(food);
		
	}
	
	public static void addFood(String[] array, ArrayList<String> food) {
		
		for(int i = 0; i < array.length; i++) {
			food.add(array[i]);
		}
		
	}
	
	public static void getFood(ArrayList<String> food) {
		
		for(int i = 0; i < food.size(); i++) {
			System.out.println(i + " " + food.get(i));
		}
		
	}
	
	public static void setFood(ArrayList<String> food) {
		
		food.set(0, "Salad");
		
	}
	
	public static void removeFood(ArrayList<String> food) {
		
		food.remove(2);
		
	}
	

}
