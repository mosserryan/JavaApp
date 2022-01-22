package GlobalVsLocal;

public class Main {

	public static void main(String [] args) {
		
		// Local: Declared inside a method. Visible only to that method.
		
		// Global: Declared outside a method, but within a class. Visible to all parts of a class.
		
		DiceRollerLocal rollLocal = new DiceRollerLocal();
		DiceRollerGlobal rollGlobal = new DiceRollerGlobal();
		
		rollGlobal.roll();
		
	}
	
}
