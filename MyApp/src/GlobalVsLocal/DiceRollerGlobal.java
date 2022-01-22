package GlobalVsLocal;
import java.util.Random;
public class DiceRollerGlobal {

	int number = 0;
	Random random = new Random();
	
	DiceRollerGlobal() {
		
		roll();
		
	}
	
	void roll() {
		number = random.nextInt(6) + 1;
		System.out.println(number);
	}
	
}
