package GlobalVsLocal;

import java.util.Random;

public class DiceRollerLocal {

	// Local way of doing this
	DiceRollerLocal() {
		
		// If declaring locally then we need to manually pass in the information into the method.
		Random random = new Random();
		int number = 0;
		roll(number, random);
		
	}
	
	void roll(int number, Random random) {
		
		number = random.nextInt(6) + 1;
		System.out.println(number);
		
	}
	
}
