package tech.chairforce.app;
import java.util.ArrayList;

public class ListArray {
	
	// ArrayList: are a resizable array. Meaning, elements can be added and removed after the compilation phase. But only store Reference data types.
	
	public static void main(String[] args) {
		
		
		ArrayList<String> food = new ArrayList<String>();
		
		food.add("Pizza");
		food.add("Hotdog");
		food.add("Hamburger");
		
		for(int i = 0; i < food.size(); i++) {
			System.out.println(food.get(i));
		}
		
	}

}
