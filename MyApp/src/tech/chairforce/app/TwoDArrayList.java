package tech.chairforce.app;
import java.util.*;

public class TwoDArrayList {

	public static void main(String[] args) {
		
		ArrayList<ArrayList<String>> fullOrder = new ArrayList<ArrayList<String>>();
		ArrayList<String> foodOrder = new ArrayList<String>();
		ArrayList<String> condimentsOrder = new ArrayList<String>();
		
		String menuItems[] = {"Hamburger", "Fries", "Soda"};
		String condiments[] = {"Ketchup","Mayonaise","Mustard"};
		
		addFood(foodOrder, menuItems);
		addCondiments(condimentsOrder, condiments);
		combineOrder(fullOrder, foodOrder, condimentsOrder );
		
		
	}
	
	public static void addFood(ArrayList<String> foodOrder, String menuItems[]) {
				
		for(int i = 0; i < menuItems.length; i++) {
			
			foodOrder.add(menuItems[i]);
			System.out.println("Current food item being added to the list: " + menuItems[i]);
			
		}
		
		System.out.println(foodOrder);
				
	}
	
	public static void addCondiments(ArrayList<String> condimentsOrder, String condiments[]) {
		
		for(int i = 0; i < condiments.length; i++) {
			
			condimentsOrder.add(condiments[i]);
			System.out.println("Requesting: " + condiments[i]);
			
		}
		
		
		// Just making the list look nicer when calling it.
		String condimentsCollection = null;
		
		for(int i = 0; i < condimentsOrder.size(); i++) {
			
			if(condimentsCollection != null) {
				condimentsCollection = condimentsCollection + ", " + condimentsOrder.get(i);
			} else {
				condimentsCollection = condimentsOrder.get(i);
			}
					
		}
		
		System.out.println(condimentsCollection);
		
	}
	
	
	public static void combineOrder(ArrayList<ArrayList<String>> fullOrder, ArrayList<String> foodOrder, ArrayList<String> condimentsOrder) {
		
		fullOrder.add(foodOrder);
		fullOrder.add(condimentsOrder);
		
		String allItems = null;
				
			for(int i = 0; i < fullOrder.size(); i++) {
				
				for(int j = 0; j < fullOrder.get(i).size(); j++) {
					
					System.out.println(fullOrder.get(i).get(j));
					
					// Check for null, run until j equal the array's size. // Now we check if we're on the last array of the 2D arrays.
					if(allItems != null && j < fullOrder.get(i).size() - 1 || allItems != null && i != fullOrder.size() - 1) {
						
						allItems = allItems + ", " + fullOrder.get(i).get(j);
						
					} else if (j == fullOrder.get(i).size() - 1 && i == fullOrder.size() - 1) {
						
						allItems = allItems + ", and " + fullOrder.get(i).get(j) + ".";
						
					} else {
						
						allItems = fullOrder.get(i).get(j);
						
					}
					
				}
				
			}
			
			System.out.println(allItems);
			
		}
		
		
		
		
	}
	

