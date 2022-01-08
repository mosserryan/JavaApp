package tech.chairforce.app;
import java.util.Random;

public class RandomNumbers {

	public static void main(String[] args ) {
		
		Random random = new Random();
		
		int x = random.nextInt(10);
		double y = random.nextDouble(10);
		boolean z = random.nextBoolean();
		
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
		
	}
	
}
