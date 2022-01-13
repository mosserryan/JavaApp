package tech.chairforce.app;

public class StringMethods {
	
	//String is a reference data type that can store one or more characters.
	//Reference data types have access to useful methods.
	
	public static void main(String[] args) {
	
		String name = "Jerry";
		
		boolean result = name.equals("Jerry"); //This returns true "case sensitive"
		System.out.println(result);
		
		boolean ignoreCaseResult = name.equalsIgnoreCase("jerry");// Compares strings and is not case sensitive.
		System.out.println(ignoreCaseResult);
		
		int nameLength = name.length(); // Give you the length of the string.
		System.out.println(nameLength);
		
		char singleCharacter = name.charAt(0); // Returns the character of the inputed index.
		System.out.println(singleCharacter);
		
		int characterIndex = name.indexOf("r"); // Returns the index of the first instance of the given character.
		System.out.println(characterIndex);
		
		boolean isStringEmpty = name.isEmpty(); // Checks to see if string is empty. True or False.
		System.out.println(isStringEmpty);
		
		String upperCaseString = name.toUpperCase(); // Turns all characters in string to upper case letters.
		System.out.println(upperCaseString);
		
		String lowerCaseString = name.toLowerCase(); // Turns all characters in the string to lower case letters.
		System.out.println(lowerCaseString);
		
		String emptySpace = "  Look at this empty space!   "; // Trims before and after the text begins
		String trimEmptySpace = emptySpace.trim();
		System.out.println(trimEmptySpace);
		
		String replaceCharacters = name.replace("r", "b"); // Replace the selected character in the string (all instances) with the characters of your choosing. I choose to replace "r" with "b".
		System.out.println(replaceCharacters);
		
	}
	
}
