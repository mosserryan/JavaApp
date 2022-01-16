package tech.chairforce.app;

import java.util.ArrayList;

public class ForEach {

	public static void main(String[] args) {
		
		ArrayList<String> animalList = new ArrayList<String>();
		
		String[] animalBank = {"Zebra", "Cat", "Dog", "Chicken"};
		
		addAnimals(animalList, animalBank);
		convertToString(animalList);
		
	}
	
	public static void addAnimals(ArrayList<String> animalList, String[] animalBank) {
		
		for(String i : animalBank) {
			
			animalList.add(i);
			
		}
		
		System.out.println(animalList);
		
	}
	
	public static void convertToString(ArrayList<String> animalList) {
		
		String animalString = "";
		
		int counter = 1;
		
		for(String i : animalList) {
					
			if(counter < animalList.size() && animalString != "") {
				animalString = animalString + ", " + i;	
			}
			
			if (counter == animalList.size()) {
				animalString = animalString + ", and " + i;	
			}
			
			if (animalString == "") {
				animalString = i;
			}
					
			counter++;
		}
		
		System.out.println(animalString + ".");
		
	}
	
}
